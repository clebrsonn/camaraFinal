package com.tecsoluction.reuniao.dao;

import com.tecsoluction.reuniao.entidade.Role;

public interface RoleDao extends DaoGenerico<Role, Long> {

	Role retornarRolePorUsuario(long idusuario);
	
	
}
