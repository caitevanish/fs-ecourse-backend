package com.evanishyn.ecoursetracker.dao;

import com.evanishyn.ecoursetracker.entity.CourseCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "courseCompany", path="course-company")
public interface CourseCompanyRepo extends JpaRepository<CourseCompany,Integer> {
}
