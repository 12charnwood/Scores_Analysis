package com.sg.scores.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.sg.scores.HGC;
import com.sg.scores.entity.Course;
import com.sg.scores.service.ScoresService;

@WebMvcTest(controllers=ScoresController.class)
public class CourseIntegrationTestWithMockedRepo {
	
	@MockBean 
	private ScoresService scoresService;
	
	
	@Autowired 
	private MockMvc mvc;
	
	@Test
	public void givenCourses_whenGetHGC_thenReturnHGC() throws Exception {
		
		Course hgc = HGC.hgc();
		
		Mockito.when(scoresService.findByName("HGC")).thenReturn(hgc);
		
		Matcher<String> hgcNameMatcher = Matchers.is("HGC");
		ResultMatcher jsonPathCourseNameMatcher = jsonPath("$.courseName", hgcNameMatcher);
		
		mvc.perform(get("/scores/course/HGC"))
		.andExpect(status().isOk())
		.andDo(print())
		.andExpect(jsonPath("$.holes[*]", Matchers.hasSize(18)))
		.andExpect(jsonPathCourseNameMatcher)
		.andReturn();
	}	
	
}
