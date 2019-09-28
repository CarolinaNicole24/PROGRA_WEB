package pe.upc.service;
import java.util.List;

import pe.upc.entity.ClientexVehiculo;
public interface IClientexVehiculoService {
	public void insertar (ClientexVehiculo ClientexVehiculo);
	public void eliminar (int idClientexVehiculo);
	public List<ClientexVehiculo> listar();
}
