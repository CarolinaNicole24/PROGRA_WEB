package pe.upc.dao;
import java.util.List;

import pe.upc.entity.Placa;
public interface IPlacaDao {

	public void insertar(Placa placa);
	public void eliminar(int idPlaca);
	public List<Placa> listar();
}
