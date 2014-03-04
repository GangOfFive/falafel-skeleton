package com.gangfive.sima.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.gangfive.sima.contracts.BaseResponse;
import com.gangfive.sima.contracts.LoginRequest;
import com.gangfive.sima.contracts.LoginResponse;
import com.gangfive.sima.ejb.Usuario;
import com.gangfive.sima.services.ILoginService;

/**
 * Handles requests for the application home page.
 */
@Component
@Path("/login")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class LoginController {

	@Autowired
	ILoginService loginService;

	@Autowired
	HttpServletRequest request;

	@Path("/check-user")
	@POST
	@Transactional
	public BaseResponse checkUser(LoginRequest lr) {

		Usuario usuario = loginService.checkUsuario(lr);

		LoginResponse response = new LoginResponse();
		HttpSession currentSession = request.getSession();

		if (usuario == null) {
			response.setCode(401);
			response.setErrorMessage("Usuario no autorizado");
		} else {
			response.setCode(200);
			response.setCodeMessage("Usuario autorizado");
			response.set(usuario);

			currentSession.setAttribute("userId", usuario.getId());
		}

		return response;

	}
}
