package com.projects.fullstackproject.models;


import javax.persistence.*;

@Entity
@Table(name = "service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 20, nullable = false)
    private String name;

//    @Column(length = 20, nullable = false)
//    private String serviceType;

    public Service(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getServiceType() {
//        return serviceType;
//    }
//
//    public void setServiceType(String serviceType) {
//        this.serviceType = serviceType;
//    }
}
