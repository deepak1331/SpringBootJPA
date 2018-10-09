package com.deepakEdu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.deepakEdu.dao.AlienRepository;
import com.deepakEdu.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepository repo;

	@RequestMapping("/")
	public String home() {
		return "result.jsp";
	}

	@RequestMapping(value = "/addAlien")
	public ModelAndView addAlien(Alien alien) {
		ModelAndView mv = new ModelAndView("result.jsp");
		mv.addObject(alien);
		repo.save(alien);
		return mv;
	}

	@RequestMapping(value = "/getAlien")
	public ModelAndView getAlien(@RequestParam String alienId) {
		ModelAndView mv = new ModelAndView("show.jsp");
		Alien alien = repo.findById(alienId).orElse(new Alien("", "Result Not Found", ""));
		mv.addObject(alien);
		return mv;
	}

	@RequestMapping(value = "/getAlienByTech")
	public ModelAndView addAlienByTech(@RequestParam String alienTech) {
		ModelAndView mv = new ModelAndView("showList.jsp");
		List<Alien> alien = repo.findByAlienTech(alienTech);
		mv.addObject(alien);
		return mv;
	}
}
