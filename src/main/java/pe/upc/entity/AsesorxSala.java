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
@Table(name = "asesorxSala")
public class AsesorxSala implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAsesorxSala;

	@ManyToOne
	@JoinColumn(name = "idAsesor")
	private Asesor asesorAsesorxSala;

	@ManyToOne
	@JoinColumn(name = "idSala")
	private Sala salaAsesorxSala;
	
	public AsesorxSala() {
		super();
	}

	public AsesorxSala(int idAsesorxSala, Asesor asesorAsesorxSala,
			Sala salaAsesorxSala) {
		super();
		this.idAsesorxSala = idAsesorxSala;
		this.asesorAsesorxSala = asesorAsesorxSala;
		this.salaAsesorxSala= salaAsesorxSala;
	}

	public int getIdAsesorxSala() {
		return idAsesorxSala;
	}

	public void setIdAsesorxSala(int idAsesorxSala) {
		this.idAsesorxSala = idAsesorxSala;
	}

	public Asesor getAsesorAsesorxSala() {
		return asesorAsesorxSala;
	}

	public void setAsesorAsesorxSala(Asesor asesorAsesorxSala) {
		this.asesorAsesorxSala = asesorAsesorxSala;
	}

	public Sala getSalaAsesorxSala() {
		return salaAsesorxSala;
	}

	public void setSalaAsesorxSala(Sala salaAsesorxSala) {
		this.salaAsesorxSala = salaAsesorxSala;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAsesorxSala;
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
		AsesorxSala other = (AsesorxSala) obj;
		if (idAsesorxSala != other.idAsesorxSala)
			return false;
		return true;
	}
}
