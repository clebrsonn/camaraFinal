package com.tecsoluction.reuniao.dao;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tecsoluction.reuniao.entidade.Mocao;
import com.tecsoluction.reuniao.framework.AbstractEntityDao;



@Repository
public class MocaoDAO extends AbstractEntityDao<Mocao>{

	
	
	
	
	
	
	
	public MocaoDAO() {
		super(Mocao.class, "Mocao");
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	@Override
	protected void appendPredicate(StringBuilder predicate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setParameters(TypedQuery<?> query) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void appendOrder(StringBuilder predicate) {
		// TODO Auto-generated method stub
		
	}

}
