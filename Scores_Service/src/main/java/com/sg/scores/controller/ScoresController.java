package com.sg.scores.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sg.scores.dto.CourseDto;
import com.sg.scores.service.ScoresService;

@RestController
@RequestMapping("/scores")
public class ScoresController {
	
	@Autowired
	private ScoresService scoresService;
	
	
	@GetMapping(value="/course/{name}", produces="application/json")
	public CourseDto findByName(@PathVariable String name) {			
		return CourseDto.toDto(scoresService.findByName(name));		
	}
	
	
	
}
