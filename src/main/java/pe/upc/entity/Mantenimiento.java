package pe.upc.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "mantenimiento")
public class Mantenimiento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMantenimiento;

	@NotEmpty(message = "Ingresar el problema del Mantenimiento")
	@Column(name = "problemaMantenimiento", nullable = false, length = 40)
	private String problemaMantenimiento;

	@NotEmpty(message = "Ingresar una descripcion detallada del Mantenimiento")
	@Column(name = "descripcionMantenimiento", nullable = false, length = 100)
	private String descripcionMantenimiento;

	private String fechaMantenimiento;

	@Min(1)
	@Max(100)
	@Column(name = "participantesMantenimiento", nullable = false)
	private int participantesMantenimiento;

	@NotEmpty(message = "Ingresar un estado del Mantenimiento")
	@Column(name = "estadoMantenimiento", nullable = false, length = 100)
	private String estadoMantenimiento;

	@ManyToOne
	@JoinColumn(name = "idAsesor")
	private Asesor asesorMantenimiento;

	@ManyToOne
	@JoinColumn(name = "idSala")
	private Sala salaMantenimiento;
	
	@ManyToOne
	@JoinColumn(name = "idRepuesto")
	private Repuesto repuestoMantenimiento;

	public Mantenimiento() {
		super();
	}
	public Mantenimiento(int idMantenimiento, String problemaMantenimiento, String descripcionMantenimiento, String fechaMantenimiento,
			int participantesMantenimiento, String estadoMantenimiento, Asesor asesorMantenimiento, Sala salaMantenimiento , Repuesto repuestoMantenimiento) {
		super();
		this.idMantenimiento = idMantenimiento;
		this.problemaMantenimiento = problemaMantenimiento;
		this.descripcionMantenimiento = descripcionMantenimiento;
		this.fechaMantenimiento = fechaMantenimiento;
		this.participantesMantenimiento = participantesMantenimiento;
		this.estadoMantenimiento = estadoMantenimiento;
		this.asesorMantenimiento = asesorMantenimiento;
		this.salaMantenimiento = salaMantenimiento;
		this.repuestoMantenimiento = repuestoMantenimiento;
	}

	public int getIdMantenimiento() {
		return idMantenimiento;
	}

	public void setIdMantenimiento(int idMantenimiento) {
		this.idMantenimiento = idMantenimiento;
	}

	public String getproblemaMantenimiento() {
		return problemaMantenimiento;
	}

	public void setproblemaMantenimiento(String problemaMantenimiento) {
		this.problemaMantenimiento = problemaMantenimiento;
	}

	public String getDescripcionMantenimiento() {
		return descripcionMantenimiento;
	}

	public void setDescripcionMantenimiento(String descripcionMantenimiento) {
		this.descripcionMantenimiento = descripcionMantenimiento;
	}

	public String getFechaMantenimiento() {
		return fechaMantenimiento;
	}

	public void setFechaMantenimiento(String fechaMantenimiento) {
		this.fechaMantenimiento = fechaMantenimiento;
	}

	public int getParticipantesMantenimiento() {
		return participantesMantenimiento;
	}

	public void setParticipantesMantenimiento(int participantesMantenimiento) {
		this.participantesMantenimiento = participantesMantenimiento;
	}

	public String getEstadoMantenimiento() {
		return estadoMantenimiento;
	}

	public void setEstadoMantenimiento(String estadoMantenimiento) {
		this.estadoMantenimiento = estadoMantenimiento;
	}

	public Asesor getAsesorMantenimiento() {
		return asesorMantenimiento;
	}

	public void setAsesorMantenimiento(Asesor asesorMantenimiento) {
		this.asesorMantenimiento = asesorMantenimiento;
	}

	public Sala getSalaMantenimiento() {
		return salaMantenimiento;
	}

	public void setSalaMantenimiento(Sala salaMantenimiento) {
		this.salaMantenimiento = salaMantenimiento;
	}
	public Repuesto getRepuestoMantenimiento() {
		return repuestoMantenimiento;
	}

	public void setRepuestoMantenimiento(Repuesto repuestoMantenimiento) {
		this.repuestoMantenimiento = repuestoMantenimiento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMantenimiento;
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
		Mantenimiento other = (Mantenimiento) obj;
		if (idMantenimiento != other.idMantenimiento)
			return false;
		return true;
	}
	
}


	