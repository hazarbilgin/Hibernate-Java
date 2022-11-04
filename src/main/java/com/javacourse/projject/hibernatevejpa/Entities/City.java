package com.javacourse.projject.hibernatevejpa.Entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.beans.factory.BeanCreationException;


@Entity
@Table(name="city")
public class city {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column(name="Name")
private String name;

public city(int id, String name, String countryCode, String district,int population) {	
	this.id = id;
	this.name = name;
	this.countryCode = countryCode;
	this.district = district;
	this.population = population;
}
@Column(name="CountryCode")
private String countryCode;

@Column(name="District")
private String district;

@Column(name="Info")
private int population;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountryCode() {
	return countryCode;
}
public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public int getPopulation() {
	return population;
}
public void setPopulation(int population) {
	this.population = population;
}

public city() {
	
}
}
