package com.evanishyn.ecoursetracker.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="course_company")
@Getter
@Setter
public class CourseCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="website")
    private String website;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private Set<Course> courses;


}
