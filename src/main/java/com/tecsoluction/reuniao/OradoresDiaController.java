package com.tecsoluction.reuniao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tecsoluction.reuniao.dao.AtaDAO;
import com.tecsoluction.reuniao.dao.OradoresDiaDAO;
import com.tecsoluction.reuniao.dao.ReuniaoDAO;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.OradoresDia;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.framework.AbstractController;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "oradoresdia")
public class OradoresDiaController extends AbstractController<OradoresDia> {
	
	private static final Logger logger = LoggerFactory.getLogger(OradoresDiaController.class);
	
	
	private final OradoresDiaDAO dao;
	
	
	
	@Autowired
	public OradoresDiaController(OradoresDiaDAO dao) {
		super("oradoresdia");
		this.dao = dao;
	
	}

	@Override
	protected OradoresDiaDAO getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
	
	
}
