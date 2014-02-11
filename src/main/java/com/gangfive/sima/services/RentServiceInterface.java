package com.gangfive.sima.services;

import java.util.List;

import com.gangfive.sima.ejb.Alquiler;


public interface RentServiceInterface {

	Boolean saveRent(Alquiler alquiler);

	List<Alquiler> getNoUserRentList(List<Integer> rentIds);

	Alquiler getAlquiler(int idAlquiler);

}
