package pe.upc.daoImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.upc.dao.IVehiculoDao;
import pe.upc.entity.Vehiculo;
public class VehiculoDaoImpl implements IVehiculoDao, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "TrabajoParcial")
	private EntityManager em;
	
	@Transactional	
	@Override
	public void insertar(Vehiculo vehiculo)
	{
		try
		{
			em.persist(vehiculo);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@Transactional	
	@Override
	public void eliminar(int idVehiculo)
	{
	
		Vehiculo veh = new Vehiculo();
		try {
			veh = em.getReference(Vehiculo.class, idVehiculo);
			em.remove(veh);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo> listar()
	{
		List<Vehiculo> lista = new ArrayList<Vehiculo>();
		try
		{
			Query q = em.createQuery("Select h from Vehiculo h");
			lista = (List<Vehiculo>) q.getResultList();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return lista;
	}

}

