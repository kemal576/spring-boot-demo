package com.sahinkemal.sbDemo.RestAPI;

import com.sahinkemal.sbDemo.Entities.City;
import com.sahinkemal.sbDemo.Entities.County;
import com.sahinkemal.sbDemo.Service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {
    private ICityService cityService;

    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public List<City> get(){
        return this.cityService.GetAll();
    }

    @GetMapping("/counties")
    public List<County> getCounties(){
        return this.cityService.GetAllCounties();
    }

    @GetMapping("/getCity/{id}")
    public City getCity(@PathVariable int id){
        return this.cityService.getCityById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody City city){
        this.cityService.add(city);
    }

    @PostMapping("/update")
    public void update(@RequestBody City city){
        this.cityService.update(city);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody City city){
        this.cityService.delete(city);
    }
}
