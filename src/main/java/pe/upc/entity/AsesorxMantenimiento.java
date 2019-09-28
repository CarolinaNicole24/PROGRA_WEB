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
@Table(name = "asesorxMantenimiento")
public class AsesorxMantenimiento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAsesorxMantenimiento;

	@ManyToOne
	@JoinColumn(name = "idAsesor")
	private Asesor asesorAsesorxMantenimiento;

	@ManyToOne
	@JoinColumn(name = "idMantenimiento")
	private Mantenimiento mantenimientoAsesorxMantenimiento;
	
	public AsesorxMantenimiento() {
		super();
	}

	public AsesorxMantenimiento(int idAsesorxMantenimiento, Asesor asesorAsesorxMantenimiento,
			Mantenimiento mantenimientoAsesorxMantenimiento) {
		super();
		this.idAsesorxMantenimiento = idAsesorxMantenimiento;
		this.asesorAsesorxMantenimiento = asesorAsesorxMantenimiento;
		this.mantenimientoAsesorxMantenimiento = mantenimientoAsesorxMantenimiento;
	}

	public int getIdAsesorxMantenimiento() {
		return idAsesorxMantenimiento;
	}

	public void setIdAsesorxMantenimiento(int idAsesorxMantenimiento) {
		this.idAsesorxMantenimiento = idAsesorxMantenimiento;
	}

	public Asesor getAsesorAsesorxMantenimiento() {
		return asesorAsesorxMantenimiento;
	}

	public void setAsesorAsesorxMantenimiento(Asesor asesorAsesorxMantenimiento) {
		this.asesorAsesorxMantenimiento = asesorAsesorxMantenimiento;
	}

	public Mantenimiento getMantenimientoAsesorxMantenimiento() {
		return mantenimientoAsesorxMantenimiento;
	}

	public void setMantenimientoAsesorxMantenimiento(Mantenimiento mantenimientoAsesorxMantenimiento) {
		this.mantenimientoAsesorxMantenimiento = mantenimientoAsesorxMantenimiento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAsesorxMantenimiento;
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
		AsesorxMantenimiento other = (AsesorxMantenimiento) obj;
		if (idAsesorxMantenimiento != other.idAsesorxMantenimiento)
			return false;
		return true;
	}
}
