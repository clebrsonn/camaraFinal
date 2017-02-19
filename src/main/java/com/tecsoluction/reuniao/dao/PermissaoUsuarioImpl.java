package com.tecsoluction.reuniao.dao;

import com.tecsoluction.reuniao.entidade.PermissaoUsuario;
import com.tecsoluction.reuniao.entidade.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("daoPermissaoUsuario")
public class PermissaoUsuarioImpl implements PermissaoUsuarioDAO {


    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<PermissaoUsuario> getPermissoesUsuario(Usuario usuario) {

        if (usuario == null) {
            return new ArrayList<PermissaoUsuario>();
        }
        Query query = sessionFactory.getCurrentSession().createQuery("from PermissaoUsuario pu where pu.usuario = ?");
        query.setEntity(0, usuario);
        return query.list();
    }

    @Override
    public void addRole(String role, Usuario usuario) {

        if (role != null && usuario != null) {
            PermissaoUsuario permissao = new PermissaoUsuario();
            permissao.setRole(role);
//			permissao.setUsuario(usuario);
            usuario.getRoles().add(permissao);
            sessionFactory.getCurrentSession().saveOrUpdate(permissao);
        }

    }

}
