package com.tecsoluction.reuniao.dao;

import java.util.List;

import com.tecsoluction.reuniao.entidade.PermissaoUsuario;
import com.tecsoluction.reuniao.entidade.Usuario;



public interface PermissaoUsuarioDAO {
	
	public List<PermissaoUsuario> getPermissoesUsuario(Usuario usuario);
	
	public void addRole(String role, Usuario usuario);
	
}
