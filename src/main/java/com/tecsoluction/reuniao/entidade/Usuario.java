package com.tecsoluction.reuniao.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "USUARIO")
@NoArgsConstructor
@Data
public class Usuario implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private long id;


//    @NotNull
//    @NotEmpty
//    @Column(name = "nome", nullable = false, length = 128)
    private String nome;

//    @Email(message = "Isto não é e-mail")
//    @NotNull
//    @NotEmpty
//    @Column(name = "email", nullable = false, length = 128, unique = true)
    private String email;

//    @NotNull
//    @Column(name = "data_cadastro", nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro = new Date();
    
//
//    @Column(name = "ultimo_login", nullable = true)
//    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoAcesso;

//    @NotNull
//    @NotEmpty
//    @Size(min = 8, max = 32, message = "Login muito curto ou muito longo")
//    @Column(name = "username", nullable = false, unique = true, length = 64)
    private String username;
    
    
//    @NotNull
//    @Column(name = "senha")
    private String senha;

	private boolean isAtivo;
	
	
	private Set<Role> roles;
	 
	 
	 

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    
//	public String getUserName(){
//		
//		return username;
//	}
//	
//	public void setUserName(String nome){
//		
//		this.username=nome;
//	}
//	
//	public String getSenha(){
//		
//		return senha;
//	}
//	
//	public void setSenha(String senha){
//		
//		this.senha=senha;
//	}
//	
//	public boolean getIsAtivo(){
//		
//		return isAtivo;
//	}
//	
//	public void setIsAtivo(boolean valor){
//		
//		this.isAtivo=valor;
//	}
//	
	 	@ManyToMany
	    @JoinTable(name = "usuario_role", joinColumns = @JoinColumn(name = "idusuario"), inverseJoinColumns = @JoinColumn(name = "idrole"))
	    public Set<Role> getRoles() {
	        return roles;
	    }

//	    public void setRoles(Set<Role> roles) {
//	        this.roles = roles;
//	    }
	 	
		@Override
		public String toString() {
			return "Usuario [id=" + id + ", username=" + username + ", senha=" + senha + ", email="
					+ email + ", isAtivo=" + isAtivo + ", roles=" + roles + "]";
		}
}
