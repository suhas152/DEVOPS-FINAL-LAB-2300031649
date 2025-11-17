package com.klef.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.exam.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
