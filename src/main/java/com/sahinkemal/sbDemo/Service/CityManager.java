package com.sahinkemal.sbDemo.Service;

import com.sahinkemal.sbDemo.DataAccess.ICityDal;
import com.sahinkemal.sbDemo.Entities.City;
import com.sahinkemal.sbDemo.Entities.County;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CityManager implements ICityService{
    private ICityDal cityDal;

    @Autowired
    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }

    @Override
    @Transactional
    public List<City> GetAll() {
        return this.cityDal.GetAll();
    }

    @Override
    public List<County> GetAllCounties() {
        return this.cityDal.GetAllCounties();
    }

    @Override
    @Transactional
    public City getCityById(int id) {
        return this.cityDal.getCityById(id);
    }

    @Override
    @Transactional
    public void add(City city) {
        this.cityDal.add(city);
    }

    @Override
    @Transactional
    public void update(City city) {
        this.cityDal.update(city);
    }

    @Override
    @Transactional
    public void delete(City city) {
        this.cityDal.delete(city);
    }
}
