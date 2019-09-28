package pe.upc.service;
import java.util.List;
import pe.upc.entity.Repuesto;
public interface IRepuestoService {
	public void insertar(Repuesto repuesto);
	public void eliminar(int idRepuesto);
	public List<Repuesto> listar();
}
