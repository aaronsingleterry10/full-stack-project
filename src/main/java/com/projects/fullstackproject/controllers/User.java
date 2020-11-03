package com.projects.fullstackproject.controllers;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 75, nullable = false, unique = true)
    private String email;
}
