package pe.upc.daoImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.upc.dao.IClientexVehiculoDao;

import pe.upc.entity.ClientexVehiculo;

public class ClientexVehiculoDaoImpl implements IClientexVehiculoDao,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="TrabajoParcial")
	private EntityManager em;
	
    @Transactional
	@Override
	public void insertar(ClientexVehiculo clientexVehiculo) {
		// TODO Auto-generated method stub
    	try
		{
			em.persist(clientexVehiculo);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
    @Transactional
	@Override
	public void eliminar(int idClientexVehiculo) {
		// TODO Auto-generated method stub
		
    	ClientexVehiculo emp = new ClientexVehiculo();
		try {
			emp = em.getReference(ClientexVehiculo.class, idClientexVehiculo);
			em.remove(emp);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    	
    	
    	
	}
    
    
    @SuppressWarnings("unchecked")
	@Override
	public List<ClientexVehiculo> listar() {
		// TODO Auto-generated method stub
    	List<ClientexVehiculo> lista = new ArrayList<ClientexVehiculo>();
		try
		{
			Query q = em.createQuery("Select h from ClientexVehiculo h");
			lista = (List<ClientexVehiculo>) q.getResultList();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return lista;
	}

}

