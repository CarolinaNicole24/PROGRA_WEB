package pe.upc.service;
import java.util.List;

import pe.upc.entity.Sala;
public interface ISalaService {

	public void insertar(Sala sala);

	public void eliminar(int idSala);
	
	public void modificar(Sala sala);

	public List<Sala> listar();

}
