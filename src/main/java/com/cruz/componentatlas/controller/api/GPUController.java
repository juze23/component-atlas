package com.cruz.componentatlas.controller.api;

import com.cruz.componentatlas.entity.GPU;
import com.cruz.componentatlas.entity.Manufacturer;
import com.cruz.componentatlas.repository.GPURepository;
import com.cruz.componentatlas.repository.ManufacturerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gpus")
public class GPUController {

    private final GPURepository gpuRepository;
    private final ManufacturerRepository manufacturerRepository;

    public GPUController(GPURepository gpuRepository,
            ManufacturerRepository manufacturerRepository) {
        this.gpuRepository = gpuRepository;
        this.manufacturerRepository = manufacturerRepository;
    }

    @PostMapping
    public GPU createGPU(@RequestBody GPU gpu) {
        if (gpu.getManufacturer() != null && gpu.getManufacturer().getId() != null) {
            Manufacturer manufacturer = manufacturerRepository
                .findById(gpu.getManufacturer().getId())
                .orElseThrow(() -> new RuntimeException("Manufacturer not found"));

            gpu.setManufacturer(manufacturer);
        }

        return gpuRepository.save(gpu);
    }

    @GetMapping
    public List<GPU> getAllGPU() {
        return gpuRepository.findAll();
    }
    
}
