package com.tecsoluction.reuniao.servicos.impl;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.Mocao;
import com.tecsoluction.reuniao.servicos.MocaoService;

public class MocaoServicoImpl implements MocaoService {


	
	@Resource
    private DaoGenerico<Mocao, Long> mocaoDao;
	
	

	public DaoGenerico<Mocao, Long> getMocaoDao() {
		return mocaoDao;
	}

	public void setMocaoDao(DaoGenerico<Mocao, Long> mocaoDao) {
		this.mocaoDao = mocaoDao;
	}




	
	

	
	

}
