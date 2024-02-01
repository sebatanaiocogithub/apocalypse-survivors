package com.robot.apocalypsesurvivors.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "water")
    private String water;

    @Column(name = "food")
    private String food;

    @Column(name = "medication")
    private String medication;

    @Column(name = "ammunition")
    private String ammunition;



    public Resource() {
    }

    public Resource(Long id, String water, String food, String medication, String ammunition) {
        this.id = id;
        this.water = water;
        this.food = food;
        this.medication = medication;
        this.ammunition = ammunition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(String ammunition) {
        this.ammunition = ammunition;
    }
}
