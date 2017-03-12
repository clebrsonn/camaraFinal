package com.tecsoluction.reuniao;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.reuniao.dao.AtaDao;
import com.tecsoluction.reuniao.dao.ExpedienteDao;
import com.tecsoluction.reuniao.dao.ReuniaoDao;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.Expediente;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.entidade.Role;
import com.tecsoluction.reuniao.entidade.Vereador;
import com.tecsoluction.reuniao.framework.AbstractController;
import com.tecsoluction.reuniao.servicos.impl.ExpedienteServicoImpl;
import com.tecsoluction.reuniao.servicos.impl.ReuniaoServicoImpl;
import com.tecsoluction.reuniao.servicos.impl.VereadorServicoImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/expediente")
@Scope("request")
public class ExpedienteController {
	
	private static final Logger logger = LoggerFactory.getLogger(ExpedienteController.class);
	
	
	@Autowired
	private ExpedienteServicoImpl expedienteServico;
	
	
	private List< Expediente> expedientes;
	
	
	@Autowired
	private ReuniaoServicoImpl reuniaoServico;
	
	
	private List< Reuniao> reunioes;
	
	

	  @InitBinder
	    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

	        binder.registerCustomEditor(Reuniao.class, new com.tecsoluction.reuniao.framework.AbstractEditor<Reuniao>(reuniaoServico.getReuniaoDao()){

	        });
	        
	  }
	
	
	   @RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	    public ModelAndView MovimentacaoExpediente() {
	        logger.info("Movimentacao Expediente.");

	        expedientes = expedienteServico.getExpedienteDao().todos();
	        
	       reunioes = reuniaoServico.getReuniaoDao().todos();
	        
	        ModelAndView mv = new ModelAndView("movimentacaoexpediente");
	        mv.addObject("expedienteList", expedientes);
	        mv.addObject("reuniaoList", reunioes);

	        

	        return mv ;
	    }
	   
	    
	    @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String AddExpediente(@ModelAttribute ("expediente") Expediente expediente) {
	       
	    	logger.info("Adicionando expediente! .");
	    	

	    	expedienteServico.getExpedienteDao().atualizar(expediente);
	    	
	    	
	        

	        return "redirect:movimentacao" ;
	    }
	    
	    
		
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView DeleteExpediente(@ModelAttribute ("expediente") Expediente expediente) {
	       
	    	logger.info("Deletado expediente! .");
	    	
	    	expedienteServico.getExpedienteDao().excluir(expediente);
	    	
	    	
			return MovimentacaoExpediente();
	    	

	    }	
	    

	    @RequestMapping(value = "/editar", method = RequestMethod.GET)
	    public ModelAndView editarExpedienteForm(HttpServletRequest request) {

	        long idf = Long.parseLong(request.getParameter("id"));
	        
	        ModelAndView edicao = new ModelAndView("editarexpediente");
	        
	       
	        Expediente expediente =   new Expediente();
	        
	        expediente = expedienteServico.getExpedienteDao().pesquisarPorId(idf);
	        
		     reunioes = reuniaoServico.getReuniaoDao().todos();

	       	        		
	     
	        edicao.addObject("expediente", expediente);
	        edicao.addObject("reuniaoList", reunioes);


	        return edicao;
	    }


	    @RequestMapping(value = "/editar", method = RequestMethod.POST)
	    public ModelAndView editarExpediente(HttpServletRequest request, Expediente expediente) {


	        Long idf = Long.parseLong(request.getParameter("id"));

	        expedienteServico.getExpedienteDao().atualizar(expediente);
	        

	        return  MovimentacaoExpediente();
	    }
		
		
		
		
	    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
	    public ModelAndView VisualizarVereador(HttpServletRequest request, Vereador expediente) {

	    	Expediente expedientevis = new Expediente();
	    	
	        Long idf = Long.parseLong(request.getParameter("id"));

	        expedientevis =expedienteServico.getExpedienteDao().pesquisarPorId(idf);
	        
	        
	        ModelAndView visualizacao = new ModelAndView("visualizacaoexpediente");
	        visualizacao.addObject("expediente", expedientevis);

	        

	        return  visualizacao;
	    }
	
	
}
