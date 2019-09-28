package pe.upc.controller;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.entity.Cita;
import pe.upc.service.ICitaService;

@Named
@RequestScoped
public class CitaController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject
	private ICitaService cService;
	private Cita cita;

	List<Cita> listaCitas;
	

	@PostConstruct
	public void init() {
		cita = new Cita();
		listaCitas= new ArrayList<Cita>();
		this.listCita();
		
	}

	public String nuevoCita() {
		this.setCita(new Cita());
		return "cita.xhtml";
	}

	public void insertar() {
		try {
			cService.insertar(cita);
			limpiarCita();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listCita() {
		try {
			listaCitas = cService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void limpiarCita() {
		this.init();
	}

	public void eliminar(Cita cita) {
		try {
			cService.eliminar(cita.getIdCita());
			listCita();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// get y set

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public List<Cita> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(List<Cita> listaCitas) {
		this.listaCitas = listaCitas;
	}

}
