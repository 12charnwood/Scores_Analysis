package com.sg.scores.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.sg.scores.entity.Course;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class CourseDto {
	
	private String courseName;

	private List<HoleDto> holes;
	
	public static CourseDto toDto(Course course) {
		return new CourseDto(
				course.getName(), 
				course.holesAsList().stream().map(
						h -> HoleDto.toDto(h)).collect(Collectors.toList())
				);		
	}
}
