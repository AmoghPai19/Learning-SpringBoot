package com.in28minutes.learn_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1,"Learn Microservices","in28minutes"));
    }

    @GetMapping("/courses/1")
    public Course getAllCourse(){
        return (new Course(3,"Learn Microservices 123","in28minutes"));
    }
}
