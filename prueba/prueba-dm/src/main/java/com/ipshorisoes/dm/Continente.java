package com.ipshorisoes.dm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Continent")
@NamedQuery(name = Continente.NQ_LISTAR_TODOS, query = "SELECT c FROM Continente c ORDER BY c.id DESC")
public class Continente implements Serializable {
	private static final long serialVersionUID = 6411770802791671921L;
	public static final String NQ_LISTAR_TODOS = "Continente.listarTodos";

	private long id;
	private String codigo;
	private String nombre;
	private boolean estado;

	@Id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "code")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "name")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "enable")
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
