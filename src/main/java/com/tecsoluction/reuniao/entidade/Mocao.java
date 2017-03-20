package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "MOCAO")
@Data
@NoArgsConstructor
public class Mocao implements Serializable {

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

    	@NotNull
	    @Column(name = "NUMERO")
	    private String numero;

	    
	    @NotNull
	    @Column(name = "DESCRICAO")
	    private String descricao;

	    
	    @NotNull
	    @Column(name = "AUTOR")
	    private String autor;
	    
	    @NotNull
	    @Column(name = "HOMENAGEADO")
	    private String homenageado;
	    
	    
		private boolean isAtivo;
		
		
		@ManyToOne
 		private Expediente expediente;
		
		
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
 		
 		public String getHomenageado() {
 	        return this.homenageado;
 	    }

 		public void setHomenageado(String homenageado) {
 	        this.homenageado = homenageado;
 	    }
 	
 		public Expediente getExpediente() {
 	        return this.expediente;
 	    }

 		public void setExpediente(Expediente exp) {
 	        this.expediente = exp;
 	    }	

}
