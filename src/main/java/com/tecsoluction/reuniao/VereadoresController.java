package com.tecsoluction.reuniao;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.tecsoluction.reuniao.framework.AbstractController;
import com.tecsoluction.reuniao.framework.AbstractEntityDao;
import com.tecsoluction.reuniao.servicos.impl.UsuarioServicoImpl;
import com.tecsoluction.reuniao.servicos.impl.VereadorServicoImpl;
import com.tecsoluction.reuniao.dao.VereadorDao;
import com.tecsoluction.reuniao.entidade.Role;
import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.entidade.Vereador;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/vereador")
@Scope("request")
public class VereadoresController {
	
	
	@Autowired
	private VereadorServicoImpl vereadorServico;
	
	
	private List< Vereador> vereadores;
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(VereadoresController.class);
	
	

	

	
	   @RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	    public ModelAndView MovimentacaoVeredor() {
	        logger.info("Movimentacao Veredor.");

	        vereadores = vereadorServico.getVereadorDao().todos();
	        
//	        roles = roleService.getRoleDao().todos();
	        ModelAndView mv = new ModelAndView("movimentacaovereador");
	        mv.addObject("vereadorList", vereadores);
//	        mv.addObject("roleList", roles);

	        

	        return mv ;
	    }
	   
	    
	    @RequestMapping(value = "/add", method = RequestMethod.GET)
	    public String AddVereador(@ModelAttribute ("vereador") Vereador vereador) {
	       
	    	logger.info("Adicionando Vereador! .", vereador.getNome());
	    	

	    	vereadorServico.getVereadorDao().salvar(vereador);
	        

	        return "redirect:movimentacao" ;
	    }
	    
	    
		
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView DeleteVereador(@ModelAttribute ("vereador") Vereador vereador) {
	       
	    	logger.info("Deletado Vereador! .", vereador.getNome());
	    	
	    	vereadorServico.getVereadorDao().excluir(vereador);
	    	
	    	
			return MovimentacaoVeredor();
	    	

	    }	
	    

	    @RequestMapping(value = "/editar", method = RequestMethod.GET)
	    public ModelAndView editarVereadorForm(HttpServletRequest request) {

	        long idf = Long.parseLong(request.getParameter("id"));
	        
	        ModelAndView edicao = new ModelAndView("editarvereador");
	        
	       
	        Vereador vereador =   new Vereador();
	        
	        vereador = vereadorServico.getVereadorDao().pesquisarPorId(idf);
	       	        		
	     
	        edicao.addObject("vereador", vereador);


	        return edicao;
	    }


	    @RequestMapping(value = "/editar", method = RequestMethod.POST)
	    public ModelAndView editarVereador(HttpServletRequest request, Vereador vereador) {


	        Long idf = Long.parseLong(request.getParameter("id"));

	        vereadorServico.getVereadorDao().atualizar(vereador);
	        

	        return  MovimentacaoVeredor();
	    }
		
		
		
		
	    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
	    public ModelAndView VisualizarVereador(HttpServletRequest request, Vereador vereador) {

	    	Vereador vereadorvis = new Vereador();
	        Long idf = Long.parseLong(request.getParameter("id"));

	        vereadorvis =vereadorServico.getVereadorDao().pesquisarPorId(idf);
	        
	        
	        ModelAndView visualizacao = new ModelAndView("visualizacaovereador");
	        visualizacao.addObject("vereador", vereadorvis);

	        

	        return  visualizacao;
	    }
	
}
