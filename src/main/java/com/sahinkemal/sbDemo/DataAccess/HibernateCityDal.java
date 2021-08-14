package com.sahinkemal.sbDemo.DataAccess;

import com.sahinkemal.sbDemo.Entities.City;
import com.sahinkemal.sbDemo.Entities.County;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateCityDal implements ICityDal{
    private EntityManager entityManager;

    @Autowired
    public HibernateCityDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<City> GetAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from City",City.class).getResultList();
    }

    @Override
    public List<County> GetAllCounties() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from County",County.class).getResultList();
    }

    @Override
    public City getCityById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(City.class,id);
    }

    @Override
    public void add(City city) {
        Session session = entityManager.unwrap(Session.class);
        if (city.getId() == 0){
        session.saveOrUpdate(city);
        }
    }

    @Override
    public void update(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);
    }

    @Override
    public void delete(City city) {
        Session session = entityManager.unwrap(Session.class);
        City cityToDelete = session.get(City.class,city.getId());
        session.delete(cityToDelete);
    }
}
