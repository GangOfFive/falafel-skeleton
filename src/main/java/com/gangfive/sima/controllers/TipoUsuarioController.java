package com.gangfive.sima.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gangfive.sima.contracts.TipoUsuarioResponse;
import com.gangfive.sima.ejb.TipoUsuario;
import com.gangfive.sima.pojo.TipoUsuarioPOJO;
import com.gangfive.sima.services.GeneralServiceInterface;
import com.gangfive.sima.utils.PojoUtils;


/**
 * Handles requests for the application home page.
 */
@Component
@Path("/protected/tipoUsuario")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class TipoUsuarioController {
	
	@Autowired
	GeneralServiceInterface generalService;
	
	@Path("/getAll")
	@GET
	public TipoUsuarioResponse getAll(){
		
		TipoUsuarioResponse tpr = new TipoUsuarioResponse();
		
		List<TipoUsuario> tipoUsuarioList = generalService.getAllTipoUsuario();
		List<TipoUsuarioPOJO> tipoUsuarioViewList = new ArrayList<TipoUsuarioPOJO>();
		
		for (TipoUsuario tp : tipoUsuarioList){
			TipoUsuarioPOJO ntipoUsuario = new TipoUsuarioPOJO();
			PojoUtils.pojoMappingUtility(ntipoUsuario,tp);
			tipoUsuarioViewList.add(ntipoUsuario);
		}
		
		tpr.setTipoUsuarioList(tipoUsuarioViewList);
		
		return tpr;		
	}
}
