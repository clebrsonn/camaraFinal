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

import com.tecsoluction.reuniao.entidade.Aparte;
import com.tecsoluction.reuniao.servicos.impl.AparteServicoImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "aparte")
@Scope("request")
public class AparteController {
	
	private static final Logger logger = LoggerFactory.getLogger(AparteController.class);
	
	
	@Autowired
	private  AparteServicoImpl aparteService;
	
	private List<Aparte> apartes;
	
	
	
//	@Autowired
//	private AparteServicoImpl aparteServico;
//	
//	
//	private List< Aparte> apartes;

	
	
//	  @InitBinder
//	    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
//
//	        binder.registerCustomEditor(Aparte.class, new com.tecsoluction.reuniao.framework.AbstractEditor<Aparte>(aparteServico.getAparteDao()){
//
//	        });
//	        
//	  }
	  
	  
	  
		 @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
		  public ModelAndView CadastrarAparteForm(HttpServletRequest request, Aparte aparte) {

			  Aparte apartenew = new Aparte();     
		      
//		       reunioes = reuniaoServico.getReuniaoDao().todos();

		      ModelAndView cadastrar = new ModelAndView("cadastraraparte");
		      cadastrar.addObject("aparte", apartenew);
//		      cadastrar.addObject("reuniaoList", reunioes);

		      

		      return  cadastrar;
		      
		 }
	
	 @RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	    public ModelAndView MovimentacaoAparte() {
	        logger.info("Movimentacao Apartes.");

	        
	        apartes = aparteService.getAparteDao().todos();
	        
//	        reunioes = reuniaoServico.getReuniaoDao().todos();

	       
	        ModelAndView mv = new ModelAndView("movimentacaoaparte");
	        mv.addObject("aparteList", apartes);
//	        mv.addObject("reuniaoList", reunioes);

	        

	        return mv ;
	    }
	 
	 
	 
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String AddAparte(@ModelAttribute ("aparte") Aparte aparte, BindingResult bindingResult, Model model) {
	       
	    	logger.info("Adicionando Aparte ! .");
	    	
	    	aparteService.getAparteDao().atualizar(aparte);

	        

	        return "redirect:movimentacao" ;
	    }
		
		
		
		
		
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView DeleteAparte(@ModelAttribute ("aparte") Aparte aparte) {
	       
	    	logger.info("Deletado Aparte! ");
	    	
	    	aparteService.getAparteDao().excluir(aparte);
	    	
	    	
			return MovimentacaoAparte();
	    	

	    }	
		
		

	    @RequestMapping(value = "/editar", method = RequestMethod.GET)
	    public ModelAndView editarAparteForm(HttpServletRequest request) {

	        long idf = Long.parseLong(request.getParameter("id"));
	        
	        ModelAndView edicao = new ModelAndView("editaraparte");
	        
	       
	        Aparte aparte =   new Aparte();
	        
	        aparte = aparteService.getAparteDao().pesquisarPorId(idf); 
	        
//	        reunioes = reuniaoServico.getReuniaoDao().todos();

	     
	        edicao.addObject("aparte", aparte);
//	        edicao.addObject("reuniaoList", reunioes);


	        return edicao;
	    }


	    @RequestMapping(value = "/editar", method = RequestMethod.POST)
	    public ModelAndView editaraparte(HttpServletRequest request, Aparte aparte) {


	        Long idf = Long.parseLong(request.getParameter("id"));

	        aparteService.getAparteDao().atualizar(aparte);
	        

	        return  MovimentacaoAparte();
	    }
		
		
		
		
	    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
	    public ModelAndView VisualizarAparte(HttpServletRequest request, Aparte aparte) {

	    	Aparte aparteViz = new Aparte();
	        Long idf = Long.parseLong(request.getParameter("id"));

	        aparteViz =aparteService.getAparteDao().pesquisarPorId(idf);
	        
	        
	        ModelAndView visualizacao = new ModelAndView("visualizacaoaparte");
	        visualizacao.addObject("aparte", aparteViz);

	        

	        return  visualizacao;
	    }
	
	
}
