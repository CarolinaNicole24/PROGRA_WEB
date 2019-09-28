package pe.upc.service;
import java.util.List;
import java.util.Optional; 

import pe.upc.entity.Inicio;
import pe.upc.entity.Usuario;
import pe.upc.entity.TipoUsuario;

public interface ITipoUsuarioService {
	Integer insert(TipoUsuario tU) throws Exception;

	Integer update(TipoUsuario tU) throws Exception;

	Integer delete(TipoUsuario tU) throws Exception;

	List<TipoUsuario> getAll() throws Exception;

	Optional<TipoUsuario> getOne(TipoUsuario tU) throws Exception;

	Integer assignRolesToUser(Usuario usu, List<TipoUsuario> tU) throws Exception;

	List<Inicio> findUserRolesByUser(Usuario usu) throws Exception;
}

