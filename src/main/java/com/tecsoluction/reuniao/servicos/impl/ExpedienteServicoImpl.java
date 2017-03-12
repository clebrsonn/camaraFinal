package com.tecsoluction.reuniao.servicos.impl;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.Expediente;
import com.tecsoluction.reuniao.servicos.ExpedienteService;

public class ExpedienteServicoImpl implements ExpedienteService {


	
	@Resource
    private DaoGenerico<Expediente, Long> expedienteDao;
	
	

	public DaoGenerico<Expediente, Long> getExpedienteDao() {
		return expedienteDao;
	}

	public void setExpedienteDao(DaoGenerico<Expediente, Long> expedienteDao) {
		this.expedienteDao = expedienteDao;
	}




	
	

	
	

}
