package com.practice.controllers;
import com.practice.entities.Course;
import com.practice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController
{
    @Autowired
    private CourseService courseService;

    //Get All Course;

    @GetMapping("/courses")
    public List<Course> getAllCourse()
    {
       return this.courseService.getAllCourse();
    }

    // Get Course By ID;

    @GetMapping("/courses/{courseId}")
    public Optional<Course> getCourse(@PathVariable String courseId)
    {
return this.courseService.getCourse(Long.parseLong(courseId));
    }

    // Add Course

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    // Updadte Course by Id;

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course)
    {
     return this.courseService.updateCourse(course);
    }


    //Delete Course By Id;

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus>deleteCourse(@PathVariable String courseId)
    {
     try {
         this.courseService.deleteCourse(Long.parseLong(courseId));
  return new ResponseEntity<>(HttpStatus.OK);
     }catch (Exception e){
         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
     }
    }

}
