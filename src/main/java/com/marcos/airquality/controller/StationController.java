/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marcos.airquality.controller;

import com.marcos.airquality.model.Station;
import com.marcos.airquality.repository.StationRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marcos
 */
@RestController
@RequestMapping("/api/stations")
public class StationController {
    
    private final StationRepository repository;
    
    public StationController(StationRepository repository){
        this.repository = repository;
    }
    
    @GetMapping
    public List<Station> getAll(){
        return repository.findAll();
    }
}
