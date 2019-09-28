package pe.upc.dao;
import java.util.List;
import pe.upc.entity.Cliente;
public interface IClienteDao {
	public void insertar(Cliente cliente);

	public void eliminar(int idCliente);

	public List<Cliente> listar();
}
