package com.springboottraining.helloworldapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboottraining.helloworldapp.entities.Mandals;

@Repository
public interface MandalsRepository extends CrudRepository<Mandals, Integer> {

	public List<Mandals> findMandalByState(String state);// select * from mandals where state='';

	public List<Mandals> findMandalByDistrict(String district);

	public List<Mandals> findMandalByName(String name);

	public List<Mandals> findMandalsByStateAndDistrict(String state, String district);

	//jdbc name jdbc parametere
	@Query("select mandal from Mandals mandal where mandal.state=:state and mandal.district=:district and mandal.name=:name")
	public Mandals findMandaslDataByCustomQuery(@Param("state") String state, @Param("district") String district,
			@Param("name") String name);
	
	

}
