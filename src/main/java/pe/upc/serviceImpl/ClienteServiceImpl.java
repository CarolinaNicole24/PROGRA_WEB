package pe.upc.serviceImpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.dao.IClienteDao;
import pe.upc.entity.Cliente;
import pe.upc.service.IClienteService;
@Named
@RequestScoped
public class ClienteServiceImpl implements IClienteService,Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IClienteDao cD;
	
	@Override
	public void insertar(Cliente cliente) {
		cD.insertar(cliente);
	}
	
	@Override
	public void eliminar(int idCliente)
	{
		cD.eliminar(idCliente);
	}
	
	@Override
	public List<Cliente> listar()
	{
		return cD.listar();
	}
}
