package com.gangfive.sima.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gangfive.sima.contracts.LoginRequest;
import com.gangfive.sima.ejb.Usuario;
import com.gangfive.sima.repositories.LoginRepository;

@Service
public class LoginService implements LoginServiceInterface{

	@Autowired
	LoginRepository loginRepository;
	
	@Override
	@Transactional
	public Usuario checkUser(LoginRequest lr) {
		return loginRepository.findByEmailAndPassword(lr.getEmail(), lr.getPassword());
	}		
}