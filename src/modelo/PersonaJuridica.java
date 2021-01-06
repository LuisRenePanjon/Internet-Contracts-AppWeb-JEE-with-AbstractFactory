package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PersonaJuridica
 *
 */
@Entity

public class PersonaJuridica implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String nombreEmpresa;
	
	@Column(nullable = false)
	private String ruc;
	
	private String actividadEconomica;
	
	private String nombresRepresentante;
	
	private String apellidosRepresentante;
	
	@Column(nullable = false)
	private String cedulaRepresentante;
	
	private String direccionOficinaMatriz;
	
	private String ciudadOficina;
	
	private String Provincia;
	
	private String telefonoOficina;
	
	private String paginaWeb;
	
	private String telefono;
	
	private String celular;
	
	private String correo;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "personaJuridica")
	private Contrato contrato;
	
	
	public PersonaJuridica() {
		
	}
		
	
	public Contrato getContrato() {
		return contrato;
	}




	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}




	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getActividadEconomica() {
		return actividadEconomica;
	}

	public void setActividadEconomica(String actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}

	public String getNombresRepresentante() {
		return nombresRepresentante;
	}

	public void setNombresRepresentante(String nombresRepresentante) {
		this.nombresRepresentante = nombresRepresentante;
	}

	public String getApellidosRepresentante() {
		return apellidosRepresentante;
	}

	public void setApellidosRepresentante(String apellidosRepresentante) {
		this.apellidosRepresentante = apellidosRepresentante;
	}

	public String getCedulaRepresentante() {
		return cedulaRepresentante;
	}

	public void setCedulaRepresentante(String cedulaRepresentante) {
		this.cedulaRepresentante = cedulaRepresentante;
	}

	public String getDireccionOficinaMatriz() {
		return direccionOficinaMatriz;
	}

	public void setDireccionOficinaMatriz(String direccionOficinaMatriz) {
		this.direccionOficinaMatriz = direccionOficinaMatriz;
	}

	public String getCiudadOficina() {
		return ciudadOficina;
	}

	public void setCiudadOficina(String ciudadOficina) {
		this.ciudadOficina = ciudadOficina;
	}

	public String getProvincia() {
		return Provincia;
	}

	public void setProvincia(String provincia) {
		Provincia = provincia;
	}

	public String getTelefonoOficina() {
		return telefonoOficina;
	}

	public void setTelefonoOficina(String telefonoOficina) {
		this.telefonoOficina = telefonoOficina;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
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

	@Override
	public String toString() {
		return "PersonaJuridica [codigo=" + codigo + ", nombreEmpresa=" + nombreEmpresa + ", ruc=" + ruc
				+ ", actividadEconomica=" + actividadEconomica + ", nombresRepresentante=" + nombresRepresentante
				+ ", apellidosRepresentante=" + apellidosRepresentante + ", cedulaRepresentante=" + cedulaRepresentante
				+ ", direccionOficinaMatriz=" + direccionOficinaMatriz + ", ciudadOficina=" + ciudadOficina
				+ ", Provincia=" + Provincia + ", telefonoOficina=" + telefonoOficina + ", paginaWeb=" + paginaWeb
				+ ", telefono=" + telefono + ", celular=" + celular + ", correo=" + correo + "]";
	}
	
	
   
}
