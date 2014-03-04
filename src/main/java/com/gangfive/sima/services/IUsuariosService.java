package com.gangfive.sima.services;

import org.springframework.data.domain.Page;

import com.gangfive.sima.contracts.UsuariosRequest;
import com.gangfive.sima.ejb.Usuario;

public interface IUsuariosService {
	Page<Usuario> getAll(UsuariosRequest ur);
	boolean saveUsuario(Usuario user);
	Usuario getUsuario(int idUser);
}
