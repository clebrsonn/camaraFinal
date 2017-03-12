package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "ORADORESDIA")
@Data
@NoArgsConstructor
public class OradoresDia implements Serializable {

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
	

	public Reuniao getReuniao() {
        return this.reuniao;
    }

	public void setReuniao(Reuniao reuniao) {
        this.reuniao = reuniao;
    }

}
