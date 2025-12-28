/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marcos.airquality.model;

import jakarta.persistence.*;

/**
 *
 * @author Marcos
 */
@Entity
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String city;
    
    // Getters and setters
    
    public long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getCity(){return city;}
    public void setCity(String city){this.city = city;}
    
}
