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
import com.tecsoluction.reuniao.dao.ProjetoLeiDao;
import com.tecsoluction.reuniao.dao.ReuniaoDao;
import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.ProjetoLei;
import com.tecsoluction.reuniao.entidade.ProjetoLei;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.framework.AbstractController;
import com.tecsoluction.reuniao.servicos.ProjetoLeiService;
import com.tecsoluction.reuniao.servicos.impl.ProjetoLeiServicoImpl;
import com.tecsoluction.reuniao.servicos.impl.UsuarioServicoImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "projetolei")
@Scope("request")
public class ProjetoLeiController  {
	
	@Autowired
	private  ProjetoLeiServicoImpl projetoleiService;
	
	private List<ProjetoLei> projetosleis;

	
	
	private static final Logger logger = LoggerFactory.getLogger(ProjetoLeiController.class);
	
	
	
	
	 @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	  public ModelAndView CadastrarProjetoLeiForm(HttpServletRequest request, ProjetoLei projetolei) {

		  ProjetoLei projetoleinew = new ProjetoLei();     
	      

	      ModelAndView cadastrar = new ModelAndView("cadastrarprojetolei");
	      cadastrar.addObject("projetolei", projetoleinew);

	      

	      return  cadastrar;
	      
	 }
	
	
	 @RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	    public ModelAndView MovimentacaoProjetoLei() {
	        logger.info("Movimentacao Projeto de Lei.");

	        
	        projetosleis =  projetoleiService.getProjetoLeiDao().todos();
	       
//	        model.addAttribute("usuario", new Usuario());

	        ModelAndView mv = new ModelAndView("movimentacaoprojetolei");
	        mv.addObject("projetoleiList", projetosleis);

	        

	        return mv ;
	    }
	 
	 
	 
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String AddProjetoLei(@ModelAttribute ("projetolei") ProjetoLei projetolei, BindingResult bindingResult, Model model) {
	       
	    	logger.info("Adicionando ProjetoLei ! .");
	    	
	    	projetoleiService.getProjetoLeiDao().atualizar(projetolei);

	        

	        return "redirect:movimentacao" ;
	    }
		
		
		
		
		
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView DeleteProjetoLei(@ModelAttribute ("projetolei") ProjetoLei projetolei) {
	       
	    	logger.info("Deletado projetolei! ");
	    	
	    	projetoleiService.getProjetoLeiDao().excluir(projetolei);
	    	
	    	
			return MovimentacaoProjetoLei();
	    	

	    }	
		
		

	    @RequestMapping(value = "/editar", method = RequestMethod.GET)
	    public ModelAndView editarProjetoLeiForm(HttpServletRequest request) {

	        long idf = Long.parseLong(request.getParameter("id"));
	        
	        ModelAndView edicao = new ModelAndView("editarprojetolei");
	        
	       
	        ProjetoLei projetolei =   new ProjetoLei();
	        
	        projetolei = projetoleiService.getProjetoLeiDao().pesquisarPorId(idf);
	        	       
//	        edicao.addObject("roleList", roles);
	        		
	     
	        edicao.addObject("projetolei", projetolei);


	        return edicao;
	    }


	    @RequestMapping(value = "/editar", method = RequestMethod.POST)
	    public ModelAndView editarProjetoLei(HttpServletRequest request, ProjetoLei projetolei) {


	        Long idf = Long.parseLong(request.getParameter("id"));

	        projetoleiService.getProjetoLeiDao().atualizar(projetolei);
	        

	        return  MovimentacaoProjetoLei();
	    }
		
		
		
		
	    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
	    public ModelAndView VisualizarProjetoLei(HttpServletRequest request, ProjetoLei projetolei) {

	    	ProjetoLei projetoleiViz = new ProjetoLei();
	        Long idf = Long.parseLong(request.getParameter("id"));

	        projetoleiViz =projetoleiService.getProjetoLeiDao().pesquisarPorId(idf);
	        
	        
	        ModelAndView visualizacao = new ModelAndView("visualizacaoprojetolei");
	        visualizacao.addObject("projetolei", projetoleiViz);

	        

	        return  visualizacao;
	    }
		
		

	
	
//	private final ProjetoLeiDAO dao;
//	
//	
//	
//	@Autowired
//	public ProjetoLeiController(ProjetoLeiDAO dao) {
//		super("projetolei");
//		this.dao = dao;
//	
//	}
//
//
//
//	@Override
//	protected JpaRepository<ProjetoLei, Long> getDao() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	protected ProjetoLeiDAO getDao() {
//		// TODO Auto-generated method stub
//		return dao;
//	}
	
	
}
