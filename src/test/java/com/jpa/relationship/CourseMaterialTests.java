package com.jpa.relationship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseMaterialTests {


	@Autowired
	CourseMaterialRepository courseMaterialRepository;
	@Test
	void saveCourseMaterial() {
		Course course = Course.builder().credit(6).name("DSA").build();
		CourseMaterial courseMaterial = CourseMaterial.builder().url("www.7span.in/apply").course(course).build();
		courseMaterialRepository.save(courseMaterial);

	}
	@Test
	void getCourseMaterial(){
		List<CourseMaterial> courseMaterialList = courseMaterialRepository.findAll();
		System.out.println("courseMaterialList :: " + courseMaterialList);


		//To access lazy loaded object you need to add property in property file
		/*System.out.println("course :: " + courseMaterialList.get(0).getCourse());*/
	}

}
