package com.cruz.componentatlas.repository;

import com.cruz.componentatlas.entity.Component;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentRepository extends JpaRepository<Component, Long>{
    
}
