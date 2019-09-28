package pe.upc.serviceImpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.dao.IPlacaDao;
import pe.upc.entity.Placa;
import pe.upc.service.IPlacaService;
@Named
@RequestScoped
public class PlacaServiceImpl implements IPlacaService,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPlacaDao pD;
	
	@Override
	public void insertar(Placa placa) {
		pD.insertar(placa);
	}
	
	@Override
	public void eliminar(int idPlaca)
	{
		pD.eliminar(idPlaca);
	}
	
	@Override
	public List<Placa> listar()
	{
		return pD.listar();
	}
}
