package com.gangfive.sima.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gangfive.sima.ejb.Usuario;

public interface LoginRepository extends CrudRepository<Usuario, Integer> {

	public static final int PAGE_SIZE = 5;

	Usuario findByEmailAndContrasena(String email, String contrasena);
}
