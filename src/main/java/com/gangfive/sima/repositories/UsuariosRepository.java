package com.gangfive.sima.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.gangfive.sima.ejb.Usuario;

public interface UsuariosRepository extends CrudRepository<Usuario, Integer> {
	
	public static final int PAGE_SIZE = 5;

	Usuario findByEmail(String email);

	Page<Usuario> findAll(Pageable pageable);
	Page<Usuario> findByNombreContaining(String nombre, Pageable pageable);
	Page<Usuario> findByPrimerApellidoContainingOrSegundoApellidoContaining(
			String primerApellido, String segundoApellido, Pageable pageable);

}
