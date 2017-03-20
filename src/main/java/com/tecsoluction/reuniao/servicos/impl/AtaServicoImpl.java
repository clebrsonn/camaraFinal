package com.tecsoluction.reuniao.servicos.impl;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.servicos.AtaService;

public class AtaServicoImpl implements AtaService {


	@Resource
    private DaoGenerico<Ata, Long> ataDao;
	
	

	public DaoGenerico<Ata, Long> getAtaDao() {
		return ataDao;
	}

	public void setAtaDao(DaoGenerico<Ata, Long> ataDao) {
		this.ataDao = ataDao;
	}


	
	

	
	

}
