package com.gangfive.sima.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gangfive.sima.ejb.TipoAlquiler;

public interface TipoAlquilerRepository extends CrudRepository<TipoAlquiler,Integer> {

	List<TipoAlquiler> findAll();
	
}
