package modelo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contrato
 *
 */
@Entity

public class Contrato implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(unique=true)
	private String serie;
	
	private String ciudad;
	
	private Date fecha;
	
	@OneToOne
	@JoinColumn
	private Asesor asesor;
	
	@OneToOne
	@JoinColumn
	private PersonaNatural personaNatural;
	
	@OneToOne
	@JoinColumn
	private PersonaJuridica personaJuridica;
	
	
	@OneToOne
	@JoinColumn
	private FormaDePago formaDePago;
	
	@OneToOne
	@JoinColumn
	private Servicio servicio;
	
	@OneToOne
	@JoinColumn
	private DireccionInstalacion direccionInstalacion;
	
	
	@OneToOne
	@JoinColumn
	private RedDeAcceso redDeAcceso;
	
	@OneToOne
	@JoinColumn
	private ServicioAdicional servicioAdicional;
	
	@OneToOne
	@JoinColumn
	private TarifaUnPago tarifaUnPago;
	
	@OneToOne
	@JoinColumn
	private TarifaMensual tarifaMensual;
	
	@OneToOne
	@JoinColumn
	private ComprobanteDePago comprobanteDePago;
	
	public Contrato() {
		
	}

	public Contrato(String serie, String ciudad, Date fecha, Asesor asesor) {
		super();
		this.serie = serie;
		this.ciudad = ciudad;
		this.fecha = fecha;
		this.asesor = asesor;
	}
	
	
	
	public Contrato(String serie, String ciudad, Date fecha, Asesor asesor, PersonaNatural personaNatural) {
		super();
		this.serie = serie;
		this.ciudad = ciudad;
		this.fecha = fecha;
		this.asesor = asesor;
		this.personaNatural = personaNatural;
	}
	
	
	
	
	public ComprobanteDePago getComprobanteDePago() {
		return comprobanteDePago;
	}

	public void setComprobanteDePago(ComprobanteDePago comprobanteDePago) {
		this.comprobanteDePago = comprobanteDePago;
	}

	
	public TarifaUnPago getTarifaUnPago() {
		return tarifaUnPago;
	}

	public void setTarifaUnPago(TarifaUnPago tarifaUnPago) {
		this.tarifaUnPago = tarifaUnPago;
	}

	public TarifaMensual getTarifaMensual() {
		return tarifaMensual;
	}

	public void setTarifaMensual(TarifaMensual tarifaMensual) {
		this.tarifaMensual = tarifaMensual;
	}

	public ServicioAdicional getServicioAdicional() {
		return servicioAdicional;
	}

	public void setServicioAdicional(ServicioAdicional servicioAdicional) {
		this.servicioAdicional = servicioAdicional;
	}

	public RedDeAcceso getRedDeAcceso() {
		return redDeAcceso;
	}

	public void setRedDeAcceso(RedDeAcceso redDeAcceso) {
		this.redDeAcceso = redDeAcceso;
	}

	public FormaDePago getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public DireccionInstalacion getDireccionInstalacion() {
		return direccionInstalacion;
	}

	public void setDireccionInstalacion(DireccionInstalacion direccionInstalacion) {
		this.direccionInstalacion = direccionInstalacion;
	}

	public PersonaJuridica getPersonaJuridica() {
		return personaJuridica;
	}

	public void setPersonaJuridica(PersonaJuridica personaJuridica) {
		this.personaJuridica = personaJuridica;
	}

	public PersonaNatural getPersonaNatural() {
		return personaNatural;
	}

	public void setPersonaNatural(PersonaNatural personaNatural) {
		this.personaNatural = personaNatural;
	}

	public Contrato(String serie, String ciudad, Date fecha) {
		super();
		this.serie = serie;
		this.ciudad = ciudad;
		this.fecha = fecha;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Asesor getAsesor() {
		return asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

	@Override
	public String toString() {
		return "Contrato [codigo=" + codigo + ", serie=" + serie + ", ciudad=" + ciudad + ", fecha=" + fecha
				+ ", asesor=" + asesor + ", personaNatural=" + personaNatural + ", personaJuridica=" + personaJuridica
				+ ", formaDePago=" + formaDePago + ", servicio=" + servicio + ", direccionInstalacion="
				+ direccionInstalacion + ", redDeAcceso=" + redDeAcceso + ", servicioAdicional=" + servicioAdicional
				+ ", tarifaUnPago=" + tarifaUnPago + ", tarifaMensual=" + tarifaMensual + ", comprobanteDePago="
				+ comprobanteDePago + "]";
	}
	
	
   
}
