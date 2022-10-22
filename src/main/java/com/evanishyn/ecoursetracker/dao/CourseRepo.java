package com.evanishyn.ecoursetracker.dao;

import com.evanishyn.ecoursetracker.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface CourseRepo extends JpaRepository<Course,Integer> {

    //http://localhost:8080/api/courses/search/findByCompanyId?id=1
    //http://localhost:8080/api/courses/search/findByUserId?id=1

    Page<Course> findByCompanyId(@Param("id") Integer id, Pageable pageable);

    Page<Course> findByUserId(@Param("id") Integer id, Pageable pageable);

}
