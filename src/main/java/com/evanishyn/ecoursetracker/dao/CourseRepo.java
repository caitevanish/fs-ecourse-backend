package com.evanishyn.ecoursetracker.dao;

import com.evanishyn.ecoursetracker.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {

}
