package com.jpa.relationship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    CourseRepository courseRepository;

    @Test
    void getCourse(){
        List<Course> courseList = courseRepository.findAll();
       System.out.println("Course :: "+courseList.get(0).getName());
    }

}