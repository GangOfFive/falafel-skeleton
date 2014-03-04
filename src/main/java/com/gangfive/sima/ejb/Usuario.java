package com.gangfive.sima.ejb;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name="usuarios")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="rol")

// Sobreescribir el delete de Hibernate para que actualice el campo de deleted
@SQLDelete(sql="UPDATE usuarios SET deleted = '1' WHERE id_usuario = ?")
// Filtro agregado para traerse solo los registros no eliminados
@Where(clause="deleted != '1'")

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_usuario")
	private Long id;

	@Column(name="nombre", nullable=false, length=100)
	private String nombre;
	
	@Column(name="primer_apellido", nullable=false, length=100)
	private String primerApellido;
	
	@Column(name="segundo_apellido", nullable=false, length=100)
	private String segundoApellido;
	
	@Column(name="email", nullable=false, unique=true, length=100)
	private String email;
	@Column(name="contrasena", nullable=false, length=60)
	private String contrasena;
	
	@Column(name="celular", nullable=false, length=20)
	private String celular;
	@Column(name="genero", nullable=false)
	private Character genero;
	
	@Column(name="deleted", nullable=false)
	private char deleted;
	
	// TODO: organizaciones, etc

	public Long getId() {
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Character getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
}
