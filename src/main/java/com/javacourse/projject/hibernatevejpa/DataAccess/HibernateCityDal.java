package com.javacourse.projject.hibernatevejpa.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.javacourse.projject.hibernatevejpa.Entities.city;
import jakarta.persistence.*;
import jakarta.persistence.EntityManager;
import java.sql.*;

@Repository
public class HibernateCityDal implements ICityDal {
	
	private EntityManager entityManager;	
	
	@Autowired
	public HibernateCityDal() {

	}

	@Override
	@Transactional
	public List<city> GetAll() {
		Session session=entityManager.unwrap(Session.class);
		List<city> cities=session.createQuery("from world_x.city",city.class).getResultList();
		return cities;
	}

	@Override
	public void add(city City) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(city City) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(city City) {
		// TODO Auto-generated method stub
		
	}

}
