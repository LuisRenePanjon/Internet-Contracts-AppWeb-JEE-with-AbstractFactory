package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Asesor
 *
 */

@NamedQuery(name = "getByCorreo", query = "SELECT a FROM Asesor a WHERE a.correo = :correo")
@Entity

public class Asesor implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String  nombres;
	
	private String apellidos;
	
	@Column(unique = true, nullable = false)
	private String correo;
	
	private String contrasenia;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "asesor")
	private Contrato contrato;
	
	
	
	
	

	public Asesor() {
		
	}



	public Asesor(String nombres, String apellidos, String correo, String contrasenia, Contrato contrato) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.contrato = contrato;
	}

	


	public Asesor(String nombres, String apellidos, String correo, String contrasenia) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.contrasenia = contrasenia;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getContrasenia() {
		return contrasenia;
	}



	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



	public Contrato getContrato() {
		return contrato;
	}



	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}



	@Override
	public String toString() {
		return "Asesor [codigo=" + codigo + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo=" + correo
				+ ", contrasenia=" + contrasenia + ", contrato=" + contrato + "]";
	}
	
	
	
	
   
}
