package com.tecsoluction.reuniao.servicos.impl;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.ProjetoLei;
import com.tecsoluction.reuniao.entidade.Requerimento;
import com.tecsoluction.reuniao.servicos.ProjetoLeiService;
import com.tecsoluction.reuniao.servicos.RequerimentoService;

public class RequerimentoServicoImpl implements RequerimentoService {


	
	@Resource
    private DaoGenerico<Requerimento, Long> requrimentoDao;
	
	

	public DaoGenerico<Requerimento, Long> getRequerimentoDao() {
		return requrimentoDao;
	}

	public void setProjetoLeiDao(DaoGenerico<Requerimento, Long> requerimentoDao) {
		this.requrimentoDao = requerimentoDao;
	}




	
	

	
	

}
