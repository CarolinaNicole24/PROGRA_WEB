package pe.upc.service;
import java.util.List;

import pe.upc.entity.Vehiculo;
public interface IVehiculoService {
	public void insertar(Vehiculo vehiculo);
	public void eliminar(int idVehiculo);
	public List<Vehiculo> listar();
}

