package com.tecsoluction.reuniao.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.tecsoluction.reuniao.dao.PermissaoUsuarioImpl;
import com.tecsoluction.reuniao.dao.UsuarioDAOImpl;
import com.tecsoluction.reuniao.entidade.PermissaoUsuario;
import com.tecsoluction.reuniao.entidade.Usuario;


/**
 * Exemplo de authentication provider
 * @author kicolobo
 */
public class SFAuthenticationProvider implements AuthenticationProvider {
	
	@Autowired
	private UsuarioDAOImpl daoUsuarioimpl;
	
	
	public UsuarioDAOImpl getDaoUsuarioImpl() {
		
		return daoUsuarioimpl;
		
	}
	
	
	public void setDaoUsuarioImpl(UsuarioDAOImpl dao) {
		daoUsuarioimpl = dao;
		
	}
	
	@Autowired
	private PermissaoUsuarioImpl daoPermissaoimpl;
	
	public PermissaoUsuarioImpl getDaoPermissaoImpl() {return 
			daoPermissaoimpl;
	}
	
	
	public void setPermissaoDaoImpl(PermissaoUsuarioImpl dao) {
		
		daoPermissaoimpl = dao;
		
	}
	
	public Authentication authenticate(Authentication auth)	throws AuthenticationException {
		UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) auth;
		String username = token.getName();
		String senha    = token.getCredentials() != null ? token.getCredentials().toString() : null;
		Usuario usuario = getDaoUsuarioImpl().getUsuario(username, senha);
		if (usuario == null) {
			return null;
		}
		List<PermissaoUsuario> permissoes = getDaoPermissaoImpl().getPermissoesUsuario(usuario);
		SFAuthentication resultado = new SFAuthentication(usuario, permissoes);
		resultado.setAuthenticated(usuario != null);
		return resultado;
	}

	public boolean supports(Class<?> authentication) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

}
