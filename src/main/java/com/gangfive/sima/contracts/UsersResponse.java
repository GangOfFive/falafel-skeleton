package com.gangfive.sima.contracts;

import java.util.List;

import com.gangfive.sima.pojo.UsuarioPOJO;

public class UsersResponse extends BaseResponse{
	
	private List<UsuarioPOJO> usuarios;

	public UsersResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<UsuarioPOJO> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioPOJO> usuarios) {
		this.usuarios = usuarios;
	}

}
