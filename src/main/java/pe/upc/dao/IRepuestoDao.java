package pe.upc.dao;
import java.util.List;
import pe.upc.entity.Repuesto;

public interface IRepuestoDao {
	public void insertar(Repuesto repuesto);
	public void eliminar(int idRepuesto);
	public List<Repuesto> listar();
}
