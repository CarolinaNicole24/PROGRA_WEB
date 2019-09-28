package pe.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.entity.Repuesto;
import pe.upc.service.IRepuestoService;

@Named
@RequestScoped
public class RepuestoController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IRepuestoService rService;
	private Repuesto repuesto;
	List<Repuesto>listaRepuestos;
	
	@PostConstruct
	public void init() {
		this.listaRepuestos = new ArrayList<Repuesto>();
		this.repuesto = new Repuesto();
		this.listar();
	}
	public String nuevoRepuesto() {
		this.setRepuesto(new Repuesto());
		return "repuesto.xhtml";
	}
	public void insertar() {
		try {
			rService.insertar(repuesto);
			limpiarRepuesto();
			} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listar() {
		try {
			listaRepuestos = rService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void eliminar(Repuesto repuesto) {
		try {
			rService.eliminar(repuesto.getIdRepuesto());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void limpiarRepuesto() {
		this.init();
	}
	public IRepuestoService gethService() {
		return rService;
	}
	public void setrService(IRepuestoService rService) {
		this.rService = rService;
	}
	public Repuesto getRepuesto() {
		return repuesto;
	}
	public void setRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}
	public List<Repuesto> getListaRepuestos() {
		return listaRepuestos;
	}
	public void setListaRepuestos(List<Repuesto> listaRepuestos) {
		this.listaRepuestos = listaRepuestos;
	}
	
}

