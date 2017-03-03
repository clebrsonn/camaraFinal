//package com.tecsoluction.reuniao.security;
//
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//
//import com.tecsoluction.reuniao.entidade.PermissaoUsuario;
//import com.tecsoluction.reuniao.entidade.Usuario;
//
//
//
//public class SFAuthentication implements Authentication {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -909654818303750963L;
//	private final Usuario usuario;
//	private boolean autenticado;
//	
//	
//	
//	public SFAuthentication(Usuario usuario, List<PermissaoUsuario> permissoes) {
//		this.usuario = usuario;
//		this.permissoes = permissoes;
//	}
//	
//	public String getName() {
//		return usuario != null ? usuario.getLogin() : null;
//	}
//	private List<PermissaoUsuario> permissoes;
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		
//		return permissoes;
//	}
//
//	public Object getCredentials() {
//		return usuario != null ? usuario.getHashSenha() : null;
//	}
//
//	public Object getDetails() {
//		return usuario;
//	}
//
//	public Object getPrincipal() {
//		return usuario != null ? usuario.getLogin() : null;
//	}
//
//	public boolean isAuthenticated() {
//		return this.autenticado;
//	}
//
//	public void setAuthenticated(boolean isAuthenticated)
//			throws IllegalArgumentException {
//		this.autenticado = isAuthenticated;
//		
//	}
//
//}
