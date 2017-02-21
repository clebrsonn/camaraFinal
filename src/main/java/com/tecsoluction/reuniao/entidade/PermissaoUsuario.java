package com.tecsoluction.reuniao.entidade;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "permissao_usuario")
@NoArgsConstructor
@Data
public class PermissaoUsuario implements GrantedAuthority, Serializable {

    private static final long serialVersionUID = 1L;
//
//    @Column(name = "name", unique = true)
//    protected String name;

    @Id
    @Column(name = "role", nullable = false, length = 64)
    private String role;


    public String getAuthority() {
        return role;
    }


}
