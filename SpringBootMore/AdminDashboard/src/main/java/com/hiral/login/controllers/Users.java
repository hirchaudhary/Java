package com.hiral.login.controllers;

import java.security.Principal;
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

import com.hiral.login.models.Role;
import com.hiral.login.models.User;
import com.hiral.login.services.RoleService;
import com.hiral.login.services.UserService;
import com.hiral.login.validator.UserValidator;

@Controller
@RequestMapping("/")
public class Users {
	private UserService userService;
	private RoleService roleService;
	private UserValidator userValidator;

	public Users(UserService userService, UserValidator userValidator, RoleService roleService) {
		this.userService = userService;
		this.userValidator = userValidator;
		this.roleService = roleService;
	}

	@RequestMapping("/registration")
	public String registration(@ModelAttribute("user") User user) {
		return "registration";
	}

	@PostMapping("/registration")
	public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model,
			HttpSession session) {
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			return "registration";
		}
		if (roleService.findByName("ROLE_ADMIN").getUsers().size() < 1) {
			userService.saveUserWithAdminRole(user);
		} else {
			userService.saveWithUserRole(user);
		}

		return "redirect:/login";
	}

	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		if (error != null) {
			model.addAttribute("errorMessage", "Invalid Email or Password");
		}
		if (logout != null) {
			model.addAttribute("logoutMessage", "Logout Successfull!");
		}
		return "login";
	}

	@RequestMapping(value = { "/", "/home" })
	public String home(Principal principal, Model model) {
		String username = principal.getName();
		User user = userService.findByUsername(username);
		userService.update(user);
		model.addAttribute("currentUser", user);
		if (user.isAdmin()) {
			return "redirect:/admin";
		} else {
			return "home";
		}
	}

	@RequestMapping("/admin")
	public String adminPage(Principal principal, Model model) {
		String username = principal.getName();
		model.addAttribute("allUsers", userService.findAll());
		model.addAttribute("currentUser", userService.findByUsername(username));
		return "admin";
	}

	@RequestMapping("/user/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		userService.deleteById(id);
		return "redirect:/admin";
	}

	@RequestMapping("/user/makeAdmin/{id}")
	public String makeAdmin(@PathVariable("id") Long id) {
		User user = userService.findById(id);
		List<Role> role = user.getRoles();
		role.add(roleService.findByName("ROLE_ADMIN"));
		userService.update(user);
		return "redirect:/admin";
	}
}
