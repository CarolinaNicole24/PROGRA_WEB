package pe.upc.serviceImpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.dao.IAsesorxSalaDao;
import pe.upc.entity.AsesorxSala;
import pe.upc.service.IAsesorxSalaService;

@Named
@RequestScoped
public class AsesorxSalaServiceImpl implements IAsesorxSalaService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject 
	private IAsesorxSalaDao aD;

	@Override
	public void insertar(AsesorxSala asesorxSala) {
		// TODO Auto-generated method stub
		aD.insertar(asesorxSala);
	}

	@Override
	public void eliminar(int idAsesorxSala) {
		// TODO Auto-generated method stub
		aD.eliminar(idAsesorxSala);
	}

	@Override
	public void modificar(AsesorxSala asesorxSala) {
		// TODO Auto-generated method stub
		aD.modificar(asesorxSala);
		
	}

	@Override
	public List<AsesorxSala> listar() {
		// TODO Auto-generated method stub
		return aD.listar();
	}

}


