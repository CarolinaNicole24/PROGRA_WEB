package pe.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.entity.Sala;
import pe.upc.entity.Asesor;
import pe.upc.entity.AsesorxSala;
import pe.upc.service.ISalaService;
import pe.upc.service.IAsesorService;
import pe.upc.service.IAsesorxSalaService;

@Named
@RequestScoped
public class AsesorxSalaController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IAsesorxSalaService eService;

	@Inject
	private IAsesorService emService;

	@Inject
	private ISalaService aService;

	private AsesorxSala asesorxSala;
	private Asesor asesor;
	private Sala sala;

	List<AsesorxSala> listaAsesoresxSala;
	List<Asesor> listaAsesores;
	List<Sala> listaSalas;

	private String mensaje = "";

	@PostConstruct
	public void init() {
		listaAsesoresxSala = new ArrayList<AsesorxSala>();
		listaAsesores = new ArrayList<Asesor>();
		listaSalas = new ArrayList<Sala>();

		asesorxSala = new AsesorxSala();
		asesor = new Asesor();
		sala = new Sala();

		this.listAsesorxSala();
		this.listAsesor();
		this.listSala();

	}

	public String nuevoAsesorxSala() {
		this.setAsesorxSala(new AsesorxSala());
		return "asesorxSala.xhtml";
	}

	public String ModifAsesor(AsesorxSala _emp) {
		this.setAsesorxSala(_emp);
		return "modifAsesorxSala.xhtml";
	}

	public void insertar() {
		try {
			eService.insertar(asesorxSala);
			limpiarAsesorxSala();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listAsesorxSala() {
		try {
			listaAsesoresxSala = eService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listSala() {
		try {
			listaSalas = aService.listar();
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

	public void eliminar(AsesorxSala asesorxSala) {
		try {
			eService.eliminar(asesorxSala.getIdAsesorxSala());
			listAsesorxSala();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void modificar() {
		try {
			eService.modificar(this.asesorxSala);
			limpiarAsesorxSala();
			this.listAsesorxSala();

		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se puede modificar";
		}
	}

	public void limpiarAsesorxSala() {
		this.init();
	}

	public AsesorxSala getAsesorxSala() {
		return asesorxSala;
	}

	public void setAsesorxSala(AsesorxSala asesorxSala) {
		this.asesorxSala = asesorxSala;
	}

	public List<AsesorxSala> getListaAsesoresxSala() {
		return listaAsesoresxSala;
	}

	public void setListaAsesoresxSala(List<AsesorxSala> listaAsesoresxSala) {
		this.listaAsesoresxSala = listaAsesoresxSala;
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

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
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
