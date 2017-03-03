package com.tecsoluction.reuniao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tecsoluction.reuniao.dao.AtaDao;
import com.tecsoluction.reuniao.dao.ExpedienteDao;
import com.tecsoluction.reuniao.dao.ReuniaoDao;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.Expediente;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.framework.AbstractController;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "expediente")
public class ExpedienteController {
	
	private static final Logger logger = LoggerFactory.getLogger(ExpedienteController.class);
	
	
//	private final ExpedienteDAO dao;
//	
//	
//	
//	@Autowired
//	public ExpedienteController(ExpedienteDAO dao) {
//		super("expediente");
//		this.dao = dao;
//	
//	}
//
//
//
//	@Override
//	protected JpaRepository<Expediente, Long> getDao() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	protected ExpedienteDAO getDao() {
//		// TODO Auto-generated method stub
//		return dao;
//	}
	
	
}
