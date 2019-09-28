package pe.upc.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "placa")
public class Placa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPlaca;

	@Column(name = "numeroplaca", nullable = false, length = 50)
	private String numeroplaca;


	public Placa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Placa(int idPlaca, String numeroplaca) {
		this.idPlaca = idPlaca;
		this.numeroplaca = numeroplaca;
		
	}

	public int getIdPlaca() {
		return idPlaca;
	}

	public void setIdPlaca(int idPlaca) {
		this.idPlaca = idPlaca;
	}

	public String getNumeroplaca() {
		return numeroplaca;
	}

	public void setNumeroplaca(String numeroplaca) {
		this.numeroplaca = numeroplaca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPlaca;
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
		Placa other = (Placa) obj;
		if (idPlaca != other.idPlaca)
			return false;
		return true;
	}
}


