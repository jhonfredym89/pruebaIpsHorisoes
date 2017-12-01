package com.ipshorisoes.dao;

import java.io.Serializable;
import java.util.List;

import com.ipshorisoes.dm.Continente;

public interface ContinenteDao extends Serializable {
	boolean crear(Continente continente);

	boolean editar(Continente continente);

	boolean eliminar(Continente continente);

	List<Continente> listarTodos();

}
