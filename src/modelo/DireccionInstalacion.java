package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DireccionInstalacion
 *
 */
@Entity

public class DireccionInstalacion implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String provincia;
	
	private String ciudad;
	
	private String canton;
	
	private String parroquia;
	
	private String callePrincipal;

	private String calleSecundaria;
	
	private String Urbanizacion;
	
	private String sector;
	
	private String pisoOManzana;
	
	private String numeroUOficina;
	
	private String Observaciones;
	
	private String codigoMedidor;
	
	private String proveedorAnterior;
	
	private String caja;
	
	private String tipoCuenta;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "direccionInstalacion")
	private Contrato contrato;
	
	public DireccionInstalacion() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public String getParroquia() {
		return parroquia;
	}

	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}

	public String getCallePrincipal() {
		return callePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	public String getCalleSecundaria() {
		return calleSecundaria;
	}

	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}

	public String getUrbanizacion() {
		return Urbanizacion;
	}

	public void setUrbanizacion(String urbanizacion) {
		Urbanizacion = urbanizacion;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getPisoOManzana() {
		return pisoOManzana;
	}

	public void setPisoOManzana(String pisoOManzana) {
		this.pisoOManzana = pisoOManzana;
	}

	public String getNumeroUOficina() {
		return numeroUOficina;
	}

	public void setNumeroUOficina(String numeroUOficina) {
		this.numeroUOficina = numeroUOficina;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	public String getCodigoMedidor() {
		return codigoMedidor;
	}

	public void setCodigoMedidor(String codigoMedidor) {
		this.codigoMedidor = codigoMedidor;
	}

	public String getProveedorAnterior() {
		return proveedorAnterior;
	}

	public void setProveedorAnterior(String proveedorAnterior) {
		this.proveedorAnterior = proveedorAnterior;
	}

	public String getCaja() {
		return caja;
	}

	public void setCaja(String caja) {
		this.caja = caja;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "DireccionInstalacion [codigo=" + codigo + ", provincia=" + provincia + ", ciudad=" + ciudad
				+ ", canton=" + canton + ", parroquia=" + parroquia + ", callePrincipal=" + callePrincipal
				+ ", calleSecundaria=" + calleSecundaria + ", Urbanizacion=" + Urbanizacion + ", sector=" + sector
				+ ", pisoOManzana=" + pisoOManzana + ", numeroUOficina=" + numeroUOficina + ", Observaciones="
				+ Observaciones + ", codigoMedidor=" + codigoMedidor + ", proveedorAnterior=" + proveedorAnterior
				+ ", caja=" + caja + ", tipoCuenta=" + tipoCuenta + ", contrato=" + contrato + "]";
	}
	
	
	
   
}
