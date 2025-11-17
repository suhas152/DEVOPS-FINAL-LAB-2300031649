package com.klef.exam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.exam.entity.Course;
import com.klef.exam.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repo;

    public Course addCourse(Course course) {
        return repo.save(course);
    }

    public List<Course> viewAll() {
        return repo.findAll();
    }

    public Optional<Course> getById(int id) {
        return repo.findById(id);
    }
}
