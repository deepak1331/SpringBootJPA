package com.deepakEdu.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.deepakEdu.model.Alien;

public interface AlienRepository extends CrudRepository<Alien, String> {

	public List<Alien> findByAlienTech(String tech);
}
