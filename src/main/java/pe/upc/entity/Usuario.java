package pe.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Usuario")

public class Usuario implements Serializable  {
	private static final long serialVersionUID = 1L;

	@Id 
	private int idusuario;

	@Column(name = "nusuario", nullable = false, length = 30)
	private String nusuario;

	@Column(name = "contra", nullable = false, length = 50)
	private String contraseña;
	@Column(name = "estado", nullable = false, length = 1)
	private String estado;

	

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNusuario() {
		return nusuario;
	}

	public void setNusuario(String nusuario) {
		this.nusuario = nusuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
