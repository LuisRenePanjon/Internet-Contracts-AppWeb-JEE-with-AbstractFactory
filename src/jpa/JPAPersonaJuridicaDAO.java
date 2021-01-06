package jpa;

import dao.PersonaJuridicaDAO;
import modelo.PersonaJuridica;

public class JPAPersonaJuridicaDAO extends JPAGenericDAO<PersonaJuridica, Integer> implements PersonaJuridicaDAO{

	public JPAPersonaJuridicaDAO() {
		super (PersonaJuridica.class);
	}
	
}
