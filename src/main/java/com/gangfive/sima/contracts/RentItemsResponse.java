package com.gangfive.sima.contracts;

import java.util.List;

import com.gangfive.sima.pojo.AlquilerPOJO;


public class RentItemsResponse extends BaseResponse{
	
	private List<AlquilerPOJO> alquileres;

	public RentItemsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<AlquilerPOJO> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(List<AlquilerPOJO> alquileres) {
		this.alquileres = alquileres;
	}

}
