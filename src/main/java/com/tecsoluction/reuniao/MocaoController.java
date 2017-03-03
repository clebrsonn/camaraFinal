package com.tecsoluction.reuniao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tecsoluction.reuniao.dao.AtaDao;
import com.tecsoluction.reuniao.dao.MocaoDao;
import com.tecsoluction.reuniao.dao.ReuniaoDao;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.Mocao;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.framework.AbstractController;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "mocao")
public class MocaoController  {
	
	private static final Logger logger = LoggerFactory.getLogger(MocaoController.class);
	
	
//	private final MocaoDAO dao;
//	
//	
//	
//	@Autowired
//	public MocaoController(MocaoDAO dao) {
//		super("mocao");
//		this.dao = dao;
//	
//	}
//
//
//
//	@Override
//	protected JpaRepository<Mocao, Long> getDao() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	protected MocaoDAO getDao() {
//		// TODO Auto-generated method stub
//		return dao;
//	}
	
	
}
