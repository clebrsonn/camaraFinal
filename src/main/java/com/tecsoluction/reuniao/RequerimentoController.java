package com.tecsoluction.reuniao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tecsoluction.reuniao.dao.AtaDAO;
import com.tecsoluction.reuniao.dao.RequerimentoDAO;
import com.tecsoluction.reuniao.dao.ReuniaoDAO;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.Requerimento;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.framework.AbstractController;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "requerimento")
public class RequerimentoController extends AbstractController<Requerimento> {
	
	private static final Logger logger = LoggerFactory.getLogger(RequerimentoController.class);
	
	
	private final RequerimentoDAO dao;
	
	
	
	@Autowired
	public RequerimentoController(RequerimentoDAO dao) {
		super("requerimento");
		this.dao = dao;
	
	}



	@Override
	protected JpaRepository<Requerimento, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
