package pe.upc.dao;
import java.util.List;

import pe.upc.entity.ClientexVehiculo;
public interface IClientexVehiculoDao {
	public void insertar (ClientexVehiculo ClientexVehiculo);
	public void eliminar (int idClientexVehiculo);
	public List<ClientexVehiculo> listar();
}
