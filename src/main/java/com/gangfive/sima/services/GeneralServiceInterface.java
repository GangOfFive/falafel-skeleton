package com.gangfive.sima.services;

import java.util.List;

import com.gangfive.sima.ejb.TipoAlquiler;
import com.gangfive.sima.ejb.TipoUsuario;

public interface GeneralServiceInterface {

	List<TipoUsuario> getAllTipoUsuario();
	TipoUsuario getTipoUsuarioById(Integer idTipoUsuario);
	List<TipoAlquiler> getAllTipoAlquiler();
	TipoAlquiler getTipoAlquilerById(Integer idTipoAlquiler);
}
