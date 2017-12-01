package com.ipshorisoes.ejb.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.ipshorisoes.dao.ContinenteDao;
import com.ipshorisoes.dm.Continente;
import com.ipshorisoes.ejb.ContinenteEjb;

@Stateless
public class ContinenteEjbImpl implements ContinenteEjb {
	private static final long serialVersionUID = 1922153681265901060L;

	@Inject
	private ContinenteDao continenteDao;

	@Override
	public boolean crear(Continente continente) {
		return continenteDao.crear(continente);
	}

	@Override
	public boolean editar(Continente continente) {
		return continenteDao.editar(continente);
	}

	@Override
	public boolean eliminar(Continente continente) {
		return continenteDao.eliminar(continente);
	}

	@Override
	public List<Continente> listarTodos() {
		return continenteDao.listarTodos();
	}

}
