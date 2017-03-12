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

import com.tecsoluction.reuniao.entidade.OrdemDia;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.servicos.impl.OrdemDiaServicoImpl;
import com.tecsoluction.reuniao.servicos.impl.ReuniaoServicoImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/ordemdia")
@Scope("request")
public class OrdemDiaController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrdemDiaController.class);
	
	
	@Autowired
	private  OrdemDiaServicoImpl ordemdiaService;
	
	private List<OrdemDia> ordemdias;
	
	@Autowired
	private ReuniaoServicoImpl reuniaoServico;
	
	
	private List< Reuniao> reunioes;

	
	
	  @InitBinder
	    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

	        binder.registerCustomEditor(Reuniao.class, new com.tecsoluction.reuniao.framework.AbstractEditor<Reuniao>(reuniaoServico.getReuniaoDao()){

	        });
	        
	  }
	
	 @RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	    public ModelAndView MovimentacaoOrdemDia() {
	        logger.info("Movimentacao OrdemDias.");

	        
	        ordemdias = ordemdiaService.getOrdemDiaDao().todos();
	        
	        reunioes = reuniaoServico.getReuniaoDao().todos();
	       
	        ModelAndView mv = new ModelAndView("movimentacaoordemdia");
	        mv.addObject("ordemdiaList", ordemdias);
	        mv.addObject("reuniaoList", reunioes);


	        

	        return mv ;
	    }
	 
	 
	 
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String AddOrdemDia(@ModelAttribute ("ordemdia") OrdemDia ordemdia, BindingResult bindingResult, Model model) {
	       
	    	logger.info("Adicionando OrdemDia ! .");
	    	
	    	ordemdiaService.getOrdemDiaDao().atualizar(ordemdia);

	        

	        return "redirect:movimentacao" ;
	    }
		
		
		
		
		
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView DeleteOrdemDia(@ModelAttribute ("ordemdia") OrdemDia ordemdia) {
	       
	    	logger.info("Deletado OrdemDia! ");
	    	
	    	ordemdiaService.getOrdemDiaDao().excluir(ordemdia);
	    	
	    	
			return MovimentacaoOrdemDia();
	    	

	    }	
		
		

	    @RequestMapping(value = "/editar", method = RequestMethod.GET)
	    public ModelAndView editarOrdemDiaForm(HttpServletRequest request) {

	        long idf = Long.parseLong(request.getParameter("id"));
	        
	        ModelAndView edicao = new ModelAndView("editarordemdia");
	        
	       
	        OrdemDia ordemdia =   new OrdemDia();
	        
	        ordemdia = ordemdiaService.getOrdemDiaDao().pesquisarPorId(idf);   
	        
	        reunioes = reuniaoServico.getReuniaoDao().todos();

	     
	        edicao.addObject("ordemdia", ordemdia);
	        edicao.addObject("reuniaoList", reunioes);


	        return edicao;
	    }


	    @RequestMapping(value = "/editar", method = RequestMethod.POST)
	    public ModelAndView editarordemdia(HttpServletRequest request, OrdemDia ordemdia) {


	        Long idf = Long.parseLong(request.getParameter("id"));

	        ordemdiaService.getOrdemDiaDao().atualizar(ordemdia);
	        

	        return  MovimentacaoOrdemDia();
	    }
		
		
		
		
	    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
	    public ModelAndView VisualizarOrdemDia(HttpServletRequest request, OrdemDia ordemdia) {

	    	OrdemDia ordemdiaViz = new OrdemDia();
	        Long idf = Long.parseLong(request.getParameter("id"));

	        ordemdiaViz =ordemdiaService.getOrdemDiaDao().pesquisarPorId(idf);
	        
	        
	        ModelAndView visualizacao = new ModelAndView("visualizacaoordemdia");
	        visualizacao.addObject("ordemdia", ordemdiaViz);

	        

	        return  visualizacao;
	    }
	
	
}
