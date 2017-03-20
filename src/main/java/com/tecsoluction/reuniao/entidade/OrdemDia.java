package com.tecsoluction.reuniao.entidade;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "ORDEMDIA")
@Data
@NoArgsConstructor
public class OrdemDia implements Serializable {

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
    
    
    private boolean isAtivo;
    
    
    @OneToMany(fetch = FetchType.EAGER)
	 private Set<ProjetoLei> projetosleis;
    
    @OneToMany(fetch = FetchType.EAGER)
	 private Set<Requerimento> requerimentos;
    
    @OneToMany(fetch = FetchType.EAGER)
	 private Set<Mocao> mocoes;

    
    public long getId() {
        return this.id;
    }

	public void setId(long numero) {
        this.id = numero;
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
    public Set<ProjetoLei> getProjetosLeis() {
        return projetosleis;
    }

    public void setProjetosLeis(Set<ProjetoLei> proj) {
        this.projetosleis = proj;
    }
    
    public Set<Requerimento> getRequerimentos() {
        return requerimentos;
    }

    public void setRequerimentos(Set<Requerimento> req) {
        this.requerimentos = req;
    }
    
    public Set<Mocao> getMocoes() {
        return mocoes;
    }

    public void setMocoes(Set<Mocao> mocao) {
        this.mocoes = mocao;
    }
    
    

}
