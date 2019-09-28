package pe.upc.service;
import java.util.List;
import pe.upc.entity.Cliente;
public interface IClienteService {
	public void insertar(Cliente cliente);

	public void eliminar(int idCliente);

	public List<Cliente> listar();
}
