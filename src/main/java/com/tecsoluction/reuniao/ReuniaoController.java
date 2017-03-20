package com.tecsoluction.reuniao;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.servicos.impl.ReuniaoServicoImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/reuniao")
@Scope("request")	
public class ReuniaoController  {

    private static final Logger logger = LoggerFactory.getLogger(ReuniaoController.class);

    @Autowired
	private ReuniaoServicoImpl reuniaoServico;
	
	
	private List< Reuniao> reuniaoes;	
	

	
	
	 @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	  public ModelAndView CadastrarReuniaoForm(HttpServletRequest request, Reuniao reuniao) {

		  Reuniao reuniaonew = new Reuniao();     
	      

	      ModelAndView cadastrar = new ModelAndView("cadastrarreuniao");
	      cadastrar.addObject("reuniao", reuniaonew);

	      

	      return  cadastrar;
	      
	 }

	
	   @RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	    public ModelAndView MovimentacaoReuniao() {
	        logger.info("Movimentacao Veredor.");

	        reuniaoes = reuniaoServico.getReuniaoDao().todos();
	        
//	        roles = roleService.getRoleDao().todos();
	        ModelAndView mv = new ModelAndView("movimentacaoreuniao");
	        mv.addObject("reuniaoList", reuniaoes);
//	        mv.addObject("roleList", roles);

	        

	        return mv ;
	    }
	   
	    
	    @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String AddReuniao(@ModelAttribute ("reuniao") Reuniao reuniao) {
	       
	    	logger.info("Adicionando Reuniao! .");
	    	

	    	reuniaoServico.getReuniaoDao().atualizar(reuniao);
	        

	        return "redirect:movimentacao" ;
	    }
	    
	    
		
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView DeleteReuniao(@ModelAttribute ("reuniao") Reuniao reuniao) {
	       
	    	logger.info("Deletado Reuniao! .");
	    	
	    	reuniaoServico.getReuniaoDao().excluir(reuniao);
	    	
	    	
			return MovimentacaoReuniao();
	    	

	    }	
	    

	    @RequestMapping(value = "/editar", method = RequestMethod.GET)
	    public ModelAndView editarReuniaoForm(HttpServletRequest request) {

	        long idf = Long.parseLong(request.getParameter("id"));
	        
	        ModelAndView edicao = new ModelAndView("editarreuniao");
	        
	       
	        Reuniao reuniao =   new Reuniao();
	        
	        reuniao = reuniaoServico.getReuniaoDao().pesquisarPorId(idf);
	       	        		
	     
	        edicao.addObject("reuniao", reuniao);


	        return edicao;
	    }


	    @RequestMapping(value = "/editar", method = RequestMethod.POST)
	    public ModelAndView editarReuniao(HttpServletRequest request, Reuniao reuniao) {


	        Long idf = Long.parseLong(request.getParameter("id"));

	        reuniaoServico.getReuniaoDao().atualizar(reuniao);
	        

	        return MovimentacaoReuniao();
	    }
		
		
		
		
	    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
	    public ModelAndView VisualizarReuniao(HttpServletRequest request, Reuniao reuniao) {

	    	Reuniao reuniaovis = new Reuniao();
	        Long idf = Long.parseLong(request.getParameter("id"));

	        reuniaovis =reuniaoServico.getReuniaoDao().pesquisarPorId(idf);
	        
	        
	        ModelAndView visualizacao = new ModelAndView("visualizacaoreuniao");
	        visualizacao.addObject("reuniao", reuniaovis);

	        

	        return  visualizacao;
	    }



}
