package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "EXPEDIENTE")
@Data
@NoArgsConstructor
public class Expediente implements Serializable {

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
    
    

    @OneToOne
    private Reuniao reuniao;
    
    
    @NotNull
    private String numero;
    
    
    private boolean isAtivo;

    /**
     */
//    @OneToMany
//    private Set<ProjetoLei> projetosdelei = new HashSet<ProjetoLei>();
//
//    /**
//     */
//    @OneToMany
//    private Set<Requerimento> requerimentos = new HashSet<Requerimento>();
//    
//   
//    @OneToMany
//    private Set<Mocao> mocoes = new HashSet<Mocao>();
    
    
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
		

		public Reuniao getReuniao() {
	        return this.reuniao;
	    }

		public void setReuniao(Reuniao reuniao) {
	        this.reuniao = reuniao;
	    }
    
    

}
