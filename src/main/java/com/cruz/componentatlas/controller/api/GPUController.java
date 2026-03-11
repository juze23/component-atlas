package com.cruz.componentatlas.controller.api;

import com.cruz.componentatlas.entity.GPU;
import com.cruz.componentatlas.repository.GPURepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gpus")
public class GPUController {

    private final GPURepository gpuRepository;

    public GPUController(GPURepository gpuRepository) {
        this.gpuRepository = gpuRepository;
    }

    @PostMapping
    public GPU createGPU(@RequestBody GPU gpu) {
        return gpuRepository.save(gpu);
    }

    @GetMapping
    public List<GPU> getAllGPU() {
        return gpuRepository.findAll();
    }
    
}
