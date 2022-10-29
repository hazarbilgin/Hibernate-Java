package com.javacourse.projject.hibernatevejpa.DataAccess;

import java.util.List;

import com.javacourse.projject.hibernatevejpa.Entities.City;

public interface ICityDal {
	List<City> GetAll();
	void add(City city);
	void update(City city);
	void delete(City city);


}
