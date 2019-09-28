package pe.upc.serviceImpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.dao.IMantenimientoDao;
import pe.upc.entity.Mantenimiento;
import pe.upc.service.IMantenimientoService;

@Named
@RequestScoped
public class MantenimientoServiceImpl  implements IMantenimientoService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IMantenimientoDao mD;

	@Override
	public void insertar(Mantenimiento mantenimiento) {
		mD.insertar(mantenimiento);
	}

	@Override
	public void eliminar(int idMantenimiento) {
		mD.eliminar(idMantenimiento);
	}

	@Override
	public List<Mantenimiento> listar() {
		return mD.listar();
	}
	public void modificar(Mantenimiento mantenimiento) {
		mD.modificar(mantenimiento);
	}

}

