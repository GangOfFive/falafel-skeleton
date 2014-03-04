package com.gangfive.sima.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gangfive.sima.contracts.UsuariosRequest;
import com.gangfive.sima.ejb.Usuario;
import com.gangfive.sima.repositories.UsuariosRepository;

@Service
public class UsuariosService implements IUsuariosService {

	@Autowired
	UsuariosRepository repo;

	@Override
	@Transactional
	public Page<Usuario> getAll(UsuariosRequest ur) {
		PageRequest pr;
		Sort.Direction direction = Sort.Direction.DESC;
		if (ur.getDirection().equals("ASC")) {
			direction = Sort.Direction.ASC;
		}

		if (ur.getSortBy().size() > 0) {
			Sort sort = new Sort(direction, ur.getSortBy());
			pr = new PageRequest(ur.getPageNumber(), ur.getPageSize(), sort);
		} else {
			pr = new PageRequest(ur.getPageNumber(), ur.getPageSize());
		}

		Page<Usuario> result = null;

		if (ur.getSearchColumn().toLowerCase().equals("all")) {
			result = repo.findAll(pr);
		} else if (ur.getSearchColumn().toLowerCase().equals("nombre")) {
			result = repo.findByNombreContaining(ur.getSearchTerm(), pr);
		} else if (ur.getSearchColumn().toLowerCase().equals("apellidos")) {
			result = repo.findByPrimerApellidoContainingOrSegundoApellidoContaining(
					ur.getSearchTerm(), ur.getSearchTerm(), pr);
		} else {
			result = repo.findAll(pr);
		}
		return result;

	}

	@Override
	@Transactional
	public boolean saveUsuario(Usuario user) {
		return repo.save(user) != null;
	}

	@Override
	public Usuario getUsuario(int id) {
		return repo.findOne(id);
	}

}