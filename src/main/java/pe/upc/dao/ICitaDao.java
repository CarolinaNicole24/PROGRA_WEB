package pe.upc.dao;
import java.util.List;

import pe.upc.entity.Cita;
public interface ICitaDao {

	public void insertar(Cita cita);

	public void eliminar(int idCita);

	public List<Cita> listar();

	public void modificar(Cita cita);
}
