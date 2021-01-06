package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TarifaMensual
 *
 */
@Entity

public class TarifaMensual implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private double costoPlanMensual;
	
	private String detalleServicioUno;
	
	private String detalleServicioDos;
	
	private String servicioUno;
	
	private String servicioDos;
	
	private double valorServicioUno;
	
	private double valorServicioDos;
	
	private double totalOtrosServicios;
	
	private double valorOtrosServicios;
	
	private double valorMensualTotal;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "tarifaMensual")
	private Contrato contrato;
	
	public TarifaMensual() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getCostoPlanMensual() {
		return costoPlanMensual;
	}

	public void setCostoPlanMensual(double costoPlanMensual) {
		this.costoPlanMensual = costoPlanMensual;
	}

	public String getDetalleServicioUno() {
		return detalleServicioUno;
	}

	public void setDetalleServicioUno(String detalleServicioUno) {
		this.detalleServicioUno = detalleServicioUno;
	}

	public String getDetalleServicioDos() {
		return detalleServicioDos;
	}

	public void setDetalleServicioDos(String detalleServicioDos) {
		this.detalleServicioDos = detalleServicioDos;
	}

	public String getServicioUno() {
		return servicioUno;
	}

	public void setServicioUno(String servicioUno) {
		this.servicioUno = servicioUno;
	}

	public String getServicioDos() {
		return servicioDos;
	}

	public void setServicioDos(String servicioDos) {
		this.servicioDos = servicioDos;
	}

	public double getValorServicioUno() {
		return valorServicioUno;
	}

	public void setValorServicioUno(double valorServicioUno) {
		this.valorServicioUno = valorServicioUno;
	}

	public double getValorServicioDos() {
		return valorServicioDos;
	}

	public void setValorServicioDos(double valorServicioDos) {
		this.valorServicioDos = valorServicioDos;
	}

	public double getTotalOtrosServicios() {
		return totalOtrosServicios;
	}

	public void setTotalOtrosServicios(double totalOtrosServicios) {
		this.totalOtrosServicios = totalOtrosServicios;
	}

	public double getValorOtrosServicios() {
		return valorOtrosServicios;
	}

	public void setValorOtrosServicios(double valorOtrosServicios) {
		this.valorOtrosServicios = valorOtrosServicios;
	}

	public double getValorMensualTotal() {
		return valorMensualTotal;
	}

	public void setValorMensualTotal(double valorMensualTotal) {
		this.valorMensualTotal = valorMensualTotal;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "TarifaMensual [codigo=" + codigo + ", costoPlanMensual=" + costoPlanMensual + ", detalleServicioUno="
				+ detalleServicioUno + ", detalleServicioDos=" + detalleServicioDos + ", servicioUno=" + servicioUno
				+ ", servicioDos=" + servicioDos + ", valorServicioUno=" + valorServicioUno + ", valorServicioDos="
				+ valorServicioDos + ", totalOtrosServicios=" + totalOtrosServicios + ", valorOtrosServicios="
				+ valorOtrosServicios + ", valorMensualTotal=" + valorMensualTotal + ", contrato=" + contrato + "]";
	}
	
	
   
}
