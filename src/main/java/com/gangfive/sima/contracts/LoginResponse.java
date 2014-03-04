package com.gangfive.sima.contracts;

import com.gangfive.sima.ejb.Usuario;

public class LoginResponse extends BaseResponse {

	private long id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String email;
	private char genero;
	
	public LoginResponse() {
		super();
	}
	
	/**
	 * Copia todos los valores de un usuario en el response
	 */
	public void set(Usuario usuario) {
		setId(usuario.getId());
		setNombre(usuario.getNombre());
		setPrimerApellido(usuario.getPrimerApellido());
		setSegundoApellido(usuario.getSegundoApellido());
		setEmail(usuario.getEmail());
		setGenero(usuario.getGenero());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
}
