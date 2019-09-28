package pe.upc.controller;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.upc.entity.Asesor;
import pe.upc.service.IAsesorService;

@Named
@RequestScoped
public class AsesorController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Inject
	private IAsesorService aService;
	private Asesor asesor;

	List<Asesor> listaAsesores;
	

	@PostConstruct
	public void init() {
		asesor = new Asesor();
		listaAsesores= new ArrayList<Asesor>();
		this.listAsesor();
		
	}

	public String nuevoAsesor() {
		this.setAsesor(new Asesor());
		return "asesor.xhtml";
	}

	public void insertar() {
		try {
			aService.insertar(asesor);
			limpiarAsesor();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listAsesor() {
		try {
			listaAsesores = aService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void limpiarAsesor() {
		this.init();
	}

	public void eliminar(Asesor asesor) {
		try {
			aService.eliminar(asesor.getIdAsesor());
			listAsesor();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// get y set

	public Asesor getAsesor() {
		return asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

	public List<Asesor> getListaAsesores() {
		return listaAsesores;
	}

	public void setListaAsesores(List<Asesor> listaAsesores) {
		this.listaAsesores = listaAsesores;
	}

}
