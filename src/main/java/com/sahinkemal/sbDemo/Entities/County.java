package com.sahinkemal.sbDemo.Entities;
import javax.persistence.*;

@Entity
@Table(name = "county", schema = "cities")
public class County {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "population")
    private int population;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id", referencedColumnName = "id", insertable = false, updatable = false)
    private City city;

    ////////////////////////////////////////////////////////////////////

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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public City getCity() {
        return city;
    }
}
