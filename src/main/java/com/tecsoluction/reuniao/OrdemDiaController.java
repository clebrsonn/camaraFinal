package com.tecsoluction.reuniao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tecsoluction.reuniao.dao.AtaDAO;
import com.tecsoluction.reuniao.dao.OrdemDiaDAO;
import com.tecsoluction.reuniao.dao.ReuniaoDAO;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.OrdemDia;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.framework.AbstractController;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "ordemdia")
public class OrdemDiaController extends AbstractController<OrdemDia> {
	
	private static final Logger logger = LoggerFactory.getLogger(OrdemDiaController.class);
	
	
	private final OrdemDiaDAO dao;
	
	
	
	@Autowired
	public OrdemDiaController(OrdemDiaDAO dao) {
		super("ordemdia");
		this.dao = dao;
	
	}

	@Override
	protected OrdemDiaDAO getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
	
	
}
