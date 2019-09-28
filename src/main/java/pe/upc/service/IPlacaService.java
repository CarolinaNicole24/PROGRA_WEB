package pe.upc.service;
import java.util.List;

import pe.upc.entity.Placa;
public interface IPlacaService {

	public void insertar(Placa placa);
	public void eliminar(int idPlaca);
	public List<Placa> listar();
}
