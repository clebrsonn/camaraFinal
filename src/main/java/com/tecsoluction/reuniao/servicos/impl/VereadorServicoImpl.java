package com.tecsoluction.reuniao.servicos.impl;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.Vereador;
import com.tecsoluction.reuniao.servicos.VereadorService;

public class VereadorServicoImpl implements VereadorService {

	
	
	
	
	@Resource
    private DaoGenerico<Vereador, Long> vereadorDao;
	
	

	public DaoGenerico<Vereador, Long> getVereadorDao() {
		return vereadorDao;
	}

	public void setVereadorDao(DaoGenerico<Vereador, Long> usuarioDao) {
		this.vereadorDao = usuarioDao;
	}

	@Override
	public Vereador buscaVereadorPor(String login, String senha) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	

}
