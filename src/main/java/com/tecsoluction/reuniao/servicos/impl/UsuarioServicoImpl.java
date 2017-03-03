package com.tecsoluction.reuniao.servicos.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.servicos.UsuarioService;

public class UsuarioServicoImpl implements UsuarioService {

	
	
	@Resource
    private DaoGenerico<Usuario, Long> usuarioDao;

	public DaoGenerico<Usuario, Long> getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(DaoGenerico<Usuario, Long> usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	
	
	
	
	
	
	@Override
	public Usuario buscaPorLoginESenha(String username, String senha) {

		Usuario usuario = null;
        String query = "SELECT u FROM Usuario u WHERE u.username=:username and u.senha=:senha";
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("username", username);
        params.put("senha", senha);
        usuario = getUsuarioDao().pesqParam(query , params);
        return usuario;
	}

}
