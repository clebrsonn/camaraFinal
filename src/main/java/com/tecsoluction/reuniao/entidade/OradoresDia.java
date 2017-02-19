package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "ATA")
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

}
