package com.taskManagement.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Task implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int codUser;
	private String titulo;
	private String descricao;
	private Date dataCriacao;
	private String status;
	
	public Task () {
		
	}
	
	public Task(int id, int codUser, String titulo, String descricao, Date dataCriacao, String status) {
		this.id = id;
		this.codUser = codUser;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
		this.status = status;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodUser() {
		return codUser;
	}
	public void setCodUser(int codUser) {
		this.codUser = codUser;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return id == other.id;
	}
	
	
	

}
