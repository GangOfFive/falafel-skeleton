package com.gangfive.sima.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gangfive.sima.contracts.LoginRequest;
import com.gangfive.sima.ejb.Usuario;
import com.gangfive.sima.repositories.LoginRepository;

@Service
public class LoginService implements ILoginService{

	@Autowired
	LoginRepository loginRepository;
	
	@Override
	@Transactional
	public Usuario checkUsuario(LoginRequest lr) {
		return loginRepository.findByEmailAndContrasena(lr.getEmail(), lr.getContrasena());
	}		
}