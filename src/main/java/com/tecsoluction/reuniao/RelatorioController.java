package com.tecsoluction.reuniao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

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
