package com.projects.fullstackproject.controllers;

import javax.persistence.*;

@Entity
@Table(name = "components")
public class Components {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 20, nullable = false)
    private String componentName;

    @Column(columnDefinition = "TEXT")
    private String componentDescription;

    @Column(length = 30)
    private String componentDetails;

    @Column(length = 30, nullable = false)
    private String componentProductCode;

    @Column(length = 20, nullable = false)
    private String componentPrice;

    @Column(length = 20, nullable = false)
    private String componentType;

    @Column(length = 20)
    private String shipping;

}
