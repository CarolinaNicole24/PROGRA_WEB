package pe.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.entity.Vehiculo;
import pe.upc.service.IVehiculoService;

@Named
@RequestScoped
public class VehiculoController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IVehiculoService vService;
	private Vehiculo vehiculo;
	List<Vehiculo>listaVehiculos;
	
	@PostConstruct
	public void init() {
		this.listaVehiculos = new ArrayList<Vehiculo>();
		this.vehiculo = new Vehiculo();
		this.listar();
	}
	public String nuevoVehiculo() {
		this.setVehiculo(new Vehiculo());
		return "vehiculo.xhtml";
	}
	public void insertar() {
		try {
			vService.insertar(vehiculo);
			limpiarVehiculo();
			} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listar() {
		try {
			listaVehiculos = vService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void eliminar(Vehiculo vehiculo) {
		try {
			vService.eliminar(vehiculo.getIdVehiculo());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void limpiarVehiculo() {
		this.init();
	}
	public IVehiculoService getvService() {
		return vService;
	}
	public void setvService(IVehiculoService vService) {
		this.vService = vService;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public List<Vehiculo> getListaVehiculo() {
		return listaVehiculos;
	}
	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
}

