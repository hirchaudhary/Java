package com.hiral.belt.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hiral.belt.models.Guild;
import com.hiral.belt.repository.GuildRepository;

@Service
public class GuildService {
	private GuildRepository guildRepository;

	public GuildService(GuildRepository guildRepository) {
		this.guildRepository = guildRepository;
	}

	public void addGuild(Guild guild) {
		guildRepository.save(guild);
	}

	public List<Guild> findAll() {
		return (List<Guild>) guildRepository.findAll();
	}

}
