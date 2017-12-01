package com.ipshorisoes.ejb;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Local;

import com.ipshorisoes.dm.Continente;

@Local
public interface ContinenteEjb extends Serializable {
	boolean crear(Continente continente);

	boolean editar(Continente continente);

	boolean eliminar(Continente continente);

	List<Continente> listarTodos();
}
