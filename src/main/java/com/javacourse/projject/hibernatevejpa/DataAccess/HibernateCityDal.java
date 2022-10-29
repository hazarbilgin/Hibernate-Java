package com.javacourse.projject.hibernatevejpa.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.javacourse.projject.hibernatevejpa.Entities.City;
import jakarta.persistence.EntityManager;

@Repository
public class HibernateCityDal implements ICityDal {
	private EntityManager entityManager;	
	
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<City> GetAll() {
		Session session=entityManager.unwrap(Session.class);
		List<City> cities=session.createQuery("from world_x.city",City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}