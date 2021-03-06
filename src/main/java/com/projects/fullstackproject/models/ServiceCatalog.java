package com.projects.fullstackproject.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service_catalog")
public class ServiceCatalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Service service;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String serviceDescription;

    @Column(length = 10, nullable = false)
    private String servicePrice;

    private boolean includesParts;

    @ManyToMany(mappedBy = "cartServiceCatalog")
    private List<Cart> servicesForCart;

    public ServiceCatalog(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(String servicePrice) {
        this.servicePrice = servicePrice;
    }

    public boolean isIncludesParts() {
        return includesParts;
    }

    public void setIncludesParts(boolean includesParts) {
        this.includesParts = includesParts;
    }

    public List<Cart> getServicesForCart() {
        return servicesForCart;
    }

    public void setServicesForCart(List<Cart> servicesForCart) {
        this.servicesForCart = servicesForCart;
    }
}
