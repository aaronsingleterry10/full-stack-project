package com.projects.fullstackproject.controllers;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    private List<ServiceCatalog> cartServices;

    @OneToMany
    private List<Components> cartComponents;

    @Column(length = 20, nullable = false)
    private String firstName;

    @Column(length = 20, nullable = false)
    private String lastName;

    @Column(length = 50, nullable = false)
    private String address;

    @Column(length = 10, nullable = false)
    private String phone;

    public Cart(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ServiceCatalog> getCartServices() {
        return cartServices;
    }

    public void setCartServices(List<ServiceCatalog> cartServices) {
        this.cartServices = cartServices;
    }

    public List<Components> getCartComponents() {
        return cartComponents;
    }

    public void setCartComponents(List<Components> cartComponents) {
        this.cartComponents = cartComponents;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
