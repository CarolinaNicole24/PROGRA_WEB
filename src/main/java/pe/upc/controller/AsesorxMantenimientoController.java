package pe.upc.controller;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.entity.Mantenimiento;
import pe.upc.entity.Asesor;
import pe.upc.entity.AsesorxMantenimiento;
import pe.upc.service.IMantenimientoService;
import pe.upc.service.IAsesorService;
import pe.upc.service.IAsesorxMantenimientoService;


@Named
@RequestScoped
public class AsesorxMantenimientoController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IAsesorxMantenimientoService eService;

	@Inject
	private IAsesorService emService;

	@Inject
	private IMantenimientoService aService;

	private AsesorxMantenimiento asesorxMantenimiento;
	private Asesor asesor;
	private Mantenimiento mantenimiento;

	List<AsesorxMantenimiento> listaAsesoresxMantenimiento;
	List<Asesor> listaAsesores;
	List<Mantenimiento> listaMantenimientos;

	private String mensaje = "";

	@PostConstruct
	public void init() {
		listaAsesoresxMantenimiento = new ArrayList<AsesorxMantenimiento>();
		listaAsesores = new ArrayList<Asesor>();
		listaMantenimientos = new ArrayList<Mantenimiento>();

		asesorxMantenimiento = new AsesorxMantenimiento();
		asesor = new Asesor();
		mantenimiento = new Mantenimiento();

		this.listAsesorxMantenimiento();
		this.listAsesor();
		this.listMantenimiento();

	}

	public String nuevoAsesorxMantenimiento() {
		this.setAsesorxMantenimiento(new AsesorxMantenimiento());
		return "asesorxMantenimiento.xhtml";
	}

	public String ModifAsesor(AsesorxMantenimiento _emp) {
		this.setAsesorxMantenimiento(_emp);
		return "modifAsesorxMantenimiento.xhtml";
	}

	public void insertar() {
		try {
			eService.insertar(asesorxMantenimiento);
			limpiarAsesorxMantenimiento();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listAsesorxMantenimiento() {
		try {
			listaAsesoresxMantenimiento = eService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listMantenimiento() {
		try {
			listaMantenimientos = aService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listAsesor() {
		try {
			listaAsesores = emService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void eliminar(AsesorxMantenimiento asesorxMantenimiento) {
		try {
			eService.eliminar(asesorxMantenimiento.getIdAsesorxMantenimiento());
			listAsesorxMantenimiento();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void modificar() {
		try {
			eService.modificar(this.asesorxMantenimiento);
			limpiarAsesorxMantenimiento();
			this.listAsesorxMantenimiento();

		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se puede modificar";
		}
	}

	public void limpiarAsesorxMantenimiento() {
		this.init();
	}

	public AsesorxMantenimiento getAsesorxMantenimiento() {
		return asesorxMantenimiento;
	}

	public void setAsesorxMantenimiento(AsesorxMantenimiento asesorxMantenimiento) {
		this.asesorxMantenimiento = asesorxMantenimiento;
	}

	public List<AsesorxMantenimiento> getListaAsesoresxMantenimiento() {
		return listaAsesoresxMantenimiento;
	}

	public void setListaAsesoresxMantenimiento(List<AsesorxMantenimiento> listaAsesoresxMantenimiento) {
		this.listaAsesoresxMantenimiento = listaAsesoresxMantenimiento;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Asesor getAsesor() {
		return asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

	public Mantenimiento getMantenimiento() {
		return mantenimiento;
	}

	public void setSala(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public List<Asesor> getListaAsesores() {
		return listaAsesores;
	}

	public void setListaAsesores(List<Asesor> listaAsesores) {
		this.listaAsesores = listaAsesores;
	}

	public List<Mantenimiento> getListaMantenimientos() {
		return listaMantenimientos;
	}

	public void setListaMantenimientos(List<Mantenimiento> listaMantenimientos) {
		this.listaMantenimientos = listaMantenimientos;
	}

}
