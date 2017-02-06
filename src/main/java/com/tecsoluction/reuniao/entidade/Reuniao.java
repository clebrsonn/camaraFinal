package com.tecsoluction.reuniao.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "REUNIAO")
public class Reuniao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "ID")
	    private long id;
	 	
 	    
 	    @Temporal(TemporalType.TIMESTAMP)
 	    @Column(name="DATA")
 	    private Date datareuniao;

	    @Column(name = "NUMERO")
 	    private String numero;


	    @Column(name = "LOCAL")
	    private String local;
	    
	    @Column(name = "HORA")
	    private String hora;

	    @Column(name = "PRESIDENTE")
	    private String presidente;
//
	    @Column(name = "PRIMEIROSECRETARIO")
	    private String primeirosecretario;

	
	
	public Reuniao() {
		// TODO Auto-generated constructor stub
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}




	public Date getDatareuniao() {
		return datareuniao;
	}



	public void setDatareuniao(Date datareuniao) {
		this.datareuniao = datareuniao;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getLocal() {
		return local;
	}



	public void setLocal(String local) {
		this.local = local;
	}



	public String getHora() {
		return hora;
	}



	public void setHora(String hora) {
		this.hora = hora;
	}



	public String getPresidente() {
		return presidente;
	}



	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}



	public String getPrimeirosecretario() {
		return primeirosecretario;
	}



	public void setPrimeirosecretario(String primeirosecretario) {
		this.primeirosecretario = primeirosecretario;
	}



	@Override
	public String toString() {
		return "Reuniao [numero=" + numero + "]";
	}
	
	
	
	
	
	
	

}
