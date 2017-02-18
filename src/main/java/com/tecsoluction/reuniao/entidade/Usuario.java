package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "USUARIO")
@Data
@NoArgsConstructor
public class Usuario implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


	@Id
	@Generated(GenerationTime.INSERT) 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true) 
	protected long id;
	
	
	@NotNull 
	@NotEmpty
	@Column(name="nome", nullable=false, length=128)
	private String nome;
	
	@Email(message="Isto não é e-mail")
	@NotNull
	@NotEmpty
	@Column(name="email", nullable=false, length=128, unique=true)
	private String email;
	
	@NotNull
	@Column(name="data_cadastro", nullable=false) @Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro = new Date();
	
	@NotNull @NotEmpty
	@Size(min=8, max=32, message="Login muito curto ou muito longo") 
	@Column(name="login", nullable=false, unique=true, length=64)
	private String login;
	@Column(name="senha")
	private  String senha;
	
	@Column(name="ultimo_login", nullable=true) 
	@Temporal(TemporalType.TIMESTAMP)
	private Date ultimoLogin;
	
	
	@Column(name="hash_senha", nullable=false, length=128)
	private String hashSenha;
	
	private Usuario usuario;
	
	
	


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Date getUltimoLogin() {
		return ultimoLogin;
	}


	public void setUltimoLogin(Date ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}


	public String getHashSenha() {
		return hashSenha;
	}


	public void setHashSenha(String hashSenha) {
		this.hashSenha = hashSenha;
	}


	@Override
	public String toString() {
		return "Usuario [login=" + login + "]";
	}
	
	

}
