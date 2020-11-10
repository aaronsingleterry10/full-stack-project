package com.projects.fullstackproject.repositories;

import com.projects.fullstackproject.models.ServiceCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCatalogRepository extends JpaRepository<ServiceCatalog, Long> {
}
