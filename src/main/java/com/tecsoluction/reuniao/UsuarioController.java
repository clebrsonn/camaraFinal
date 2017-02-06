package com.tecsoluction.reuniao;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.reuniao.dao.ReuniaoDAO;
import com.tecsoluction.reuniao.dao.UsuarioDAO;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.framework.AbstractController;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "usuario")
public class UsuarioController extends AbstractController<Usuario> {
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
	

	private final UsuarioDAO dao;
	
	
	
	@Autowired
	public UsuarioController(UsuarioDAO dao) {
		super("usuario");
		this.dao = dao;
	
	}

	@Override
	protected UsuarioDAO getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
	

	
}
