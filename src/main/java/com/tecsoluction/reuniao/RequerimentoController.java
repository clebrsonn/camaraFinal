package com.tecsoluction.reuniao;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.reuniao.entidade.Requerimento;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.servicos.impl.RequerimentoServicoImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/requerimento")
@Scope("request")
public class RequerimentoController {
	
	private static final Logger logger = LoggerFactory.getLogger(RequerimentoController.class);
	
	
	@Autowired
	private  RequerimentoServicoImpl requerimentoService;
	
	private List<Requerimento> requerimentos;

	
	
	
	
	
	
	
	 @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	  public ModelAndView CadastrarRequerimentoForm(HttpServletRequest request, Requerimento requerimento) {

		  Requerimento requerimentonew = new Requerimento();     
	      

	      ModelAndView cadastrar = new ModelAndView("cadastrarrequerimento");
	      cadastrar.addObject("requerimento", requerimentonew);

	      

	      return  cadastrar;
	      
	 }
	
	
	
	
	 @RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	    public ModelAndView MovimentacaoRequerimento() {
	        logger.info("Movimentacao Requerimentos.");

	        
	        requerimentos = requerimentoService.getRequerimentoDao().todos();
	       
	        ModelAndView mv = new ModelAndView("movimentacaorequerimento");
	        mv.addObject("requerimentoList", requerimentos);

	        

	        return mv ;
	    }
	 
	 
	 
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String AddRequerimento(@ModelAttribute ("requerimento") Requerimento requerimento, BindingResult bindingResult, Model model) {
	       
	    	logger.info("Adicionando Requerimento ! .");
	    	
	    	requerimentoService.getRequerimentoDao().atualizar(requerimento);

	        

	        return "redirect:movimentacao" ;
	    }
		
		
		
		
		
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView DeleteRequerimento(@ModelAttribute ("requerimento") Requerimento requerimento) {
	       
	    	logger.info("Deletado Requerimento! ");
	    	
	    	requerimentoService.getRequerimentoDao().excluir(requerimento);
	    	
	    	
			return MovimentacaoRequerimento();
	    	

	    }	
		
		

	    @RequestMapping(value = "/editar", method = RequestMethod.GET)
	    public ModelAndView editarRequerimentoForm(HttpServletRequest request) {

	        long idf = Long.parseLong(request.getParameter("id"));
	        
	        ModelAndView edicao = new ModelAndView("editarrequerimento");
	        
	       
	        Requerimento requerimento =   new Requerimento();
	        
	        requerimento = requerimentoService.getRequerimentoDao().pesquisarPorId(idf);        		
	     
	        edicao.addObject("requerimento", requerimento);


	        return edicao;
	    }


	    @RequestMapping(value = "/editar", method = RequestMethod.POST)
	    public ModelAndView editarrequerimento(HttpServletRequest request, Requerimento requerimento) {


	        Long idf = Long.parseLong(request.getParameter("id"));

	        requerimentoService.getRequerimentoDao().atualizar(requerimento);
	        

	        return  MovimentacaoRequerimento();
	    }
		
		
		
		
	    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
	    public ModelAndView VisualizarRequerimento(HttpServletRequest request, Requerimento requerimento) {

	    	Requerimento requerimentoViz = new Requerimento();
	        Long idf = Long.parseLong(request.getParameter("id"));

	        requerimentoViz =requerimentoService.getRequerimentoDao().pesquisarPorId(idf);
	        
	        
	        ModelAndView visualizacao = new ModelAndView("visualizacaorequerimento");
	        visualizacao.addObject("requerimento", requerimentoViz);

	        

	        return  visualizacao;
	    }
	
	
}
