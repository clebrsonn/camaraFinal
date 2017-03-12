package com.tecsoluction.reuniao.dao;

import com.tecsoluction.reuniao.entidade.Usuario;

/**
 * Created by clebr on 11/02/2017.
 */

public interface UsuarioDao extends DaoGenerico<Usuario, Long> {

	
	Usuario retornarUsuarioPorLogin(String username);
	
	Usuario retornaUsuarioPorLoginESenha(String username, String senha);
	
	

}
