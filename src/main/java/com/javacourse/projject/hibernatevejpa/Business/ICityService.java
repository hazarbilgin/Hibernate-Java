package com.javacourse.projject.hibernatevejpa.Business;

import java.util.List;

import com.javacourse.projject.hibernatevejpa.Entities.City;

public interface ICityService {
	List<City> GetAll();
	void add(City city);
	void update(City city);
	void delete(City city);
}
