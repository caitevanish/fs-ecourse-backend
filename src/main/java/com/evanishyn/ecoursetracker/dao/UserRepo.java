package com.evanishyn.ecoursetracker.dao;

import com.evanishyn.ecoursetracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "user", path="user")
public interface UserRepo extends JpaRepository<User, Long> {
}
