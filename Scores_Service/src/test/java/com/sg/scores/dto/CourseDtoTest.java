package com.sg.scores.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sg.scores.HGC;
import com.sg.scores.entity.Hole;

class CourseDtoTest {

	@Test
	void test() {
		CourseDto dto = CourseDto.toDto(HGC.hgc());
				
		assertEquals("HGC", dto.getCourseName());
		assertEquals(18, dto.getHoles().size());
		
		HoleDto dtoOne =  dto.getHoles().get(0);
		
		assertEquals(1, dtoOne.getHoleNumber());
		assertEquals(4, dtoOne.getPar());
	}

}
