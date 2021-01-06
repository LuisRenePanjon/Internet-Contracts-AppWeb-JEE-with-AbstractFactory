package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ServicioAdicional
 *
 */
@Entity

public class ServicioAdicional implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String email;
	
	private String emailDescripcion;
	
	private String otrosServicios;
	
	private String otrosServiciosDescripcion;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "servicioAdicional")
	private Contrato contrato;
	
	public ServicioAdicional() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailDescripcion() {
		return emailDescripcion;
	}

	public void setEmailDescripcion(String emailDescripcion) {
		this.emailDescripcion = emailDescripcion;
	}

	public String getOtrosServicios() {
		return otrosServicios;
	}

	public void setOtrosServicios(String otrosServicios) {
		this.otrosServicios = otrosServicios;
	}

	public String getOtrosServiciosDescripcion() {
		return otrosServiciosDescripcion;
	}

	public void setOtrosServiciosDescripcion(String otrosServiciosDescripcion) {
		this.otrosServiciosDescripcion = otrosServiciosDescripcion;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "ServicioAdicional [codigo=" + codigo + ", email=" + email + ", emailDescripcion=" + emailDescripcion
				+ ", otrosServicios=" + otrosServicios + ", otrosServiciosDescripcion=" + otrosServiciosDescripcion
				+ ", contrato=" + contrato + "]";
	}
	
	
   
}
