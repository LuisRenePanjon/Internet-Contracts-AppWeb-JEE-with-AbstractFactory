package jpa;

import dao.AsesorDAO;
import dao.ComprobanteDePagoDAO;
import dao.ContratoDAO;
import dao.DAOFactory;
import dao.DireccionInstalacionDAO;
import dao.FormaDePagoDAO;
import dao.PersonaJuridicaDAO;
import dao.PersonaNaturalDAO;
import dao.RedDeAccesoDAO;
import dao.ServicioAdicionalDAO;
import dao.ServicioDAO;
import dao.TarifaMensualDAO;
import dao.TarifaUnPagoDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public ContratoDAO getContratoDAO() {
		// TODO Auto-generated method stub
		return new JPAContratoDAO();
	}

	@Override
	public AsesorDAO getAsesorDAO() {
		// TODO Auto-generated method stub
		return new JPAAsesorDAO();
	}

	@Override
	public PersonaNaturalDAO getPersonaNaturalDAO() {
		// TODO Auto-generated method stub
		return new JPAPersonaNaturalDAO();
	}

	@Override
	public PersonaJuridicaDAO getPersonaJuridicaDAO() {
		// TODO Auto-generated method stub
		return new JPAPersonaJuridicaDAO();
	}

	@Override
	public ComprobanteDePagoDAO getComprobanteDePagoDAO() {
		// TODO Auto-generated method stub
		return new JPAComprobanteDePagoDAO();
	}

	@Override
	public ServicioDAO getServicioDAO() {
		// TODO Auto-generated method stub
		return new JPAServicioDAO();
	}

	@Override
	public DireccionInstalacionDAO getDireccionInstalacionDAO() {
		// TODO Auto-generated method stub
		return new JPADireccionInstalacionDAO();
	}

	@Override
	public FormaDePagoDAO getFormaDePagoDAO() {
		// TODO Auto-generated method stub
		return new JPAFormaDePago();
	}

	@Override
	public RedDeAccesoDAO getRedDeAcceso() {
		// TODO Auto-generated method stub
		return new JPARedDeAccesoDAO();
	}

	@Override
	public ServicioAdicionalDAO getServicioAdicional() {
		// TODO Auto-generated method stub
		return new JPAServicioAdicionalDAO();
	}

	@Override
	public TarifaMensualDAO getTarifaMensualDAO() {
		// TODO Auto-generated method stub
		return new JPATarifaMensualDAO();
	}

	@Override
	public TarifaUnPagoDAO getTarifaUnPago() {
		// TODO Auto-generated method stub
		return new JPATarifaUnPagoDAO();
	}


	

	
	
}
