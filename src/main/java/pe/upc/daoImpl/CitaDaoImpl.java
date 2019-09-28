package pe.upc.daoImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.upc.dao.ICitaDao;
import pe.upc.entity.Cita;
public class CitaDaoImpl implements ICitaDao, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "TrabajoParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Cita cita) {
		try {
			em.persist(cita);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void eliminar(int idCita) {

		Cita cit = new Cita();
		try {
			cit = em.getReference(Cita.class, idCita);
			em.remove(cit);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cita> listar() {
		List<Cita> lista = new ArrayList<Cita>();
		try {
			Query q = em.createQuery("Select e from Cita e");
			lista = (List<Cita>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	@Transactional
	@Override
	public void modificar(Cita cita) {
		try {
			em.merge(cita);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

