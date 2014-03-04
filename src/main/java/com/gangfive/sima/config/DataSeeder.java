package com.gangfive.sima.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gangfive.sima.ejb.Usuario;
import com.gangfive.sima.repositories.UsuariosRepository;

/**
 * 
 * Esta clase se encarga de popular la base de datos por primera vez
 *
 */
@Component
public class DataSeeder {
	@Autowired
	UsuariosRepository uRepo;

	@PostConstruct
	public void seedData() {
		if (uRepo.count() == 0) {
			Usuario admin = new Usuario();
			admin.setEmail("admin@falafel.io");
			admin.setContrasena("test123");
			admin.setNombre("Andrés");
			admin.setPrimerApellido("Villarreal");
			admin.setSegundoApellido("Cordero");
			admin.setCelular("60401228");
			admin.setGenero('M');

			uRepo.save(admin);
		}
	}
}
