package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TarifaUnPago
 *
 */
@Entity

public class TarifaUnPago implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private double costoInstalacion;
	
	private String plazoInstalacion;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "tarifaUnPago")
	private Contrato contrato;
		
	public TarifaUnPago() {
		
	}


	public int getCodigo() {
		return codigo;
	}


	
	
	public Contrato getContrato() {
		return contrato;
	}


	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public double getCostoInstalacion() {
		return costoInstalacion;
	}


	public void setCostoInstalacion(double costoInstalacion) {
		this.costoInstalacion = costoInstalacion;
	}


	public String getPlazoInstalacion() {
		return plazoInstalacion;
	}


	public void setPlazoInstalacion(String plazoInstalacion) {
		this.plazoInstalacion = plazoInstalacion;
	}


	@Override
	public String toString() {
		return "TarifaUnPago [codigo=" + codigo + ", costoInstalacion=" + costoInstalacion + ", plazoInstalacion="
				+ plazoInstalacion + ", contrato=" + contrato + "]";
	}
	
	
	
   
}
