package com.tecsoluction.reuniao.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "VEREADOR")
public class Vereador implements Serializable {

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
    
   
    @Column(name = "isAtivo")
	private boolean isAtivo;
    
    @OneToMany(mappedBy="vereadores")
	private List<Expediente> expedientes;
    
    public Vereador() {
		// TODO Auto-generated constructor stub
	}
    
    
    public long getId(){
    	
    	return id;
    }
    
    public void setId(long id){
    	
    	this.id = id;
    }
    
    public String getNome(){
    	
    	return nome;
    }
    
    public void setNome(String nome){
    	
    	this.nome = nome;
    }
    
    public String getTelefone(){
    	
    	return telefone;
    }
    
    public void setTelefone(String tel){
    	
    	this.telefone = tel;
    }
   
    public String getEmail(){
    	
    	return email;
    }
    
    public void setEmail(String mail){
    	
    	this.email = mail;
    }
    
    public boolean getIsAtivo(){
    	
    	return isAtivo;
    }
    
    public void setIsAtivo(boolean ativo){
    	
    	this.isAtivo = ativo;
    }
    
    
		public List<Expediente> getExpedientes() {
 	        return this.expedientes;
 	    }

 		public void setExpedientes( List<Expediente> exp) {
 	        this.expedientes = exp;
 	    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return nome;
    }
}
