package com.klef.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.exam.entity.Course;
import com.klef.exam.service.CourseService;

@RestController
@CrossOrigin("*")
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    // Add Course
    @PostMapping("/add")
    public Course add(@RequestBody Course course) {
        return service.addCourse(course);
    }

    // View All Courses
    @GetMapping("/viewall")
    public List<Course> viewAll() {
        return service.viewAll();
    }

    // Search Course by ID
    @GetMapping("/search/{id}")
    public Course search(@PathVariable int id) {
        return service.getById(id).orElse(null);
    }
    
    
}
