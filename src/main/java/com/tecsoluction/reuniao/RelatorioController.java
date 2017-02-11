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
import com.tecsoluction.reuniao.framework.AbstractController;
import com.tecsoluction.reuniao.framework.AbstractEntityDao;
import com.tecsoluction.reuniao.dao.VereadorDAO;
import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.entidade.Vereador;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "relatorio/")
public class RelatorioController {
	
	private static final Logger logger = LoggerFactory.getLogger(RelatorioController.class);
	
	
	


	
	@RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	public ModelAndView Relatorio(Locale locale, Model model) {
		
//		chamar algum método de autenticação
		
		
		ModelAndView relatorio = new ModelAndView("movimentacaorelatorio");
		
			

		
		return relatorio;
	}

	
	
	
}
