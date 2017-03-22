package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "APARTE")
@Data
@NoArgsConstructor
public class Aparte implements Serializable {

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

    
    private String nome;

    /**
     */
    
    private String discursoaparte;

    /**
     */
    @ManyToOne
    private Orador orador;

    
    
    private boolean isAtivo;


    public long getId() {
        return this.id;
    }

	public void setId(long numero) {
        this.id = numero;
    }


	public Date getData() {
        return data;
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
	

	public String getNome() {
        return this.nome;
    }

	public void setNome(String nome) {
        this.nome = nome;
    }
	
	public String getDiscursoAparte() {
        return this.discursoaparte;
    }

	public void setDiscursoAparte(String discurso) {
        this.discursoaparte = discurso;
    }

}
