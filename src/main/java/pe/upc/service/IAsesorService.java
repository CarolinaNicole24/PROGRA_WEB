package pe.upc.service;
import java.util.List;
import pe.upc.entity.Asesor;
public interface IAsesorService {
	public void insertar(Asesor asesor);
	public void eliminar(int idAsesor);
	public void modificar(Asesor asesor);
	public List<Asesor> listar();
}
