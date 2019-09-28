package pe.upc.dao;
import java.util.List;

import pe.upc.entity.Vehiculo;
public interface IVehiculoDao {
	public void insertar(Vehiculo vehiculo);
	public void eliminar(int idVehiculo);
	public List<Vehiculo> listar();
}
