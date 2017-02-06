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
@Table(name = "VEREADOR")
public class Vereador implements Serializable{

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
	    
	    @Column(name = "TELEFONE")
	    private String telefone;

	    @Column(name = "EMAIL")
	    private String email;
//
//	    @Column(name = "SENHA")
//	    private String email;

	
	
	public Vereador() {
		// TODO Auto-generated constructor stub
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Vereador [nome=" + nome + "]";
	}
	
	
	
	
	
	
	

}
