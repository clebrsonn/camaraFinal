package com.tecsoluction.reuniao.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tecsoluction.reuniao.entidade.Usuario;

@Transactional(propagation=Propagation.SUPPORTS)
@Repository("UsuarioDAOImpl")
public class UsuarioDAOImpl implements UsuarioDAO{
	
	
	private  SessionFactory sessionFactory;
	
	
	
	
	public  SessionFactory getSessionFactory() {
		
		return sessionFactory;
		
		}
	
	public void setSessionFactory(SessionFactory sf) {
		
		sessionFactory = sf;
		
	}
	
	protected  Session getSession() {
		return getSessionFactory().getCurrentSession();
	
	}
	



	@Override
	public  Usuario getUsuario(String login, String senha) {
		Query query = getSession().createQuery("from Usuario usr where usr.login = ? and usr.hashSenha = ?");
		query.setString(0, login);
		query.setString(1, senha);
		return (Usuario) query.uniqueResult();		
	}
	
	
//	public static Usuario getUsuariostatic(String login, String senha) {
//		Query query = getSession().createQuery("from Usuario usr where usr.login = ? and usr.hashSenha = ?");
//		query.setString(0, login);
//		query.setString(1, senha);
//		return (Usuario) query.uniqueResult();		
//	}

	@Override
	public Usuario getUsuario(String login) {
		Query query = getSession().createQuery("from Usuario usr where usr.login = ?");
		query.setString(0, login);
		return (Usuario) query.uniqueResult();
	}
	
	

}
