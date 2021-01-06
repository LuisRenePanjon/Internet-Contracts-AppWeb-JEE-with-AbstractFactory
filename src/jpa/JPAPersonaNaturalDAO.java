package jpa;

import dao.PersonaNaturalDAO;
import modelo.PersonaNatural;

public class JPAPersonaNaturalDAO extends JPAGenericDAO<PersonaNatural, Integer> implements PersonaNaturalDAO{

	public JPAPersonaNaturalDAO() {
		super(PersonaNatural.class);
		// TODO Auto-generated constructor stub
	}

}
