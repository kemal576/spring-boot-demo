package com.sahinkemal.sbDemo.DataAccess;

import com.sahinkemal.sbDemo.Entities.City;
import com.sahinkemal.sbDemo.Entities.County;

import java.util.List;

public interface ICityDal {
    List<City> GetAll();
    List<County> GetAllCounties();
    City getCityById(int id);
    void add(City city);
    void update(City city);
    void delete(City city);

}
