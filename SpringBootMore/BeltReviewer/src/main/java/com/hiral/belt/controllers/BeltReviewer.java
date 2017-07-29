package com.hiral.belt.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hiral.belt.models.Guild;
import com.hiral.belt.models.Ring;
import com.hiral.belt.models.Role;
import com.hiral.belt.models.User;
import com.hiral.belt.services.GuildService;
import com.hiral.belt.services.RingService;
import com.hiral.belt.services.RoleService;
import com.hiral.belt.services.UserService;
import com.hiral.belt.validator.UserValidator;

@Controller
@RequestMapping("/")
public class BeltReviewer {
	private UserService userService;
	private RoleService roleService;
	private UserValidator userValidator;
	private RingService ringService;
	private GuildService guildService;

	public BeltReviewer(UserService userService, UserValidator userValidator, RoleService roleService,
			RingService ringService, GuildService guildService) {
		this.userService = userService;
		this.userValidator = userValidator;
		this.roleService = roleService;
		this.ringService = ringService;
		this.guildService = guildService;
	}

	@PostMapping("/registration")
	public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model,
			HttpSession session, RedirectAttributes flash) {
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			return "registration";
		}

		if (userService.findByUsername(user.getUsername()) != null
				|| userService.findByEmail(user.getEmail()) != null) {
			flash.addFlashAttribute("userExists", "User already exists");
			return "redirect:/registration";
		}
		if (roleService.findByName("ROLE_ADMIN").getUsers().size() < 1) {
			userService.saveUserWithAdminRole(user);
		} else {
			userService.saveWithUserRole(user);
		}

		return "redirect:/registration";
	}

	@RequestMapping({ "/registration", "/login" })
	public String login(@ModelAttribute("user") User user,
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		if (error != null) {
			model.addAttribute("errorMessage", "* Invalid Email or Password");
		}
		if (logout != null) {
			model.addAttribute("logoutMessage", "Logout Successfull!");
		}
		return "registration";
	}

	@RequestMapping(value = { "/", "/home" })
	public String home(Principal principal, Model model) {
		model.addAttribute("rings", ringService.findAdminRings());
		model.addAttribute("allUsers", userService.findAll());
		model.addAttribute("currentUser", userService.findByUsername(principal.getName()));
		return "home";
	}

	@RequestMapping("/ring/add/{id}")
	public String goToAddRing(@PathVariable("id") Long id, Model model, @ModelAttribute("ring") Ring ring) {
		if (userService.findById(id) == null) {
			return "redirect:/";
		}
		User user = userService.findById(id);
		if (!user.isAdmin()) {
			return "redirect:/";
		}
		model.addAttribute("user", user);
		return "createRing";
	}

	@PostMapping("/ring/add/{id}")
	public String addRing(@PathVariable("id") Long id, @Valid @ModelAttribute("ring") Ring ring, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/ring/add/" + id;
		}
		ring.setUser(userService.findById(id));
		ringService.createRing(ring);
		return "redirect:/";
	}

	@RequestMapping("/user/ring/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		ringService.deleteById(id);
		return "redirect:/";
	}

	@PostMapping("/user/ring/{id}")
	public String changeRingUser(@PathVariable("id") Long id, @RequestParam("ring") long ringId,
			RedirectAttributes flash, Model model, HttpSession session) {
		if (session.getAttribute("time") == null) {
			session.setAttribute("time", new Date().getTime());
		} else {
			if ((long) session.getAttribute("time") - new Date().getTime() < 5 * 60) {
				flash.addFlashAttribute("restrict", "You have to wait for 5 minute to get another ring!");
				return "redirect:/";
			} else {
				session.setAttribute("pickedUp", null);
			}
		}
		if (userService.findById(id).isAdmin()) {
			return "redirect:/";
		}
		ringService.findById(ringId).setUser(userService.findById(id));
		ringService.update(ringService.findById(ringId));
		return "redirect:/";
	}

	@RequestMapping("/guild/add/{id}")
	public String newGuild(@PathVariable("id") Long id, Model model, @ModelAttribute("guild") Guild guild) {
		if (userService.findById(id) == null) {
			return "redirect:/";
		}
		User user = userService.findById(id);
		if (!user.isAdmin()) {
			return "redirect:/";
		}
		ArrayList<Integer> li = new ArrayList<Integer>();
		for (User users : userService.findByRole()) {
			Date old = users.getCreatedAt();
			Date date = new Date();
			li.add(date.compareTo(old));
		}
		model.addAttribute("guilds", guildService.findAll());
		model.addAttribute("dates", li);
		model.addAttribute("currentUser", user);
		model.addAttribute("allUsers", userService.findByRole());
		return "createGuild";
	}

	@PostMapping("/guild/add/{id}")
	public String addGuild(@PathVariable("id") Long id, @Valid @ModelAttribute("guild") Guild guild,
			BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/guild/add/" + id;
		}
		guildService.addGuild(guild);
		return "redirect:/guild/add/" + id;
	}

	@RequestMapping("/user/makeAdmin/{id}/{adminId}")
	public String makeAdmin(@PathVariable("id") Long id, @PathVariable("adminId") Long adminId) {
		User user = userService.findById(id);
		if (!user.isAdmin()) {
			List<Role> role = user.getRoles();
			role.add(roleService.findByName("ROLE_ADMIN"));
			userService.update(user);
		}
		return "redirect:/guild/add/" + adminId;
	}

	@RequestMapping("/user/delete/{id}/{adminId}")
	public String deleteUser(@PathVariable("id") Long id, @PathVariable("adminId") Long adminId) {
		User user = userService.findById(id);
		if (user.isAdmin()) {
			return "redirect:/guild/add/" + adminId;
		}
		ringService.deleteRingByUser(id);
		roleService.deleteRole(id);
		userService.deleteById(id);
		return "redirect:/guild/add/" + adminId;
	}
}
