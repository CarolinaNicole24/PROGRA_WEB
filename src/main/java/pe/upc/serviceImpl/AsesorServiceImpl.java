package pe.upc.serviceImpl;

import java.io.Serializable;



import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.dao.IAsesorDao;
import pe.upc.entity.Asesor;

import pe.upc.service.IAsesorService;

@Named
@RequestScoped
public class AsesorServiceImpl implements IAsesorService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IAsesorDao aD;
	
	@Override
	public void insertar(Asesor asesor) {
		aD.insertar(asesor);
	}
	
	@Override
	public void eliminar(int idAsesor)
	{
		aD.eliminar(idAsesor);
	}
	
	@Override
	public List<Asesor> listar()
	{
		return aD.listar();
	}
	@Override
	public void modificar(Asesor asesor) {
		aD.modificar(asesor);
	}
}

