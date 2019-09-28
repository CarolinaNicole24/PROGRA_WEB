package pe.upc.serviceImpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.dao.IRepuestoDao;
import pe.upc.entity.Repuesto;
import pe.upc.service.IRepuestoService;
@Named
@RequestScoped
public class RepuestoServiceImpl implements IRepuestoService,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRepuestoDao rD;
	
	@Override
	public void insertar(Repuesto repuesto) {
		rD.insertar(repuesto);
	}
	
	@Override
	public void eliminar(int idRepuesto)
	{
		rD.eliminar(idRepuesto);
	}
	
	@Override
	public List<Repuesto> listar()
	{
		return rD.listar();
	}
}
