package com.springboottraining.helloworldapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboottraining.helloworldapp.entities.Mandals;

@Repository
public interface MandalsRepository extends CrudRepository<Mandals, Integer>{
	
	public List<Mandals> findMandalByState(String state);//select * from mandals where state='';
	public List<Mandals> findMandalByDistrict(String district);
	public List<Mandals> findMandalByName(String name);
	public List<Mandals> findMandalsByStateAndDistrict(String state,String district);
	

}
