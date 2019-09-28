package pe.upc.dao;

import java.util.List;
import pe.upc.entity.Asesor;

public interface IAsesorDao {
	public void insertar(Asesor asesor);
	public void eliminar(int idAsesor);
	public void modificar(Asesor asesor);
	public List<Asesor> listar();
}
