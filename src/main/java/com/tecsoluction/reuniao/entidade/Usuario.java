package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "USUARIO")
@NoArgsConstructor
@Data
public class Usuario implements UserDetails, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @Generated(GenerationTime.INSERT)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    protected long id;


    @NotNull
    @NotEmpty
    @Column(name = "nome", nullable = false, length = 128)
    private String nome;

    @Email(message = "Isto não é e-mail")
    @NotNull
    @NotEmpty
    @Column(name = "email", nullable = false, length = 128, unique = true)
    private String email;

    @NotNull
    @Column(name = "data_cadastro", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro = new Date();

    @NotNull
    @NotEmpty
    @Size(min = 8, max = 32, message = "Login muito curto ou muito longo")
    @Column(name = "login", nullable = false, unique = true, length = 64)
    private String login;

    @Column(name = "senha")
    private String senha;

    @Column(name = "ultimo_login", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoLogin;


    @Column(name = "hash_senha", nullable = false, length = 128)
    private String hashSenha;

//    private Usuario usuario;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<PermissaoUsuario> roles = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return nome;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
