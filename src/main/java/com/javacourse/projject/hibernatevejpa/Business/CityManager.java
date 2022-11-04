package com.javacourse.projject.hibernatevejpa.Business;
import com.javacourse.projject.hibernatevejpa.Entities.city;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import com.javacourse.projject.hibernatevejpa.DataAccess.ICityDal;

import com.javacourse.projject.hibernatevejpa.Entities.city;
@Service
public class CityManager implements ICityService{
	
	private ICityDal cityDal;
	 
	public CityManager() {
	}
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	@GetMapping
	public List<city>GetAll() {
		
		return this.cityDal.GetAll();
	}

	@Override
	@Transactional
	public void add(city City) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(city City) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(city City) {
		// TODO Auto-generated method stub
		
	}

}
