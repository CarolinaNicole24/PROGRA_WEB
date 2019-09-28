package pe.upc.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cita")
public class Cita implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCita;
	
	private String fechaCita;

	@ManyToOne
	@JoinColumn(name = "idAsesor")
	private Asesor asesorCita;

	@ManyToOne
	@JoinColumn(name = "idSala")
	private Sala salaCita;
	
	public 	Cita() {
		super();
	}
	public Cita(int idCita, String fechaCita, Asesor asesorCita, Sala salaCita) {
		super();
		this.idCita = idCita;
		this.fechaCita = fechaCita;
		this.asesorCita = asesorCita;
		this.salaCita = salaCita;

	}
	
	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}
	public String getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Asesor getAsesorCita() {
		return asesorCita;
	}

	public void setAsesorCita(Asesor asesorCita) {
		this.asesorCita = asesorCita;
	}

	public Sala getSalaCita() {
		return salaCita;
	}

	public void setSalaCita(Sala salaCita) {
		this.salaCita = salaCita;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCita;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cita other = (Cita) obj;
		if (idCita != other.idCita)
			return false;
		return true;
	}
}
