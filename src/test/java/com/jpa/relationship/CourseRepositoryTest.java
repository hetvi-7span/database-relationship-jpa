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

    /* in order to update course material using course repository we need to remove cascade type ALL as it includes merge in it,
    and we will face "Hibernate, Spring. Multiple representations of the same entity are being merged" this error*/
    @Test
    void updateCourseMaterial(){
        Long courseId = 2L;
        Course course = courseRepository.findById(courseId).get();
        System.out.println(course);
        System.out.println("Data of course material from course ::::::::: " + course.getCourseMaterial());

        course.setName("JAVAAAA");
        CourseMaterial updatedCourseMaterial = course.getCourseMaterial();
        updatedCourseMaterial.setUrl("www.google.com");
        course.setCourseMaterial(updatedCourseMaterial);

        System.out.println(course);


        Course save = courseRepository.save(course);
        System.out.println(save);


    }

    @Test
    void deleteCourse(){
        Long courseId = 1L;
        courseRepository.delete(courseRepository.findById(courseId).get());
    }

}