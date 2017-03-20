package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "ATA")
public class Ata implements Serializable {

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
    
    @Column(name = "isAtivo")
	private boolean isAtivo;
    
    @Column(name = "STATUS")
    private String status;
    
    @Column(name = "RESPONSAVEL")
    private String responsavel;
    
    
    public Ata() {
		// TODO Auto-generated constructor stub
	}
    
    
	    public long getId(){
			
	  		return id;
	  	}
	  	
	  	public void setId(long id){
	  		
	  		this.id=id;
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
 		
 		public String getStatus() {
	        return this.status;
	    }
 		public void setStatus(String hora) {
	        this.status = hora;
	    }
 		
 		public Reuniao getReuniao(){
 			return this.reuniao;
 			
 		}
 		
 		public void setReuniao(Reuniao reuniao){
 			
 			this.reuniao = reuniao;
 		}
 		
 		public String getResponsavel() {
	        return this.responsavel;
	    }
 		public void setResponsavel(String resp) {
	        this.responsavel = resp;
	    }


		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Ata [data=" + data + "]";
		}
    


}
