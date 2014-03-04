package com.gangfive.sima.contracts;

import com.gangfive.sima.pojo.UsuarioPOJO;

public class UsuariosRequest extends BasePagingRequest {
	
	private UsuarioPOJO user;
	
	public UsuariosRequest() {
		super();
	}
	
	public UsuarioPOJO getUser() {
		return user;
	}
	
	public void setUser(UsuarioPOJO user) {
		this.user = user;
	}
}
