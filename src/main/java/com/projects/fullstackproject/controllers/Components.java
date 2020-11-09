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

    public Components(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentDescription() {
        return componentDescription;
    }

    public void setComponentDescription(String componentDescription) {
        this.componentDescription = componentDescription;
    }

    public String getComponentDetails() {
        return componentDetails;
    }

    public void setComponentDetails(String componentDetails) {
        this.componentDetails = componentDetails;
    }

    public String getComponentProductCode() {
        return componentProductCode;
    }

    public void setComponentProductCode(String componentProductCode) {
        this.componentProductCode = componentProductCode;
    }

    public String getComponentPrice() {
        return componentPrice;
    }

    public void setComponentPrice(String componentPrice) {
        this.componentPrice = componentPrice;
    }

    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }
}