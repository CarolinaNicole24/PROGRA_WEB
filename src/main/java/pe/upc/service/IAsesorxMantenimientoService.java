package pe.upc.service;
import java.util.List;

import pe.upc.entity.AsesorxMantenimiento;
public interface IAsesorxMantenimientoService {
	public void insertar (AsesorxMantenimiento asesorxMantenimiento);
	public void eliminar (int idAsesorxMantenimiento);
	public void modificar (AsesorxMantenimiento asesorxMantenimiento);
	public List<AsesorxMantenimiento> listar();
}
