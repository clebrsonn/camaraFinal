package com.tecsoluction.reuniao.servicos.impl;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.Expediente;
import com.tecsoluction.reuniao.entidade.OradoresDia;
import com.tecsoluction.reuniao.servicos.ExpedienteService;
import com.tecsoluction.reuniao.servicos.OradoresDiaService;

public class OradoresDiaServicoImpl implements OradoresDiaService {


	
	@Resource
    private DaoGenerico<OradoresDia, Long> oradoresdiaDao;
	
	

	public DaoGenerico<OradoresDia, Long> getOradoresDiaDao() {
		return oradoresdiaDao;
	}

	public void setOradoresDiaDao(DaoGenerico<OradoresDia, Long> oradoresdiaDao) {
		this.oradoresdiaDao = oradoresdiaDao;
	}




	
	

	
	

}
