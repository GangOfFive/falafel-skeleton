package com.gangfive.sima.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gangfive.sima.ejb.TipoUsuario;

public interface GeneralRepository extends CrudRepository<TipoUsuario,Integer> {
	
	public static final int PAGE_SIZE = 5;
}
