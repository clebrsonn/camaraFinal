package com.tecsoluction.reuniao.dao;

import com.tecsoluction.reuniao.entidade.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.SUPPORTS)
@Repository("UsuarioDAOImpl")
public class UsuarioDAOImpl implements UsuarioDAO, UserDetailsService {


    private SessionFactory sessionFactory;


    public SessionFactory getSessionFactory() {

        return sessionFactory;

    }

    public void setSessionFactory(SessionFactory sf) {

        sessionFactory = sf;

    }

    protected Session getSession() {
        return getSessionFactory().getCurrentSession();

    }


    public Usuario getUsuario(String login, String senha) {
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


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Query query = getSession().createQuery("from Usuario usr where usr.login = ?");
        query.setString(0, s);
        return (Usuario) query.uniqueResult();

//		return null;
    }
}
