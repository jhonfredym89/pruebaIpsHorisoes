package com.ipshorisoes.controladores;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ipshorisoes.dm.Continente;
import com.ipshorisoes.ejb.ContinenteEjb;

@Named
@ViewScoped
public class ContinenteVC implements Serializable {
	private static final long serialVersionUID = 220140885823243817L;
	// Injects
	@Inject
	private ContinenteEjb continenteEjb;
	// Lists
	private List<Continente> listaContinentes;
	// Entities
	private Continente continente;
	// Vars
	private String titulo;

	@PostConstruct
	public void init() {
		titulo = "Prueba Ips Horisoes";
		continente = new Continente();
		listar();
	}

	public void crear() {
		final boolean guardo = continenteEjb.crear(continente);
		if (guardo) {
			System.out.println("Guardo exitosamente");
			continente = new Continente();
			listar();
		} else {
			System.out.println("Error al guardar");
		}
	}

	public void editar() {
		final boolean edito = continenteEjb.editar(continente);
		if (edito) {
			System.out.println("Edito exitosamente");
			continente = new Continente();
			listar();
		} else {
			System.out.println("Error al editar");
		}
	}

	public void eliminar() {
		final boolean elimino = continenteEjb.eliminar(continente);
		if (elimino) {
			continente = new Continente();
			listar();
			System.out.println("Elimino exitosamente");
		} else {
			System.out.println("Error al eliminar");
		}
	}

	private void listar() {
		listaContinentes = continenteEjb.listarTodos();
	}

	// Getters and Setters
	public List<Continente> getListaContinentes() {
		return listaContinentes;
	}

	public void setListaContinentes(List<Continente> listaContinentes) {
		this.listaContinentes = listaContinentes;
	}

	public Continente getContinente() {
		return continente;
	}

	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
