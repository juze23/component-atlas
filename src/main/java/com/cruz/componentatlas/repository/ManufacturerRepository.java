package com.cruz.componentatlas.repository;

import com.cruz.componentatlas.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long>{
    
}
