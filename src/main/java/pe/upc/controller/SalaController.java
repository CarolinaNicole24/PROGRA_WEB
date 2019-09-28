package pe.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.entity.Sala;
import pe.upc.service.ISalaService;

@Named
@RequestScoped
public class SalaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ISalaService sService;


	private Sala sala;
	private String mensaje = "";

	List<Sala> listarSalas;


	@PostConstruct
	public void init() {
		listarSalas = new ArrayList<Sala>();
		

		sala = new Sala();
		
		this.listSala();
	
	}

	public String nuevoSala() {
		this.setSala(new Sala());
		return "sala.xhtml";
	}
	
	
	public String Modifsala(Sala _sala) {
		this.setSala(_sala);
		return "modifSala.xhtml";
		
	}

	public void insertar() {
		try {
			sService.insertar(sala);
			limpiarSala();
			mensaje = "Se registró correctamente";
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listSala() {
		try {
			listarSalas = sService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}


	public void eliminar(Sala sala) {
		try {
			sService.eliminar(sala.getIdSala());
			listSala();
		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se puede eliminar";
		}
	}
	
	public void modificar() {
		try {
			sService.modificar(this.sala);
			limpiarSala();
			this.listSala();
			
		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se puede modificar";
		}
	}

	public void limpiarSala() {
		this.init();
	}

	// get y set

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}


	public List<Sala> getListarSalas() {
		return listarSalas;
	}

	public void setListarSalas(List<Sala> listarSalas) {
		this.listarSalas = listarSalas;
	}


	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
