package com.projects.fullstackproject.repositories;

import com.projects.fullstackproject.models.Components;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentsRepository extends JpaRepository<Components, Long> {
}
