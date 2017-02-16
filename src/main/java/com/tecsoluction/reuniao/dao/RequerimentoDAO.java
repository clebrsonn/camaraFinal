package com.tecsoluction.reuniao.dao;

import com.tecsoluction.reuniao.entidade.Requerimento;
import com.tecsoluction.reuniao.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;



@Repository
public class RequerimentoDAO extends AbstractEntityDao<Requerimento>{

	public RequerimentoDAO() {
		super(Requerimento.class, "Requerimento");
		// TODO Auto-generated constructor stub
	}

}
