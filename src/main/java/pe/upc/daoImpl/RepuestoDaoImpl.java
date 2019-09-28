package pe.upc.daoImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.upc.dao.IRepuestoDao;
import pe.upc.entity.Repuesto;
public class RepuestoDaoImpl implements IRepuestoDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "TrabajoParcial")
	private EntityManager em;
	
	@Transactional	
	@Override
	public void insertar(Repuesto repuesto)
	{
		try
		{
			em.persist(repuesto);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@Transactional	
	@Override
	public void eliminar(int idRepuesto)
	{
	
		Repuesto rep = new Repuesto();
		try {
			rep = em.getReference(Repuesto.class, idRepuesto);
			em.remove(rep);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Repuesto> listar()
	{
		List<Repuesto> lista = new ArrayList<Repuesto>();
		try
		{
			Query q = em.createQuery("Select h from Repuesto h");
			lista = (List<Repuesto>) q.getResultList();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return lista;
	}

}
