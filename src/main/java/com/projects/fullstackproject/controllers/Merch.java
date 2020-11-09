package com.projects.fullstackproject.controllers;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "merch")
public class Merch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 20, nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String merchDescription;

    @Column(length = 20, nullable = false)
    private String merchPrice;

    @Column(length = 50, nullable = false)
    private String productCode;

    @Column(length = 20, nullable = false)
    private String productType;

    @Column(length = 30)
    private String productDetails;

    @Column(length = 30)
    private String shipping;

    @ManyToMany(mappedBy = "cartMerch")
    private List<Cart> merchForCart;

    public Merch(){}

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

    public String getDescription() {
        return merchDescription;
    }

    public void setDescription(String description) {
        this.merchDescription = description;
    }

    public String getPrice() {
        return merchPrice;
    }

    public void setPrice(String price) {
        this.merchPrice = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }
}
