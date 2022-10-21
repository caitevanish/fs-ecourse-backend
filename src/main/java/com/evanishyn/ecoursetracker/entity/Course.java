package com.evanishyn.ecoursetracker.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="course")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="title")
    private String title;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="company_id")
//    @JoinColumn(name="company_id", nullable = false)
    private CourseCompany company;

    @Column(name="price")
    private float price;

    @Column(name="date_purchased")
    private int date_purchased;

}
