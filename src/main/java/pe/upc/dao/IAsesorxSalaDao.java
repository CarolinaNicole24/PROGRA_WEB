package pe.upc.dao;
import java.util.List;

import pe.upc.entity.AsesorxSala;
public interface IAsesorxSalaDao {
	public void insertar (AsesorxSala asesorxSala);
	public void eliminar (int idAsesorxSala);
	public void modificar (AsesorxSala asesorxMantenimiento);
	public List<AsesorxSala> listar();
}
