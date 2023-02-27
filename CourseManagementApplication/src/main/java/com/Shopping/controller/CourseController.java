package com.Shopping.controller;

import com.Shopping.dto.Course;
import com.Shopping.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;
    @PostMapping("course")
    public Course addNewCourse(@RequestBody Course course){
        Course course1 =courseRepository.save(course);
        return course1;
    }
    @GetMapping("courses")
    public List<Course> getListOfCourse(){
        return this.courseRepository.findAll();
    }

    @PutMapping("course")
    public String updateCourse(@RequestBody Course course) {
        this.courseRepository.save(course);
        return "Student got updated successfully";
    }

    @DeleteMapping("course/{id}")
    public String deleteCourse(@PathVariable("id") Integer id)  {
        this.courseRepository.deleteById(id);
        return "Student got deleted successfully";
    }
}
