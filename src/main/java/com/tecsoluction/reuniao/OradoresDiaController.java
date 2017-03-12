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
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.reuniao.dao.AtaDao;
import com.tecsoluction.reuniao.dao.OradoresDiaDao;
import com.tecsoluction.reuniao.dao.ReuniaoDao;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.OradoresDia;
import com.tecsoluction.reuniao.entidade.OradoresDia;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.framework.AbstractController;
import com.tecsoluction.reuniao.servicos.impl.OradoresDiaServicoImpl;
import com.tecsoluction.reuniao.servicos.impl.ReuniaoServicoImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "oradoresdia")
@Scope("request")
public class OradoresDiaController {
	
	private static final Logger logger = LoggerFactory.getLogger(OradoresDiaController.class);
	
	
	@Autowired
	private  OradoresDiaServicoImpl oradoresdiaService;
	
	private List<OradoresDia> oradoresdias;
	
	@Autowired
	private ReuniaoServicoImpl reuniaoServico;
	
	
	private List< Reuniao> reunioes;

	
	
	  @InitBinder
	    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

	        binder.registerCustomEditor(Reuniao.class, new com.tecsoluction.reuniao.framework.AbstractEditor<Reuniao>(reuniaoServico.getReuniaoDao()){

	        });
	        
	  }
	
	 @RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	    public ModelAndView MovimentacaoOradoresDia() {
	        logger.info("Movimentacao OradoresDias.");

	        
	        oradoresdias = oradoresdiaService.getOradoresDiaDao().todos();
	        
	        reunioes = reuniaoServico.getReuniaoDao().todos();

	       
	        ModelAndView mv = new ModelAndView("movimentacaooradoresdia");
	        mv.addObject("oradoresdiaList", oradoresdias);
	        mv.addObject("reuniaoList", reunioes);

	        

	        return mv ;
	    }
	 
	 
	 
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String AddOradoresDia(@ModelAttribute ("oradoresdia") OradoresDia oradoresdia, BindingResult bindingResult, Model model) {
	       
	    	logger.info("Adicionando OradoresDia ! .");
	    	
	    	oradoresdiaService.getOradoresDiaDao().atualizar(oradoresdia);

	        

	        return "redirect:movimentacao" ;
	    }
		
		
		
		
		
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView DeleteOradoresDia(@ModelAttribute ("oradoresdia") OradoresDia oradoresdia) {
	       
	    	logger.info("Deletado OradoresDia! ");
	    	
	    	oradoresdiaService.getOradoresDiaDao().excluir(oradoresdia);
	    	
	    	
			return MovimentacaoOradoresDia();
	    	

	    }	
		
		

	    @RequestMapping(value = "/editar", method = RequestMethod.GET)
	    public ModelAndView editarOradoresDiaForm(HttpServletRequest request) {

	        long idf = Long.parseLong(request.getParameter("id"));
	        
	        ModelAndView edicao = new ModelAndView("editaroradoresdia");
	        
	       
	        OradoresDia oradoresdia =   new OradoresDia();
	        
	        oradoresdia = oradoresdiaService.getOradoresDiaDao().pesquisarPorId(idf); 
	        
	        reunioes = reuniaoServico.getReuniaoDao().todos();

	     
	        edicao.addObject("oradoresdia", oradoresdia);
	        edicao.addObject("reuniaoList", reunioes);


	        return edicao;
	    }


	    @RequestMapping(value = "/editar", method = RequestMethod.POST)
	    public ModelAndView editaroradoresdia(HttpServletRequest request, OradoresDia oradoresdia) {


	        Long idf = Long.parseLong(request.getParameter("id"));

	        oradoresdiaService.getOradoresDiaDao().atualizar(oradoresdia);
	        

	        return  MovimentacaoOradoresDia();
	    }
		
		
		
		
	    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
	    public ModelAndView VisualizarOradoresDia(HttpServletRequest request, OradoresDia oradoresdia) {

	    	OradoresDia oradoresdiaViz = new OradoresDia();
	        Long idf = Long.parseLong(request.getParameter("id"));

	        oradoresdiaViz =oradoresdiaService.getOradoresDiaDao().pesquisarPorId(idf);
	        
	        
	        ModelAndView visualizacao = new ModelAndView("visualizacaooradoresdia");
	        visualizacao.addObject("oradoresdia", oradoresdiaViz);

	        

	        return  visualizacao;
	    }
	
	
}
