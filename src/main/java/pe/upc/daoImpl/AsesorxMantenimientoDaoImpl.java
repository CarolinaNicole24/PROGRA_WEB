package pe.upc.daoImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.upc.dao.IAsesorxMantenimientoDao;

import pe.upc.entity.AsesorxMantenimiento;

public class AsesorxMantenimientoDaoImpl implements IAsesorxMantenimientoDao,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="TrabajoParcial")
	private EntityManager em;
	
    @Transactional
	@Override
	public void insertar(AsesorxMantenimiento asesorxMantenimiento) {
		// TODO Auto-generated method stub
    	try
		{
			em.persist(asesorxMantenimiento);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
    @Transactional
	@Override
	public void eliminar(int idAsesorxMantenimiento) {
		// TODO Auto-generated method stub
		
    	AsesorxMantenimiento emp = new AsesorxMantenimiento();
		try {
			emp = em.getReference(AsesorxMantenimiento.class, idAsesorxMantenimiento);
			em.remove(emp);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}   	
	}
    
    @Transactional
	@Override
	public void modificar(AsesorxMantenimiento asesorxMantenimiento) {
		// TODO Auto-generated method stub
		
    	try {
			em.merge(asesorxMantenimiento);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
    
    @SuppressWarnings("unchecked")
	@Override
	public List<AsesorxMantenimiento> listar() {
		// TODO Auto-generated method stub
    	List<AsesorxMantenimiento> lista = new ArrayList<AsesorxMantenimiento>();
		try
		{
			Query q = em.createQuery("Select h from AsesorxMantenimiento h");
			lista = (List<AsesorxMantenimiento>) q.getResultList();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return lista;
	}

}

