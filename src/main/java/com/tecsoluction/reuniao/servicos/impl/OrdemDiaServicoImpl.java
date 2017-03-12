package com.tecsoluction.reuniao.servicos.impl;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.Expediente;
import com.tecsoluction.reuniao.entidade.OrdemDia;
import com.tecsoluction.reuniao.servicos.ExpedienteService;
import com.tecsoluction.reuniao.servicos.OrdemDiaService;

public class OrdemDiaServicoImpl implements OrdemDiaService {


	
	@Resource
    private DaoGenerico<OrdemDia, Long> ordemdiaDao;
	
	

	public DaoGenerico<OrdemDia, Long> getOrdemDiaDao() {
		return ordemdiaDao;
	}

	public void setOrdemDiaDao(DaoGenerico<OrdemDia, Long> ordemdiaDao) {
		this.ordemdiaDao = ordemdiaDao;
	}




	
	

	
	

}
