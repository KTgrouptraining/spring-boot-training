package com.springboottraining.helloworldapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboottraining.helloworldapp.entities.Mandals;

@Repository
public interface MandalsRepository extends CrudRepository<Mandals, Integer>{

}
