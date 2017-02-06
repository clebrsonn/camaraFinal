package com.tecsoluction.reuniao.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "ID")
	    private long id;

	    @Column(name = "NOME")
	    private String nome;

	    @Column(name = "SENHA")
	    private String senha;

	    @Column(name = "EMAIL")
	    private String email;

	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Usuario [nome=" + nome + "]";
	}
	
	
	
	
	
	
	

}
