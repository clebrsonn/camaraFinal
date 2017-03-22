package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "ORADOR")
@Data
@NoArgsConstructor
public class Orador implements Serializable {

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
    private OradoresDia oradoresdia;
    
    @OneToMany
    private List<Aparte> apartes;
    
    
    private Vereador vereador;
    
    
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
	

	public OradoresDia getOradoresDia() {
        return this.oradoresdia;
    }

	public void setOradoresDia(OradoresDia ora) {
        this.oradoresdia = ora;
    }
	
	public Vereador getVereador() {
        return this.vereador;
    }

	public void setVereador(Vereador vereador) {
        this.vereador = vereador;
    }

}
