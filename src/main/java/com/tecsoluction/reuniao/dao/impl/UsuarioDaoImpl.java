package com.tecsoluction.reuniao.dao.impl;

import javax.persistence.Query;

import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.dao.UsuarioDao;


public class UsuarioDaoImpl extends DaoGenericoImpl<Usuario, Long> implements UsuarioDao {

	
	@Override
	public Usuario retornarUsuarioPorLogin(String username) {
		Usuario user = new Usuario();

//		String queryS = "SELECT obj FROM USUARIO WHERE USERNAME='"+username+"' obj";
//		Query query = getEntityManager().createQuery(queryS);
//		Usuario user2 = new Usuario();
//		user2 = (Usuario) query.getSingleResult() ;	
		
		user = getEntityManager().find(Usuario.class, username);

		
		return user;
	}

	@Override
	public Usuario retornaUsuarioPorLoginESenha(String username, String senha) {
		String queryS = "SELECT obj FROM USUARIO WHERE USERNAME="+username+ "AND SENHA="+senha+" obj";
		Query query = getEntityManager().createQuery(queryS);
		Usuario user2 = new Usuario();
		user2 = (Usuario) query.getSingleResult() ;

		return user2 ;
	}

	


	
}
