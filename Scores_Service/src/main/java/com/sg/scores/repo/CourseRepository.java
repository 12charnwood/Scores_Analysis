package com.sg.scores.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.scores.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
	
	public Course findByName(String name);
	
	
}
