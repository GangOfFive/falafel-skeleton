package com.gangfive.sima.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gangfive.sima.ejb.TipoUsuario;

public interface TipoUsuarioRepository extends CrudRepository<TipoUsuario,Integer> {

	List<TipoUsuario> findAll();
	
}
