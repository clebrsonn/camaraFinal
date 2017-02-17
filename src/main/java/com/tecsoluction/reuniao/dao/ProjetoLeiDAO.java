package com.tecsoluction.reuniao.dao;

import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecsoluction.reuniao.entidade.OradoresDia;
import com.tecsoluction.reuniao.entidade.ProjetoLei;
import com.tecsoluction.reuniao.framework.AbstractEntityDao;



@Repository
public interface ProjetoLeiDAO extends  JpaRepository<ProjetoLei, Long>{

	
	
	
}
