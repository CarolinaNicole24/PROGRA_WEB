package pe.upc.service;
import java.util.List;

import pe.upc.entity.Mantenimiento;
public interface IMantenimientoService {
	public void insertar(Mantenimiento mantenimiento);

	public void eliminar(int idMantenimiento);
	public void modificar(Mantenimiento mantenimiento);
	public List<Mantenimiento> listar();
}
