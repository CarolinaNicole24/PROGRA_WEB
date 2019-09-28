package pe.upc.serviceImpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.dao.ICitaDao;
import pe.upc.entity.Cita;
import pe.upc.service.ICitaService;
@Named
@RequestScoped
public class CitaServiceImpl implements ICitaService ,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICitaDao cD;
	
	@Override
	public void insertar(Cita cita) {
		cD.insertar(cita);
	}
	
	@Override
	public void eliminar(int idCita)
	{
		cD.eliminar(idCita);
	}
	@Override
	public void modificar(Cita cita) {
		cD.modificar(cita);
	}
	
	@Override
	public List<Cita> listar()
	{
		return cD.listar();
	}
}
