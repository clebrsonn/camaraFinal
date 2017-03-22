package com.tecsoluction.reuniao.servicos.impl;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.Aparte;
import com.tecsoluction.reuniao.servicos.AparteService;

public class AparteServicoImpl implements AparteService {


	
	@Resource
    private DaoGenerico<Aparte, Long> aparteDao;
	
	

	public DaoGenerico<Aparte, Long> getAparteDao() {
		return aparteDao;
	}

	public void setAparteDao(DaoGenerico<Aparte, Long> aparteDao) {
		this.aparteDao = aparteDao;
	}




	
	

	
	

}
