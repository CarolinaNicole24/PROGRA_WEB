package pe.upc.serviceImpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.dao.IVehiculoDao;
import pe.upc.entity.Vehiculo;
import pe.upc.service.IVehiculoService;
@Named
@RequestScoped
public class VehiculoServiceImpl implements IVehiculoService,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IVehiculoDao vD;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		vD.insertar(vehiculo);
	}
	
	@Override
	public void eliminar(int idVehiculo)
	{
		vD.eliminar(idVehiculo);
	}
	
	@Override
	public List<Vehiculo> listar()
	{
		return vD.listar();
	}
}
