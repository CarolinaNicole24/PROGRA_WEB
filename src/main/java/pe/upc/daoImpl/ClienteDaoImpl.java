package pe.upc.daoImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.upc.dao.IClienteDao;
import pe.upc.entity.Cliente;

public class ClienteDaoImpl implements IClienteDao, Serializable {
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TrabajoParcial")
	private EntityManager em;
	
    @Transactional
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
    	try
		{
			em.persist(cliente);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
    
    @Transactional
	@Override
	public void eliminar(int idCliente) {
		// TODO Auto-generated method stub
    	Cliente cli = new Cliente();
		try {
			 cli= em.getReference(Cliente.class, idCliente);
			em.remove(cli);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		List<Cliente> lista = new ArrayList<Cliente>();
		try
		{
			Query q = em.createQuery("Select h from Cliente h");
			lista = (List<Cliente>) q.getResultList();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return lista;
	}
	

}
