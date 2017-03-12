package com.tecsoluction.reuniao.entidade;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="USUARIO")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private long idusuario;

	private String username;
	
	private String senha;
	
	private String email;
	
	private boolean isAtivo;
	
	 private Set<Role> roles;
	
	//construtor padrão
	public Usuario() {
		
		
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId(){
		
		return idusuario;
	}
	
	public void setId(long id){
		
		this.idusuario=id;
	}
	
	public String getUserName(){
		
		return username;
	}
	
	public void setUserName(String nome){
		
		this.username=nome;
	}
	
	public String getSenha(){
		
		return senha;
	}
	
	public void setSenha(String senha){
		
		this.senha=senha;
	}
	
	public String getEmail(){
		
		return email;
	}
	
	public void setEmail(String email){
		
		this.email=email;
	}
	
	public boolean getIsAtivo(){
		
		return isAtivo;
	}
	
	public void setIsAtivo(boolean valor){
		
		this.isAtivo=valor;
	}
	
//	 , cascade=CascadeType.ALL
	
	 	@ManyToMany(fetch = FetchType.EAGER)
	    @JoinTable(name = "usuario_role", joinColumns = @JoinColumn(name = "idusuario"), inverseJoinColumns = @JoinColumn(name = "idrole"))
	    public Set<Role> getRoles() {
	        return roles;
	    }

	    public void setRoles(Set<Role> roles) {
	        this.roles = roles;
	    }

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
	    
	    
		@Override
		public String toString() {
			return username;
		}
	
	
	
}
