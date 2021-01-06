package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ComprobanteDePago
 *
 */
@Entity

public class ComprobanteDePago implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String banco;
	
	private String numeroCheque;
	
	private double efectivo;
	
	private String numeroCuenta;
	
	private double valorCuenta;
	
	private String numeroTarjeta;
	
	private double valorTarjeta;
	
	private String entidadFinanciera;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "comprobanteDePago")
	private Contrato contrato;
	
	public ComprobanteDePago() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	public double getEfectivo() {
		return efectivo;
	}

	public void setEfectivo(double efectivo) {
		this.efectivo = efectivo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getValorCuenta() {
		return valorCuenta;
	}

	public void setValorCuenta(double valorCuenta) {
		this.valorCuenta = valorCuenta;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public double getValorTarjeta() {
		return valorTarjeta;
	}

	public void setValorTarjeta(double valorTarjeta) {
		this.valorTarjeta = valorTarjeta;
	}

	public String getEntidadFinanciera() {
		return entidadFinanciera;
	}

	public void setEntidadFinanciera(String entidadFinanciera) {
		this.entidadFinanciera = entidadFinanciera;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "ComprobanteDePago [codigo=" + codigo + ", banco=" + banco + ", numeroCheque=" + numeroCheque
				+ ", efectivo=" + efectivo + ", numeroCuenta=" + numeroCuenta + ", valorCuenta=" + valorCuenta
				+ ", numeroTarjeta=" + numeroTarjeta + ", valorTarjeta=" + valorTarjeta + ", entidadFinanciera="
				+ entidadFinanciera + ", contrato=" + contrato + "]";
	}
	
	
   
}
