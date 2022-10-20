package com.evanishyn.ecoursetracker.dao;

import com.evanishyn.ecoursetracker.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface CourseRepo extends JpaRepository<Course,Integer> {

}
