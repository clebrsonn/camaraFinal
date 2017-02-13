package com.tecsoluction.reuniao.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "ATA")
public class Expediente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "ID")
	    private long id;
	 	
 	    
 	    @Temporal(TemporalType.DATE)
 	    @Column(name="DATA")
 	    private Date data;
 	    
 	    @OneToOne
 	    private Reuniao reuniao;
//
//
//	    @Column(name = "LOCAL")
//	    private String local;
//	    
//	    @Column(name = "HORA")
//	    private String hora;
//
//	    @Column(name = "PRESIDENTE")
//	    private String presidente;
////
//	    @Column(name = "PRIMEIROSECRETARIO")
//	    private String primeirosecretario;

	
	




	public Expediente() {
		// TODO Auto-generated constructor stub
	}



	public long getId() {
		return id;
	}




	@Override
	public String toString() {
		return "Ata [data=" + data + "]";
	}



	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public void setId(long id) {
		this.id = id;
	}
	
	
	public Reuniao getReuniao() {
		return reuniao;
	}



	public void setReuniao(Reuniao reuniao) {
		this.reuniao = reuniao;
	}
	
	
	
	

}
