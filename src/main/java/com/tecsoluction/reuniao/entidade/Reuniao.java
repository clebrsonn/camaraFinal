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
public class Reuniao implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;


    @Temporal(TemporalType.DATE)
    @Column(name = "DATA")
    private Date data;
    
    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "NUMERO")
    private String numero;


    @Column(name = "LOCAL")
    private String local;
    

    @Column(name = "HORA")
    private String hora;

    @Column(name = "PRESIDENTE")
    private String presidente;
    
    
    @Column(name = "PRIMEIROSECRETARIO")
    private String primeirosecretario;
    
    @Column(name = "isAtivo")
	private boolean isAtivo;
    
    
    
    public Reuniao() {
		// TODO Auto-generated constructor stub
	}
    
   
    
    public long getId(){
		
		return id;
	}
	
	public void setId(long id){
		
		this.id=id;
	}
	
	public String getNumero() {
	        return this.numero;
	    }

		public void setNumero(String numero) {
	        this.numero = numero;
	    }
		
		
		public Date getData() {
 	        return this.data;
 	    }

 		public void setData(Date datacriacao) {
 	        this.data = datacriacao;
 	    }
 		
 		public boolean getIsAtivo(){
 			
 			return isAtivo;
 		}
 		
 		public void setIsAtivo(boolean valor){
 			
 			this.isAtivo=valor;
 		}
 		
 		public String getHora() {
	        return this.hora;
	    }
 		public void setHora(String hora) {
	        this.hora = hora;
	    }

 		public String getTipo() {
	        return this.tipo;
	    }

		public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }
		
		public String getLocal() {
	        return this.local;
	    }

		public void setLocal(String local) {
	        this.local = local;
	    }
		
		public String getPresidente() {
	        return this.presidente;
	    }

		public void setPresidente(String presidente) {
	        this.presidente = presidente;
	    }
		
		public String getPrimeirosecretario() {
	        return this.primeirosecretario;
	    }

		public void setPrimeirosecretario(String primeirosecretario) {
	        this.primeirosecretario = primeirosecretario;
	    }
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return numero;
		}
    
}
