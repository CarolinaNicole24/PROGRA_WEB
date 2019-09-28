package pe.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.entity.Placa;
import pe.upc.service.IPlacaService;

@Named
@RequestScoped
public class PlacaController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IPlacaService pService;
	private Placa placa;
	List<Placa>listaPlacas;
	
	@PostConstruct
	public void init() {
		this.listaPlacas = new ArrayList<Placa>();
		this.placa = new Placa();
		this.listar();
	}
	public String nuevoPlaca() {
		this.setPlaca(new Placa());
		return "placa.xhtml";
	}
	public void insertar() {
		try {
			pService.insertar(placa);
			limpiarPlaca();
			} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listar() {
		try {
			listaPlacas = pService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void eliminar(Placa placa) {
		try {
			pService.eliminar(placa.getIdPlaca());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void limpiarPlaca() {
		this.init();
	}
	public IPlacaService getpService() {
		return pService;
	}
	public void setpService(IPlacaService pService) {
		this.pService = pService;
	}
	public Placa getPlaca() {
		return placa;
	}
	public void setPlaca(Placa placa) {
		this.placa = placa;
	}
	public List<Placa> getListaPlacas() {
		return listaPlacas;
	}
	public void setListaPlacas(List<Placa> listaPlacas) {
		this.listaPlacas = listaPlacas;
	}
	
}

