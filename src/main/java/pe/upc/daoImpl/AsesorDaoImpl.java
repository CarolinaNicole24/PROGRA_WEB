package pe.upc.daoImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.upc.dao.IAsesorDao;
import pe.upc.entity.Asesor;

public class AsesorDaoImpl implements IAsesorDao, Serializable {
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TrabajoParcial")
	private EntityManager em;
	
    @Transactional
	@Override
	public void insertar(Asesor asesor) {
		// TODO Auto-generated method stub
    	try
		{
			em.persist(asesor);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
    
    @Transactional
	@Override
	public void eliminar(int idAsesor) {
		// TODO Auto-generated method stub
    	Asesor ase = new Asesor();
		try {
			 ase= em.getReference(Asesor.class, idAsesor);
			em.remove(ase);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Asesor> listar() {
		// TODO Auto-generated method stub
		List<Asesor> lista = new ArrayList<Asesor>();
		try
		{
			Query q = em.createQuery("Select h from Asesor h");
			lista = (List<Asesor>) q.getResultList();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return lista;
	}
	
	@Transactional
	@Override
	public void modificar(Asesor asesor) {
		try {
			em.merge(asesor);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
