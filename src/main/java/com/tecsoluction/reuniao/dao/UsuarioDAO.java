package com.tecsoluction.reuniao.dao;

import com.tecsoluction.reuniao.entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by clebr on 11/02/2017.
 */

public interface UsuarioDAO  {
	
	
	/** Busca usuario por login e senha */
	public Usuario getUsuario(String login, String senha);
	
	/** Busca usuario pelo login */
	public Usuario getUsuario(String login);
	

}
