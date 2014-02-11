package com.gangfive.sima.services;

import org.springframework.data.domain.Page;

import com.gangfive.sima.contracts.UsersRequest;
import com.gangfive.sima.ejb.Usuario;

public interface UsersServiceInterface {

	Page<Usuario> getAll(UsersRequest ur);

	Boolean saveUser(Usuario user);

	Usuario getSessionUser(int idUser);
}
