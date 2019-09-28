package pe.upc.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "repuesto")
public class Repuesto implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRepuesto;

	@NotEmpty(message = "Ingresa el nombre del Repuesto")
	@Column(name = "nombreRepuesto", nullable = false, length = 50)
	private String nombreRepuesto;

	@Min(1)
	@Max(500)
	@Column(name = "stockRepuesto", nullable = false)
	private int stockRepuesto;

	@NotEmpty(message = "Ingresa las unidades")
	@Column(name = "unidadRepuesto", nullable = false, length = 50)
	private String unidadRepuesto;

	public Repuesto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Repuesto(int idRepuesto, String nombreRepuesto, int stockRepuesto, String unidadRepuesto) {
		this.idRepuesto = idRepuesto;
		this.nombreRepuesto = nombreRepuesto;
		this.stockRepuesto = stockRepuesto;
		this.unidadRepuesto = unidadRepuesto;
	}

	public int getIdRepuesto() {
		return idRepuesto;
	}

	public void setIdRepuesto(int idRepuesto) {
		this.idRepuesto = idRepuesto;
	}

	public String getNombreRepuesto() {
		return nombreRepuesto;
	}

	public void setNombreRepuesto(String nombreRepuesto) {
		this.nombreRepuesto = nombreRepuesto;
	}

	public int getStockRepuesto() {
		return stockRepuesto;
	}

	public void setStockRepuesto(int stockRepuesto) {
		this.stockRepuesto = stockRepuesto;
	}

	public String getUnidadRepuesto() {
		return unidadRepuesto;
	}

	public void setUnidadRepuesto(String unidadRepuesto) {
		this.unidadRepuesto = unidadRepuesto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idRepuesto;
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
		Repuesto other = (Repuesto) obj;
		if (idRepuesto != other.idRepuesto)
			return false;
		return true;
	}
}

