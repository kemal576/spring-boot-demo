package com.sahinkemal.sbDemo.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="city")
public class City {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "population")
    private int population;

    @Column(name = "district")
    private String district;

    @JsonIgnore
    @OneToMany(mappedBy = "city")
    Set<County> counties = new HashSet<>();

///////////////////////////////////////////////////////////////////////

    public City(){}

    public City(int id, String name, int population, String district) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.district = district;
    }

    ///////////////////////////////////////////////////////////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Set<County> getCounties() {
        return counties;
    }
}

