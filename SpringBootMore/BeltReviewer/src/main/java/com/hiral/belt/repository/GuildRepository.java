package com.hiral.belt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.belt.models.Guild;

@Repository
public interface GuildRepository extends CrudRepository<Guild, Long> {

}
