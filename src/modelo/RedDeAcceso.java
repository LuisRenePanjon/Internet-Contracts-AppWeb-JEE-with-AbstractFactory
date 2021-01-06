package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: RedDeAcceso
 *
 */
@Entity

public class RedDeAcceso implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String descripcion;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "redDeAcceso")
	private Contrato contrato;
	
	public RedDeAcceso() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "RedDeAcceso [codigo=" + codigo + ", descripcion=" + descripcion + ", contrato=" + contrato + "]";
	}
	
	
	
	
   
}
