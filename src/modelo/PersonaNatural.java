package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PersonaNatural
 *
 */
@Entity

public class PersonaNatural implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String nombres;
	
	private String apellidos;
	//Preguntar si es valor unico 
	@Column(nullable = false)
	private String cedula;
	
	private String telefono;
	
	private String celular;
	
	private String correo;
	
	private String terceraEdad;
	
	private String discapacidad;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "personaNatural")
	private Contrato contrato;
	
	
	public PersonaNatural() {
	
	}

	

	public PersonaNatural(String nombres, String apellidos, String cedula, String telefono, String celular,
			String correo, String terceraEdad, String discapacidad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.telefono = telefono;
		this.celular = celular;
		this.correo = correo;
		this.terceraEdad = terceraEdad;
		this.discapacidad = discapacidad;
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


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTerceraEdad() {
		return terceraEdad;
	}


	public void setTerceraEdad(String terceraEdad) {
		this.terceraEdad = terceraEdad;
	}


	public String getDiscapacidad() {
		return discapacidad;
	}


	public void setDiscapacidad(String discapacidad) {
		this.discapacidad = discapacidad;
	}


	public Contrato getContrato() {
		return contrato;
	}


	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}


	@Override
	public String toString() {
		return "PersonaNatural [codigo=" + codigo + ", nombres=" + nombres + ", apellidos=" + apellidos + ", cedula="
				+ cedula + ", telefono=" + telefono + ", celular=" + celular + ", correo=" + correo + ", terceraEdad="
				+ terceraEdad + ", discapacidad=" + discapacidad + ", contrato=" + contrato + "]";
	}
	
	
   
}
