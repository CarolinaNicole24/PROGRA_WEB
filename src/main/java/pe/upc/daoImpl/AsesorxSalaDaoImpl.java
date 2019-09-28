package pe.upc.daoImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.upc.dao.IAsesorxSalaDao;

import pe.upc.entity.AsesorxSala;
public class AsesorxSalaDaoImpl implements IAsesorxSalaDao,Serializable {
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="TrabajoParcial")
	private EntityManager em;
	
    @Transactional
	@Override
	public void insertar(AsesorxSala asesorxSala) {
		// TODO Auto-generated method stub
    	try
		{
			em.persist(asesorxSala);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
    @Transactional
	@Override
	public void eliminar(int idAsesorxSala) {
		// TODO Auto-generated method stub
		
    	AsesorxSala emp = new AsesorxSala();
		try {
			emp = em.getReference(AsesorxSala.class, idAsesorxSala);
			em.remove(emp);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    	
    	
    	
	}
    
    @Transactional
	@Override
	public void modificar(AsesorxSala asesorxSala) {
		// TODO Auto-generated method stub
		
    	try {
			em.merge(asesorxSala);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
    
    @SuppressWarnings("unchecked")
	@Override
	public List<AsesorxSala> listar() {
		// TODO Auto-generated method stub
    	List<AsesorxSala> lista = new ArrayList<AsesorxSala>();
		try
		{
			Query q = em.createQuery("Select h from AsesorxSala h");
			lista = (List<AsesorxSala>) q.getResultList();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return lista;
	}

}
