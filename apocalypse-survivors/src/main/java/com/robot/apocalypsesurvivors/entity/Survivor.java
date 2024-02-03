package com.robot.apocalypsesurvivors.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "survivors")
public class Survivor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private String gender;

    @Column(name =  "location")
    private String location;

    @Column(name =  "infected")
    private Boolean infected;

    @Column(name =  "inventory")
    private String inventory;

    @Column(name =  "contaminationReports")
    private Integer contaminationReports;

    public Survivor() {
    }

    public Survivor(Long id, String name, Integer age, String gender, String location, Boolean infected, String inventory, Integer contaminationReports ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.infected = infected;
        this.inventory = inventory;
        this.contaminationReports = contaminationReports;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getInfected() {
        return infected;
    }

    public void setInfected(Boolean infected) {
        this.infected = infected;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public Integer getContaminationReports() {
        return contaminationReports;
    }

    public void setContaminationReports(Integer contaminationReports) {
        this.contaminationReports = contaminationReports;
    }

}
