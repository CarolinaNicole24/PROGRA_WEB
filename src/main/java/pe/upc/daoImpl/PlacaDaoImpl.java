package pe.upc.daoImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.upc.dao.IPlacaDao;
import pe.upc.entity.Placa;
public class PlacaDaoImpl implements IPlacaDao, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "TrabajoParcial")
	private EntityManager em;
	
	@Transactional	
	@Override
	public void insertar(Placa placa)
	{
		try
		{
			em.persist(placa);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@Transactional	
	@Override
	public void eliminar(int idPlaca)
	{
	
		Placa pla = new Placa();
		try {
			pla = em.getReference(Placa.class, idPlaca);
			em.remove(pla);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Placa> listar()
	{
		List<Placa> lista = new ArrayList<Placa>();
		try
		{
			Query q = em.createQuery("Select h from Placa h");
			lista = (List<Placa>) q.getResultList();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return lista;
	}

}

