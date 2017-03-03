package com.tecsoluction.reuniao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tecsoluction.reuniao.dao.AtaDao;
import com.tecsoluction.reuniao.dao.OrdemDiaDao;
import com.tecsoluction.reuniao.dao.ReuniaoDao;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.OrdemDia;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.framework.AbstractController;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "ordemdia")
public class OrdemDiaController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrdemDiaController.class);
	
	
//	private final OrdemDiaDAO dao;
//	
//	
//	
//	@Autowired
//	public OrdemDiaController(OrdemDiaDAO dao) {
//		super("ordemdia");
//		this.dao = dao;
//	
//	}
//
//
//
//	@Override
//	protected JpaRepository<OrdemDia, Long> getDao() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	protected OrdemDiaDAO getDao() {
//		// TODO Auto-generated method stub
//		return dao;
//	}
	
	
}
