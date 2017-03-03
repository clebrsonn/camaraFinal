package com.tecsoluction.reuniao.servicos.impl;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.Role;
import com.tecsoluction.reuniao.servicos.RoleService;



public class RoleServicoImpl implements RoleService {

	
	
	@Resource
    private DaoGenerico<Role, Long> roleDao;

	public DaoGenerico<Role, Long> getRoleDao() {
		return roleDao;
	}

	
	public void setRoleDao(DaoGenerico<Role, Long> roleDao) {
		this.roleDao = roleDao;
	}


	@Override
	public Role retornarRolePorUsuario(long idusuario) {
		  Role role = null;
      String query = "SELECT u FROM USUARIO_ROLE r WHERE r.IDUSUARIO=:idusuario";
      Map<String, Object> params = new HashMap<String, Object>();
      params.put("idusuario", idusuario);
//      params.put("senha", senha);
      role = getRoleDao().pesqParam(query , params);
      return role;
	}





//	@Override
//	public Role buscaRolePorUsuario(long idusuario) {
//		// TODO Auto-generated method stub
//		
//	  Role role = null;
//      String query = "SELECT u FROM USUARIO_ROLE r WHERE r.IDUSUARIO=:idusuario";
//      Map<String, Object> params = new HashMap<String, Object>();
//      params.put("idusuario", idusuario);
////      params.put("senha", senha);
//      role = getRoleDao().pesqParam(query , params);
//      return role;
//		
//	}



	
	
	
	
	
	
//	@Override
//	public Usuario buscaPorLoginESenha(String username, String senha) {
//
//		Usuario usuario = null;
//        String query = "SELECT u FROM Usuario u WHERE u.username=:username and u.senha=:senha";
//        Map<String, Object> params = new HashMap<String, Object>();
//        params.put("username", username);
//        params.put("senha", senha);
//        usuario = getUsuarioDao().pesqParam(query , params);
//        return usuario;
//	}

}
