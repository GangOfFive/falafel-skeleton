package com.gangfive.sima.contracts;

import com.gangfive.sima.pojo.UsuarioPOJO;

public class UsersRequest extends BasePagingRequest {
	
	private UsuarioPOJO user;
	
	public UsersRequest() {
		super();
	}
	
	public UsuarioPOJO getUser() {
		return user;
	}
	
	public void setUser(UsuarioPOJO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UsersRequest [user=" + user + "]";
	}
}
