package com.sg.scores.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sg.scores.entity.Course;
import com.sg.scores.repo.CourseRepository;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
@Component
public class ScoresService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	public void save(Course course) {
		courseRepo.save(course);
		
	}
	
	public Course findByName(String courseName) {
		return courseRepo.findByName(courseName);
	}
	

}
