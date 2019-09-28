package pe.upc.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="asesor")
public class Asesor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAsesor;
	
	@NotEmpty(message = "Ingrese los nombres del asesor")
	@Column(name = "nombreAsesor", nullable = false, length = 50)
	private String nombreAsesor;

	@NotEmpty(message = "Ingrese los apellidos del asesor")
	@Column(name = "apellidoAsesor", nullable = false, length = 50)
	private String apellidoAsesor;
	
	
	@NotEmpty(message = "Ingrese el DNI del asesor")
	@Column(name = "dniAsesor", nullable = false, length = 8)
	private String dniAsesor; 
	
	
	@NotEmpty(message = "Ingrese el puesto laboral del asesor")
	@Column(name = "puestolaboralAsesor", nullable = false, length = 30)
	private String puestolaboralAsesor; 
	
	
	@NotEmpty(message = "Ingrese el numero de celular del asesor")
	@Column(name = "celularAsesor", nullable = false, length = 9)
	private String celularAsesor;

public Asesor() {
	super();
	// TODO Auto-generated constructor stub
}
public Asesor(int idAsesor, @NotEmpty(message = "Ingrese los nombres del asesor") String nombreAsesor,
		@NotEmpty(message = "Ingrese los apellidos del asesor") String apellidoAsesor,
		 @NotEmpty(message = "Ingrese el DNI del asesor") String dniAsesor,
		@NotEmpty(message = "Ingrese el puesto laboral del asesor") String puestolaboralAsesor,
		 @NotEmpty(message = "Ingrese el numero de celular del asesor") String celularAsesor) {
	super();
	this.idAsesor = idAsesor;
	this.nombreAsesor = nombreAsesor;
	this.apellidoAsesor = apellidoAsesor;
	this.dniAsesor = dniAsesor;
	this.puestolaboralAsesor = puestolaboralAsesor;
	this.celularAsesor= celularAsesor;
}

public int getIdAsesor() {
	return idAsesor;
}

public void setIdAsesor(int idAsesor) {
	this.idAsesor = idAsesor;
}

public String getNombreAsesor() {
	return nombreAsesor;
}

public void setNombreAsesor(String nombreAsesor) {
	this.nombreAsesor = nombreAsesor;
}

public String getApellidoAsesor() {
	return apellidoAsesor;
}

public void setApellidoAsesor(String apellidoAsesor) {
	this.apellidoAsesor = apellidoAsesor;
}

public String getDniAsesor() {
	return dniAsesor;
}

public void setDniAsesor(String dniAsesor) {
	this.dniAsesor = dniAsesor;
}

public String getPuestolaboralAsesor() {
	return puestolaboralAsesor;
}

public void setPuestolaboralAsesor(String puestolaboralAsesor) {
	this.puestolaboralAsesor = puestolaboralAsesor;
}

public String getCelularAsesor() {
	return celularAsesor;
}

public void setCelularAsesor(String celularAsesor) {
	this.celularAsesor = celularAsesor;
} 

}
