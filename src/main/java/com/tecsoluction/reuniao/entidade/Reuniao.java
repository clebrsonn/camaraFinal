package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "REUNIAO")
@Data
@NoArgsConstructor
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
    private Date datareuniao;

    @Column(name = "NUMERO")
    private String numero;


    @Column(name = "LOCAL")
    private String local;

    @Column(name = "HORA")
    private String hora;

    @Column(name = "PRESIDENTE")
    private String presidente;
    //
    @Column(name = "PRIMEIROSECRETARIO")
    private String primeirosecretario;
}
