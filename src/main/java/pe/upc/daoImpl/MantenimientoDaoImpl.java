package pe.upc.daoImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.upc.dao.IMantenimientoDao;
import pe.upc.entity.Mantenimiento;

public class MantenimientoDaoImpl implements IMantenimientoDao, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "TrabajoParcial")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Mantenimiento mantenimiento) {
		try {
			em.persist(mantenimiento);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Transactional
	@Override
	public void modificar(Mantenimiento mantenimiento) {
		try {
			em.merge(mantenimiento);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Transactional
	@Override
	public void eliminar(int idMantenimiento) {
		Mantenimiento mante = new Mantenimiento();
		try {
			mante = em.getReference(Mantenimiento.class, idMantenimiento);
			em.remove(mante);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mantenimiento> listar() {
		List<Mantenimiento> lista = new ArrayList<Mantenimiento>();
		try {
			Query q = em.createQuery("Select au from Mantenimiento au");
			lista = (List<Mantenimiento>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
}
