package pe.upc.service;
import java.util.List;

import pe.upc.entity.AsesorxSala;
public interface IAsesorxSalaService {
	public void insertar (AsesorxSala asesorxSala);
	public void eliminar (int idAsesorxSala);
	public void modificar (AsesorxSala asesorxMantenimiento);
	public List<AsesorxSala> listar();
}

