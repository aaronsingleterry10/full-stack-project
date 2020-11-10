package com.projects.fullstackproject.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 20, nullable = false)
    private String firstName;

    @Column(length = 20, nullable = false)
    private String lastName;

    @Column(length = 50, nullable = false)
    private String address;

    @Column(length = 10, nullable = false)
    private String phone;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "cart_merch",
            joinColumns = {@JoinColumn(name = "cart_id")},
            inverseJoinColumns = {@JoinColumn(name = "merch_id")}
    )
    private List<Merch> cartMerch;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "cart_service",
            joinColumns = {@JoinColumn(name = "cart_id")},
            inverseJoinColumns = {@JoinColumn(name = "service_catalog_id")}
    )
    private List<ServiceCatalog> cartServiceCatalog;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "cart_components",
            joinColumns = {@JoinColumn(name = "cart_id")},
            inverseJoinColumns = {@JoinColumn(name = "components_id")}
    )
    private List<Components> cartComponents;

    public Cart(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<Merch> getCartMerch() {
        return cartMerch;
    }

    public void setCartMerch(List<Merch> cartMerch) {
        this.cartMerch = cartMerch;
    }

    public List<ServiceCatalog> getCartServiceCatalog() {
        return cartServiceCatalog;
    }

    public void setCartServiceCatalog(List<ServiceCatalog> cartServiceCatalog) {
        this.cartServiceCatalog = cartServiceCatalog;
    }

    public List<Components> getCartComponents() {
        return cartComponents;
    }

    public void setCartComponents(List<Components> cartComponents) {
        this.cartComponents = cartComponents;
    }
}
