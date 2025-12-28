/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marcos.airquality.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 *
 * @author Marcos
 */
@Entity
public class AirMeasurement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Double value;
    private LocalDateTime measuredAt;
    
    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;
    
    @ManyToOne
    @JoinColumn(name = "pollutant_id")
    private Pollutant pollutant;
    
    //Getters and setters
    
    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Double getValue(){return value;}
    public void setValue(Double value){this.value = value;}
    public LocalDateTime getMeasuredAt(){return measuredAt;}
    public void setMeasuredAt(LocalDateTime measuredAt){this.measuredAt = measuredAt;}
    public Station getStation(){return station;}
    public void setStation(Station station){this.station = station;}
    public Pollutant getPollutant(){return pollutant;}
    public void setPollutant(Pollutant pollutant){this.pollutant = pollutant;}
    
    
    
}
