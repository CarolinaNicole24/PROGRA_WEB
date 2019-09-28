package pe.upc.serviceImpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.dao.IClientexVehiculoDao;
import pe.upc.entity.ClientexVehiculo;
import pe.upc.service.IClientexVehiculoService;

@Named
@RequestScoped
public class ClientexVehiculoServiceImpl implements IClientexVehiculoService, Serializable   {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject 
	private IClientexVehiculoDao cD;

	@Override
	public void insertar(ClientexVehiculo clientexVehiculo) {
		// TODO Auto-generated method stub
		cD.insertar(clientexVehiculo);
	}

	@Override
	public void eliminar(int idClientexVehiculo) {
		// TODO Auto-generated method stub
		cD.eliminar(idClientexVehiculo);
	}

	@Override
	public List<ClientexVehiculo> listar() {
		// TODO Auto-generated method stub
		return cD.listar();
	}

}

