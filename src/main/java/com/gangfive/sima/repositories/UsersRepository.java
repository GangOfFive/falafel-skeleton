package com.gangfive.sima.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.gangfive.sima.ejb.Usuario;

public interface UsersRepository extends CrudRepository<Usuario,Integer> {
	
	public static final int PAGE_SIZE = 5;
	
	Usuario findByEmailAndPassword(String email, String password);
	
	Page<Usuario> findAll(Pageable pageable);
	Page<Usuario> findByFirstnameContaining(String firstName,Pageable pageable);
	Page<Usuario> findByLastnameContaining(String firstName,Pageable pageable);
}
