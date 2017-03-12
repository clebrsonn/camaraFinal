package com.tecsoluction.reuniao.servicos.impl;

import javax.annotation.Resource;

import com.tecsoluction.reuniao.dao.DaoGenerico;
import com.tecsoluction.reuniao.entidade.ProjetoLei;
import com.tecsoluction.reuniao.servicos.ProjetoLeiService;

public class ProjetoLeiServicoImpl implements ProjetoLeiService {


	
	@Resource
    private DaoGenerico<ProjetoLei, Long> projetoleiDao;
	
	

	public DaoGenerico<ProjetoLei, Long> getProjetoLeiDao() {
		return projetoleiDao;
	}

	public void setProjetoLeiDao(DaoGenerico<ProjetoLei, Long> projetoDao) {
		this.projetoleiDao = projetoDao;
	}




	
	

	
	

}
