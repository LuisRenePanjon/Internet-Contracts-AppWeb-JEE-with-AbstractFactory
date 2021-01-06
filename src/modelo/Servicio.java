package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Servicio
 *
 */
@Entity

public class Servicio implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String nombre;
	
	private int velocidadComercialUp;
	
	private int velocidadComercialDown;
	
	private int velocidadEfectivaUp;
	
	private int velocidadEfectivaDown;
	
	private String comparticion;
	
	private String permanenciaMinima;
	
	private String tiempoMinimo;
	
	private String beneficios;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "servicio")
	private Contrato contrato;
	
	
	public Servicio() {
		
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getVelocidadComercialUp() {
		return velocidadComercialUp;
	}


	public void setVelocidadComercialUp(int velocidadComercialUp) {
		this.velocidadComercialUp = velocidadComercialUp;
	}


	public int getVelocidadComercialDown() {
		return velocidadComercialDown;
	}


	public void setVelocidadComercialDown(int velocidadComercialDown) {
		this.velocidadComercialDown = velocidadComercialDown;
	}


	public int getVelocidadEfectivaUp() {
		return velocidadEfectivaUp;
	}


	public void setVelocidadEfectivaUp(int velocidadEfectivaUp) {
		this.velocidadEfectivaUp = velocidadEfectivaUp;
	}


	public int getVelocidadEfectivaDown() {
		return velocidadEfectivaDown;
	}


	public void setVelocidadEfectivaDown(int velocidadEfectivaDown) {
		this.velocidadEfectivaDown = velocidadEfectivaDown;
	}


	public String getComparticion() {
		return comparticion;
	}


	public void setComparticion(String comparticion) {
		this.comparticion = comparticion;
	}


	public String getPermanenciaMinima() {
		return permanenciaMinima;
	}


	public void setPermanenciaMinima(String permanenciaMinima) {
		this.permanenciaMinima = permanenciaMinima;
	}


	public String getTiempoMinimo() {
		return tiempoMinimo;
	}


	public void setTiempoMinimo(String tiempoMinimo) {
		this.tiempoMinimo = tiempoMinimo;
	}


	public String getBeneficios() {
		return beneficios;
	}


	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}


	public Contrato getContrato() {
		return contrato;
	}


	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}


	@Override
	public String toString() {
		return "Servicio [codigo=" + codigo + ", nombre=" + nombre + ", velocidadComercialUp=" + velocidadComercialUp
				+ ", velocidadComercialDown=" + velocidadComercialDown + ", velocidadEfectivaUp=" + velocidadEfectivaUp
				+ ", velocidadEfectivaDown=" + velocidadEfectivaDown + ", comparticion=" + comparticion
				+ ", permanenciaMinima=" + permanenciaMinima + ", tiempoMinimo=" + tiempoMinimo + ", beneficios="
				+ beneficios + ", contrato=" + contrato + "]";
	}
	
}
