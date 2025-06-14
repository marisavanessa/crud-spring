package com.loiane.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.loiane.model.Course;
import com.loiane.repository.CourseRepository;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = {"https://crud-angular-exmo.onrender.com", "localhost:8081"})
@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor

public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping
    public @ResponseBody List<Course> list() {
        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        //System.out.println(course.getName());
        return courseRepository.save(course);
        //return ResponseEntity.status(HttpStatus.CREATED)
        //        .body(courseRepository.save(course));
    }
    
    
}
