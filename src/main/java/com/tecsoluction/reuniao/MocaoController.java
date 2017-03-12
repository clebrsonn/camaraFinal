package com.tecsoluction.reuniao;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.reuniao.dao.AtaDao;
import com.tecsoluction.reuniao.dao.MocaoDao;
import com.tecsoluction.reuniao.dao.ReuniaoDao;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.Mocao;
import com.tecsoluction.reuniao.entidade.Requerimento;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.framework.AbstractController;
import com.tecsoluction.reuniao.servicos.impl.MocaoServicoImpl;
import com.tecsoluction.reuniao.servicos.impl.RequerimentoServicoImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/mocao")
@Scope("request")
public class MocaoController  {
	
	private static final Logger logger = LoggerFactory.getLogger(MocaoController.class);
	
	
	@Autowired
	private  MocaoServicoImpl mocaoService;
	
	private List<Mocao> mocoes;

	
	
	 @RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	    public ModelAndView MovimentacaoMocao() {
	        logger.info("Movimentacao Mocao.");

	        
	        mocoes = mocaoService.getMocaoDao().todos();
	       
	        ModelAndView mv = new ModelAndView("movimentacaomocao");
	        mv.addObject("mocaoList", mocoes);

	        

	        return mv ;
	    }
	 
	 
	 
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String AddMocao(@ModelAttribute ("mocao") Mocao mocao, BindingResult bindingResult, Model model) {
	       
	    	logger.info("Adicionando Mocao ! .");
	    	
	    	mocaoService.getMocaoDao().atualizar(mocao);

	        

	        return "redirect:movimentacao" ;
	    }
		
		
		
		
		
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView DeleteMocao(@ModelAttribute ("mocao") Mocao mocao) {
	       
	    	logger.info("Deletado Mocao! ");
	    	
	    	mocaoService.getMocaoDao().excluir(mocao);
	    	
	    	
			return MovimentacaoMocao();
	    	

	    }	
		
		

	    @RequestMapping(value = "/editar", method = RequestMethod.GET)
	    public ModelAndView editarMocaoForm(HttpServletRequest request) {

	        long idf = Long.parseLong(request.getParameter("id"));
	        
	        ModelAndView edicao = new ModelAndView("editarmocao");
	        
	       
	        Mocao mocao =   new Mocao();
	        
	        mocao = mocaoService.getMocaoDao().pesquisarPorId(idf);        		
	     
	        edicao.addObject("mocao", mocao);


	        return edicao;
	    }


	    @RequestMapping(value = "/editar", method = RequestMethod.POST)
	    public ModelAndView editarMocao(HttpServletRequest request, Mocao mocao) {


	        Long idf = Long.parseLong(request.getParameter("id"));

	        mocaoService.getMocaoDao().atualizar(mocao);
	        

	        return  MovimentacaoMocao();
	    }
		
		
		
		
	    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
	    public ModelAndView VisualizarMocao(HttpServletRequest request, Mocao mocao) {

	    	Mocao mocaoViz = new Mocao();
	        Long idf = Long.parseLong(request.getParameter("id"));

	        mocaoViz =mocaoService.getMocaoDao().pesquisarPorId(idf);
	        
	        
	        ModelAndView visualizacao = new ModelAndView("visualizacaomocao");
	        visualizacao.addObject("mocao", mocaoViz);

	        

	        return  visualizacao;
	    }
	
	
}
