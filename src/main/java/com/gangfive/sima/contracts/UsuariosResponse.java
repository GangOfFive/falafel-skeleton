package com.gangfive.sima.contracts;

import java.util.List;

import com.gangfive.sima.pojo.UsuarioPOJO;

public class UsuariosResponse extends BaseResponse{
	
	private List<UsuarioPOJO> usuarios;

	public UsuariosResponse() {
		super();
	}
	
	public List<UsuarioPOJO> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioPOJO> usuarios) {
		this.usuarios = usuarios;
	}

}
