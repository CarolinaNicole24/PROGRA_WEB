package pe.upc.dao;
import java.util.List;
import java.util.Optional; 

import pe.upc.entity.Inicio;
import pe.upc.entity.Usuario;
import pe.upc.entity.TipoUsuario;
public interface ITipoUsuarioDao {
	Integer Insertar(TipoUsuario tip) throws Exception;

	Integer Actualizar(TipoUsuario tip) throws Exception;

	Integer Borrar(TipoUsuario tip) throws Exception;

	List<TipoUsuario> findAll() throws Exception;

	Optional<TipoUsuario> findById(TipoUsuario tip) throws Exception;

	Integer insertUserRole(List<Inicio> tipUsu) throws Exception;

	List<Inicio> findUserRolesByUser(Usuario usu) throws Exception;
}
