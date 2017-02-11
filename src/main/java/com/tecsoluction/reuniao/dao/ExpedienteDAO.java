package com.tecsoluction.reuniao.dao;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tecsoluction.reuniao.entidade.Expediente;
import com.tecsoluction.reuniao.framework.AbstractEntityDao;



@Repository
public class ExpedienteDAO extends AbstractEntityDao<Expediente>{

	
	
	
	
	
	
	
	public ExpedienteDAO() {
		super(Expediente.class, "Expediente");
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
