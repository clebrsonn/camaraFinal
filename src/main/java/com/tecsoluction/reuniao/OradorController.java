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
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.reuniao.entidade.Aparte;
import com.tecsoluction.reuniao.entidade.Orador;
import com.tecsoluction.reuniao.servicos.impl.AparteServicoImpl;
import com.tecsoluction.reuniao.servicos.impl.OradorServicoImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "orador")
@Scope("request")
public class OradorController {
	
	private static final Logger logger = LoggerFactory.getLogger(OradorController.class);
	
	
	@Autowired
	private  OradorServicoImpl oradorService;
	
	private List<Orador> oradores;
	
	@Autowired
	private AparteServicoImpl aparteServico;
	
	
	private List< Aparte> apartes;

	
	
	  @InitBinder
	    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

	        binder.registerCustomEditor(Aparte.class, new com.tecsoluction.reuniao.framework.AbstractEditor<Aparte>(aparteServico.getAparteDao()){

	        });
	        
	  }
	  
	  
	  
		 @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
		  public ModelAndView CadastrarOradorForm(HttpServletRequest request, Orador orador) {

			  Orador oradornew = new Orador();     
		      
//		       reunioes = reuniaoServico.getReuniaoDao().todos();

		      ModelAndView cadastrar = new ModelAndView("cadastrarorador");
		      cadastrar.addObject("orador", oradornew);
//		      cadastrar.addObject("reuniaoList", reunioes);

		      

		      return  cadastrar;
		      
		 }
	
	 @RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	    public ModelAndView MovimentacaoOrador() {
	        logger.info("Movimentacao Oradors.");

	        
	        oradores = oradorService.getOradoresDao().todos();
	        
//	        reunioes = reuniaoServico.getReuniaoDao().todos();

	       
	        ModelAndView mv = new ModelAndView("movimentacaoorador");
	        mv.addObject("oradorList", oradores);
//	        mv.addObject("reuniaoList", reunioes);

	        

	        return mv ;
	    }
	 
	 
	 
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String AddOrador(@ModelAttribute ("orador") Orador orador, BindingResult bindingResult, Model model) {
	       
	    	logger.info("Adicionando Orador ! .");
	    	
	    	oradorService.getOradoresDao().atualizar(orador);

	        

	        return "redirect:movimentacao" ;
	    }
		
		
		
		
		
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView DeleteOrador(@ModelAttribute ("orador") Orador orador) {
	       
	    	logger.info("Deletado Orador! ");
	    	
	    	oradorService.getOradoresDao().excluir(orador);
	    	
	    	
			return MovimentacaoOrador();
	    	

	    }	
		
		

	    @RequestMapping(value = "/editar", method = RequestMethod.GET)
	    public ModelAndView editarOradorForm(HttpServletRequest request) {

	        long idf = Long.parseLong(request.getParameter("id"));
	        
	        ModelAndView edicao = new ModelAndView("editarorador");
	        
	       
	        Orador orador =   new Orador();
	        
	        orador = oradorService.getOradoresDao().pesquisarPorId(idf); 
	        
//	        reunioes = reuniaoServico.getReuniaoDao().todos();

	     
	        edicao.addObject("orador", orador);
//	        edicao.addObject("reuniaoList", reunioes);


	        return edicao;
	    }


	    @RequestMapping(value = "/editar", method = RequestMethod.POST)
	    public ModelAndView editarorador(HttpServletRequest request, Orador orador) {


	        Long idf = Long.parseLong(request.getParameter("id"));

	        oradorService.getOradoresDao().atualizar(orador);
	        

	        return  MovimentacaoOrador();
	    }
		
		
		
		
	    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
	    public ModelAndView VisualizarOrador(HttpServletRequest request, Orador orador) {

	    	Orador oradorViz = new Orador();
	        Long idf = Long.parseLong(request.getParameter("id"));

	        oradorViz =oradorService.getOradoresDao().pesquisarPorId(idf);
	        
	        
	        ModelAndView visualizacao = new ModelAndView("visualizacaoorador");
	        visualizacao.addObject("orador", oradorViz);

	        

	        return  visualizacao;
	    }
	
	
}
