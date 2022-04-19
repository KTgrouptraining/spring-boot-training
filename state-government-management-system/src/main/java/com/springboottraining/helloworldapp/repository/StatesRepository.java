package com.springboottraining.helloworldapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboottraining.helloworldapp.entities.States;

@Repository
public interface StatesRepository extends CrudRepository<States, Integer>{

}
