package com.sg.scores.repo;

import static org.assertj.core.api.Assertions.assertThat;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sg.scores.entity.Course;
import com.sg.scores.entity.Hole;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class CourseRepoTest {

	@Autowired TestEntityManager entityManager;

	@Autowired CourseRepository courseRepository;

	@Autowired DataSource ds; 
	
	@Test
	void test() {
		
		Course hgc = new Course(
				"HGC", 
				new Hole(1, 4), new Hole(2, 4), new Hole(3, 4), new Hole(4,4), new Hole(5, 4), new Hole(6,3), new Hole(7,4), new Hole(8,5), new Hole(9,3), 
				new Hole(10, 4), new Hole(11,4), new Hole(12,5), new Hole(13,3), new Hole(14,4), new Hole(15, 4), new Hole(16, 4), new Hole(17, 3), new Hole(18, 4));
		
		
		courseRepository.save(hgc);
		
		Course course = courseRepository.findByName("HGC");
			
		assertThat(course.getName()).isEqualTo("HGC");
		
		assertThat(course.getEighteen().getPar().equals(4));
		
	}
	
//	@TestConfiguration
//	@EnableJpaRepositories
//	@EnableTransactionManagement
//	static class JpaConfig {
//		
//		@Autowired
//		DataSource ds;
//		
//
//	}

}
