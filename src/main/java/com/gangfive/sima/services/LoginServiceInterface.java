package com.gangfive.sima.services;

import com.gangfive.sima.contracts.LoginRequest;
import com.gangfive.sima.ejb.Usuario;

public interface LoginServiceInterface {

	Usuario checkUser(LoginRequest lr);

}
