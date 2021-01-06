package dao;

import jpa.JPADAOFactory;

public abstract class DAOFactory {

	protected static DAOFactory factory = new JPADAOFactory();
	
	
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract ContratoDAO getContratoDAO();
	public abstract AsesorDAO getAsesorDAO();
	public abstract PersonaNaturalDAO getPersonaNaturalDAO();
	public abstract PersonaJuridicaDAO getPersonaJuridicaDAO();
	public abstract ComprobanteDePagoDAO getComprobanteDePagoDAO();
	public abstract ServicioDAO getServicioDAO();
	public abstract DireccionInstalacionDAO getDireccionInstalacionDAO();
	public abstract FormaDePagoDAO getFormaDePagoDAO();
	public abstract RedDeAccesoDAO getRedDeAcceso();
	public abstract ServicioAdicionalDAO getServicioAdicional();
	public abstract TarifaMensualDAO getTarifaMensualDAO();
	public abstract TarifaUnPagoDAO getTarifaUnPago();
}
