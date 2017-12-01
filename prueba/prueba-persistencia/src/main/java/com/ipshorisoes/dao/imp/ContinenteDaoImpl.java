package com.ipshorisoes.dao.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ipshorisoes.dao.ContinenteDao;
import com.ipshorisoes.dm.Continente;

public class ContinenteDaoImpl implements ContinenteDao {
	private static final long serialVersionUID = -803352270594367174L;

	@PersistenceContext(unitName = "pruebaUP")
	private EntityManager entityManager;

	@Override
	public boolean crear(Continente continente) {
		try {
			entityManager.persist(continente);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean editar(Continente continente) {
		try {
			entityManager.merge(continente);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean eliminar(Continente continente) {
		try {
			entityManager.remove(entityManager.merge(continente));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Continente> listarTodos() {
		try {
			return entityManager.createNamedQuery(Continente.NQ_LISTAR_TODOS).getResultList();
		} catch (Exception e) {
			return new ArrayList<>();
		}
	}

}
