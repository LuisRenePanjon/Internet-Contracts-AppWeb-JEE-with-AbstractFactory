package dao;

import modelo.Asesor;

public interface AsesorDAO extends GenericDAO<Asesor, Integer>{

	public abstract Asesor readByCorreo(String correo);
}
