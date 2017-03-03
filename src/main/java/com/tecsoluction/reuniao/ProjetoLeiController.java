package com.tecsoluction.reuniao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tecsoluction.reuniao.dao.AtaDao;
import com.tecsoluction.reuniao.dao.ProjetoLeiDao;
import com.tecsoluction.reuniao.dao.ReuniaoDao;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.ProjetoLei;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.framework.AbstractController;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "projetolei")
public class ProjetoLeiController  {
	
	private static final Logger logger = LoggerFactory.getLogger(ProjetoLeiController.class);
	
	
//	private final ProjetoLeiDAO dao;
//	
//	
//	
//	@Autowired
//	public ProjetoLeiController(ProjetoLeiDAO dao) {
//		super("projetolei");
//		this.dao = dao;
//	
//	}
//
//
//
//	@Override
//	protected JpaRepository<ProjetoLei, Long> getDao() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	protected ProjetoLeiDAO getDao() {
//		// TODO Auto-generated method stub
//		return dao;
//	}
	
	
}
