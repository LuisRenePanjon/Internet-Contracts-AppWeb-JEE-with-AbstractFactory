package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FormaDePago
 *
 */
@Entity

public class FormaDePago implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String descripcionPago;
	
	private String numeroCuenta;
	
	private String tipoCuenta;
	
	private String entidadFinancieraCuenta;
	
	private String numeroTarjeta;
	
	private String fechaExpTarjeta;
	
	private String entidadFinancieraTarjeta;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "formaDePago")
	private Contrato contrato;
	
	

	public FormaDePago() {
		
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getDescripcionPago() {
		return descripcionPago;
	}



	public void setDescripcionPago(String descripcionPago) {
		this.descripcionPago = descripcionPago;
	}



	public String getNumeroCuenta() {
		return numeroCuenta;
	}



	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}



	public String getTipoCuenta() {
		return tipoCuenta;
	}



	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}



	public String getEntidadFinancieraCuenta() {
		return entidadFinancieraCuenta;
	}



	public void setEntidadFinancieraCuenta(String entidadFinancieraCuenta) {
		this.entidadFinancieraCuenta = entidadFinancieraCuenta;
	}



	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}



	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}



	public String getFechaExpTarjeta() {
		return fechaExpTarjeta;
	}



	public void setFechaExpTarjeta(String fechaExpTarjeta) {
		this.fechaExpTarjeta = fechaExpTarjeta;
	}



	public String getEntidadFinancieraTarjeta() {
		return entidadFinancieraTarjeta;
	}



	public void setEntidadFinancieraTarjeta(String entidadFinancieraTarjeta) {
		this.entidadFinancieraTarjeta = entidadFinancieraTarjeta;
	}



	public Contrato getContrato() {
		return contrato;
	}



	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}



	@Override
	public String toString() {
		return "FormaDePago [codigo=" + codigo + ", descripcionPago=" + descripcionPago + ", numeroCuenta="
				+ numeroCuenta + ", tipoCuenta=" + tipoCuenta + ", entidadFinancieraCuenta=" + entidadFinancieraCuenta
				+ ", numeroTarjeta=" + numeroTarjeta + ", fechaExpTarjeta=" + fechaExpTarjeta
				+ ", entidadFinancieraTarjeta=" + entidadFinancieraTarjeta + ", contrato=" + contrato + "]";
	}
   
	
	
	
}
