package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "VEREADOR")
@Data
@NoArgsConstructor
public class Vereador implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "EMAIL")
    private String email;
//
//	    @Column(name = "SENHA")
//	    private String email;
}
