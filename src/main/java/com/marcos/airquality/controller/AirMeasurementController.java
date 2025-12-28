/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marcos.airquality.controller;

import com.marcos.airquality.model.AirMeasurement;
import com.marcos.airquality.repository.AirMeasurementRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marcos
 */
@RestController
@RequestMapping("/api/measurements")
public class AirMeasurementController {
    
    
    private final AirMeasurementRepository repository;
    
    public AirMeasurementController(AirMeasurementRepository repository){
        this.repository = repository;
    }

    @GetMapping("/latest")
    public List<AirMeasurement> getLatest() {
        return repository.findTop100ByOrderByMeasuredAtDesc();
    }

   
}
    

