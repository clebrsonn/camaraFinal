package com.tecsoluction.reuniao.servicos.impl;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.entidade.Vereador;
import com.tecsoluction.reuniao.servicos.ReuniaoService;
import com.tecsoluction.reuniao.servicos.VereadorService;

public class ReuniaoServicoImpl implements ReuniaoService {

	
	
	
	
	@Resource
    private DaoGenerico<Reuniao, Long> reuniaoDao;
	
	

	public DaoGenerico<Reuniao, Long> getReuniaoDao() {
		return reuniaoDao;
	}

	public void setReuniaoDao(DaoGenerico<Reuniao, Long> reuniaoDao) {
		this.reuniaoDao = reuniaoDao;
	}


	
	

	
	

}
