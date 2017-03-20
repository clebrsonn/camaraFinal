package com.tecsoluction.reuniao.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "REQUERIMENTO")
public class Requerimento implements Serializable{

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
 	    

 	    @NotNull
 	    @Column(name = "NUMERO")
 	    private String numero;

 	    
 	    @NotNull
 	    @Column(name = "DESCRICAO")
 	    private String descricao;

 	    
 	    @NotNull
 	    @Column(name = "AUTOR")
 	    private String autor;
 	    
 	    
 		private boolean isAtivo;
 		
 		
 		@ManyToOne
 		private Expediente expediente;
 		
 		

 		
 		public Requerimento() {
			// TODO Auto-generated constructor stub
		}
 		
 		
 		public long getId() {
 	        return this.id;
 	    }

 		public void setId(long numero) {
 	        this.id = numero;
 	    }

 		public String getNumero() {
 	        return this.numero;
 	    }

 		public void setNumero(String numero) {
 	        this.numero = numero;
 	    }

 		public String getDescricao() {
 	        return this.descricao;
 	    }

 		public void setDescricao(String descricao) {
 	        this.descricao = descricao;
 	    }

 		public String getAutor() {
 	        return this.autor;
 	    }

 		public void setAutor(String autor) {
 	        this.autor = autor;
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
 		
 		public Expediente getExpediente() {
 	        return this.expediente;
 	    }

 		public void setExpediente(Expediente exp) {
 	        this.expediente = exp;
 	    }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "REQUERIMENTO Nº"+ numero;
	}

}
