package com.gangfive.sima.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gangfive.sima.ejb.Alquiler;

public interface RentRepository extends CrudRepository<Alquiler,Integer> {
	
	List<Alquiler> findByIdAlquilerNotIn(List<Integer> list);
	
}
