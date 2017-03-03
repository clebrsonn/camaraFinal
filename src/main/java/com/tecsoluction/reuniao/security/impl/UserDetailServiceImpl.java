package com.tecsoluction.reuniao.security.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tecsoluction.reuniao.dao.impl.UsuarioDaoImpl;
import com.tecsoluction.reuniao.entidade.Usuario;


@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class UserDetailServiceImpl implements UserDetailsService {


	 private UsuarioDaoImpl usuarioDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		
		 Usuario usuario = new Usuario();
	        usuario.setUsername(username);
	        try {
	            usuario = usuarioDao.retornarUsuarioPorLogin(usuario.getUsername());
	            if (usuario == null){
	                return null;
	            }
	        } catch (Exception e) {
	            return null;
	        }

	        return buildUserFromUserEntity(usuario);
	    }

	public UserDetails loadUserByUsernameAndPassword(String username, String senha) throws UsernameNotFoundException  {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setSenha(senha);
       
        try {
            usuario = usuarioDao.retornaUsuarioPorLoginESenha(username, senha);
            if (usuario == null){
                return null;
            }else{
                return buildUserFromUserEntity(usuario);
            }
        } catch (Exception e) {
            return null;
        }
    }
	
	private User buildUserFromUserEntity(Usuario usuario) {
        User springUser = null;

        try {
            // convert model user to spring security user
            String username = usuario.getUsername();
            String senha = usuario.getSenha();
            boolean enabled = usuario.isAtivo();
            boolean accountNonExpired = true;
            boolean credentialsNonExpired = true;
            boolean accountNonLocked = true;

            Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            authorities.add((GrantedAuthority) usuario.getRoles());

            springUser = new User(username, senha, enabled,
                    accountNonExpired, credentialsNonExpired, accountNonLocked,
                    authorities);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return springUser;
    }
}
