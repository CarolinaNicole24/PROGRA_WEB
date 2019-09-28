package pe.upc.serviceImpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.dao.IAsesorxMantenimientoDao;
import pe.upc.entity.AsesorxMantenimiento;
import pe.upc.service.IAsesorxMantenimientoService;

@Named
@RequestScoped
public class AsesorxMantenimientoServiceImpl implements IAsesorxMantenimientoService, Serializable   {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject 
	private IAsesorxMantenimientoDao aD;

	@Override
	public void insertar(AsesorxMantenimiento asesorxMantenimiento) {
		// TODO Auto-generated method stub
		aD.insertar(asesorxMantenimiento);
	}

	@Override
	public void eliminar(int idAsesorxMantenimiento) {
		// TODO Auto-generated method stub
		aD.eliminar(idAsesorxMantenimiento);
	}

	@Override
	public void modificar(AsesorxMantenimiento asesorxMantenimiento) {
		// TODO Auto-generated method stub
		aD.modificar(asesorxMantenimiento);
		
	}

	@Override
	public List<AsesorxMantenimiento> listar() {
		// TODO Auto-generated method stub
		return aD.listar();
	}

}

