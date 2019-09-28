package pe.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.entity.Asesor;
import pe.upc.entity.Mantenimiento;
import pe.upc.entity.Sala;
import pe.upc.service.IAsesorService;
import pe.upc.service.IMantenimientoService;
import pe.upc.service.ISalaService;

@Named
@RequestScoped
public class MantenimientoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IMantenimientoService maService;
	@Inject
	private IAsesorService aService;
	@Inject
	private ISalaService sService;

	private Mantenimiento mantenimiento;
	private Asesor asesor;
	private Sala sala;

	List<Mantenimiento> listaMantenimientos;
	List<Asesor> listaAsesores;
	List<Sala> listaSalas;

	@PostConstruct
	public void init() {
		mantenimiento = new Mantenimiento();
		asesor = new Asesor();
		sala = new Sala();

		listaMantenimientos = new ArrayList<Mantenimiento>();
		listaAsesores = new ArrayList<Asesor>();
		listaSalas = new ArrayList<Sala>();

		this.listMantenimiento();
		this.listAsesor();
		this.listSala();
	}

	public String nuevaMantenimiento() {
		this.setMantenimiento(new Mantenimiento());
		return "mantenimiento.xhtml";
	}

	public void insertar() {
		try {
			maService.insertar(mantenimiento);
			limpiarMantenimiento();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listMantenimiento() {
		try {
			listaMantenimientos = maService.listar();
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

	public void listSala() {
		try {
			listaSalas = sService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void limpiarMantenimiento() {
		this.init();
	}

	public void eliminar(Mantenimiento mantenimiento) {
		try {
			maService.eliminar(mantenimiento.getIdMantenimiento());
			listMantenimiento();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	// get y set

	public Mantenimiento getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public Asesor getAsesor() {
		return asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public List<Mantenimiento> getListaMantenimientos() {
		return listaMantenimientos;
	}

	public void setListaMantenimientos(List<Mantenimiento> listaMantenimientos) {
		this.listaMantenimientos = listaMantenimientos;
	}

	public List<Asesor> getListaAsesores() {
		return listaAsesores;
	}

	public void setListaAsesores(List<Asesor> listaAsesores) {
		this.listaAsesores = listaAsesores;
	}

	public List<Sala> getListaSalas() {
		return listaSalas;
	}

	public void setListaSalas(List<Sala> listaSalas) {
		this.listaSalas = listaSalas;
	}
}

