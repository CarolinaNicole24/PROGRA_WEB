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
@Table(name = "clientexVehiculo")
public class ClientexVehiculo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClientexVehiculo;

	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente clienteClientexVehiculo;

	@ManyToOne
	@JoinColumn(name = "idVehiculo")
	private Vehiculo vehiculoClientexVehiculo;
	
	public ClientexVehiculo() {
		super();
	}

	public ClientexVehiculo(int idClientexVehiculo, Cliente clienteClientexVehiculo,
			Vehiculo vehiculoClientexVehiculo) {
		super();
		this.idClientexVehiculo = idClientexVehiculo;
		this.clienteClientexVehiculo = clienteClientexVehiculo;
		this.vehiculoClientexVehiculo= vehiculoClientexVehiculo;
	}

	public int getIdClientexVehiculo() {
		return idClientexVehiculo;
	}

	public void setIdClientexVehiculo(int idClientexVehiculo) {
		this.idClientexVehiculo = idClientexVehiculo;
	}

	public Cliente getClienteClientexVehiculo() {
		return clienteClientexVehiculo;
	}

	public void setClienteClientexVehiculo(Cliente clienteClientexVehiculo) {
		this.clienteClientexVehiculo = clienteClientexVehiculo;
	}

	public Vehiculo getVehiculoClientexVehiculo() {
		return vehiculoClientexVehiculo;
	}

	public void setVehiculoClientexVehiculo(Vehiculo vehiculoClientexVehiculo) {
		this.vehiculoClientexVehiculo = vehiculoClientexVehiculo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idClientexVehiculo;
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
		ClientexVehiculo other = (ClientexVehiculo) obj;
		if (idClientexVehiculo != other.idClientexVehiculo)
			return false;
		return true;
	}
}


