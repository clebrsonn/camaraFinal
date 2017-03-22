package com.tecsoluction.reuniao.servicos.impl;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.Orador;
import com.tecsoluction.reuniao.servicos.OradorService;

public class OradorServicoImpl implements OradorService {


	
	@Resource
    private DaoGenerico<Orador, Long> oradoresDao;
	
	

	public DaoGenerico<Orador, Long> getOradoresDao() {
		return oradoresDao;
	}

	public void setOradoresDao(DaoGenerico<Orador, Long> oradorDao) {
		this.oradoresDao = oradorDao;
	}




	
	

	
	

}
