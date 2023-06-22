package com.taskManagement.dto;

import java.io.Serializable;
import java.util.Date;
import com.taskManagement.entities.Task;

public class TaskDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int codUser;
	private String titulo;
	private String descricao;
	private Date dataCriacao;
	private String status;
	
	public TaskDTO() {
		 
	 }


public TaskDTO( int id, int codUser, String titulo, Date dataCriacao, String status) {
	
	this.id = id;
	this.codUser = codUser;
	this.titulo = titulo;
	this.dataCriacao = dataCriacao;
	this.status = status;
}


public TaskDTO(Task obj) {
	 id = obj.getId();
	 codUser = obj.getCodUser();
	 titulo = obj.getTitulo();
	 dataCriacao = obj.getDataCriacao();
	 status = obj.getStatus();
	 
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



}


