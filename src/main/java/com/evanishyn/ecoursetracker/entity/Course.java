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

    @Column(name="title")
    private String title;

    @ManyToOne
    @JoinColumn(name="company_id", nullable = false)
    private CourseCompany company;

    @Column(name="price")
    private float price;

    @Column(name="date_purchased")
    private long datePurchased;

}
