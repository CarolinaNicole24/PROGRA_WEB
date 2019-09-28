package pe.upc.service;
import java.util.List;

import pe.upc.entity.Cita;
public interface ICitaService {
	public void insertar(Cita cita);

	public void eliminar(int idCita);

	public List<Cita> listar();

	public void modificar(Cita cita);
}
