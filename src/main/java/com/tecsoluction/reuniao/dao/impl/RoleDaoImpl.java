package com.tecsoluction.reuniao.dao.impl;

import javax.persistence.Query;

import com.tecsoluction.reuniao.dao.RoleDao;
import com.tecsoluction.reuniao.entidade.Role;
import com.tecsoluction.reuniao.entidade.Usuario;

public class RoleDaoImpl extends DaoGenericoImpl<Role, Long> implements RoleDao {

	@Override
	public Role retornarRolePorUsuario(long idusuario) {

			Role role = new Role();
			
			String queryS = "SELECT obj FROM USUARIO_ROLE WHERE USUARIO_ROLE.IDUSUARIO='"+idusuario+"' obj";
			Query query = getEntityManager().createQuery(queryS);
			role = (Role) query.getResultList() ;
		
		return role;
	}



	


	
}
