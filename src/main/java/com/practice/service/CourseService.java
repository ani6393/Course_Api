package com.practice.service;

import com.practice.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService
{
    public List<Course>getAllCourse();
    public Optional<Course> getCourse(long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);

    public void deleteCourse(long parseLong);

}
