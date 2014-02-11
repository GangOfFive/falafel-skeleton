package com.gangfive.sima.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gangfive.sima.ejb.TipoAlquiler;
import com.gangfive.sima.ejb.TipoUsuario;
import com.gangfive.sima.repositories.GeneralRepository;
import com.gangfive.sima.repositories.TipoAlquilerRepository;
import com.gangfive.sima.repositories.TipoUsuarioRepository;

@Service
public class GeneralService implements GeneralServiceInterface{		
	
	@Autowired
	GeneralRepository generalRepository;
	
	@Autowired
	TipoUsuarioRepository tipoUsuarioRepository;
	
	@Autowired
	TipoAlquilerRepository tipoAlquilerRepository;

	@Override
	public List<TipoUsuario> getAllTipoUsuario() {
		return tipoUsuarioRepository.findAll();
	}

	@Override
	public TipoUsuario getTipoUsuarioById(Integer idTipoUsuario) {
		return tipoUsuarioRepository.findOne(idTipoUsuario);
	}

	@Override
	public List<TipoAlquiler> getAllTipoAlquiler() {
		return tipoAlquilerRepository.findAll();
	}
	
	@Override
	public TipoAlquiler getTipoAlquilerById(Integer idTipoAlquiler) {
		return tipoAlquilerRepository.findOne(idTipoAlquiler);
	}
	
}