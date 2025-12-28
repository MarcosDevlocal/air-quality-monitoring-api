/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.marcos.airquality.repository;

import com.marcos.airquality.model.Pollutant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Marcos
 */
public interface PollutantRepository extends JpaRepository<Pollutant, Long> {
    
}
