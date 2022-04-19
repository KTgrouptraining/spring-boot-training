package com.springboottraining.helloworldapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboottraining.helloworldapp.entities.Countries;

@Repository
public interface CountriesRepository extends CrudRepository<Countries, Integer> {

	


}
