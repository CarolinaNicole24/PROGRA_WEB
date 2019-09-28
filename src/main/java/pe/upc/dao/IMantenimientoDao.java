package pe.upc.dao;

import java.util.List;

import pe.upc.entity.Mantenimiento;

public interface IMantenimientoDao {
	public void insertar(Mantenimiento mantenimiento);

	public void eliminar(int idMantenimiento);
	public void modificar(Mantenimiento mantenimiento);
	public List<Mantenimiento> listar();
}
