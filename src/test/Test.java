package test;

import dao.AsesorDAO;
import dao.ContratoDAO;
import dao.DAOFactory;
import dao.PersonaNaturalDAO;
import modelo.Asesor;
import modelo.Contrato;
import modelo.PersonaNatural;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContratoDAO contratoDAO = DAOFactory.getFactory().getContratoDAO();
		AsesorDAO asesorDAO = DAOFactory.getFactory().getAsesorDAO();
		PersonaNaturalDAO perNDAO= DAOFactory.getFactory().getPersonaNaturalDAO();
		
		java.util.Date d = new java.util.Date();
		d.setYear(2020);
		d.setMonth(03);
		d.setDate(12);
		System.out.println(d);
		java.sql.Date date2 = new java.sql.Date(d.getTime());
		
		
		/*
		Contrato contrato = new Contrato("0000-0001","Cuenca",date2);
		Asesor asesor= new Asesor("REne","Panjon","correo","paswwd",contrato);
		contrato.setAsesor(asesor);
		
		contratoDAO.create(contrato);
		Contrato contrato2 = new Contrato("0000-0002","Cuenca",date2);
		contrato2.setAsesor(asesor);
		contratoDAO.create(contrato2);
		
		*/
		//Asesor asesor3= new Asesor("Luchsso","Panjson2","corredsafghsd2","padsswwd");
		//asesorDAO.create(asesor3);
		//Contrato contrato = new Contrato("A000-0001","Cuenca",date2,asesor);
		//asesor.setContrato(contrato);
		//asesorDAO.create(asesor);
		//System.out.println("YESS");

		
		//Insertar Datos de esta manera
		//Asesor asesor= asesorDAO.find(1);
		//System.out.println(asesor.toString());
		
		
		
		
		
		//PersonaNatural pN= new PersonaNatural("Juan","ANt","042333548969","44327304","09423178818","na423a@gmail.com","SI","NO");
		//perNDAO.create(pN);
		//Contrato contrato2 = new Contrato("AA00-0014242","Cuena",date2,asesor,pN);
		//contratoDAO.create(contrato2);
		//System.out.println("YESS4");
		//
		/*

		Asesor asesor4 =asesorDAO.find(2);
		System.out.println(asesor4.getNombres());
		Contrato contrato = new Contrato("0000-0003","Cuenca",date2);
		contrato.setAsesor(asesor4);
		contratoDAO.create(contrato);
		System.out.println("Terminado");
		*/
		
		
		
	}

}
