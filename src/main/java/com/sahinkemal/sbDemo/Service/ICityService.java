package com.sahinkemal.sbDemo.Service;

import com.sahinkemal.sbDemo.Entities.City;

import java.util.List;

public interface ICityService {
    List<City> GetAll();
    City getCityById(int id);
    void add(City city);
    void update(City city);
    void delete(City city);
}
