package com.tecsoluction.reuniao;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.reuniao.entidade.Ata;
import com.tecsoluction.reuniao.entidade.Reuniao;
import com.tecsoluction.reuniao.poi.WordPoi;
import com.tecsoluction.reuniao.servicos.impl.AtaServicoImpl;
import com.tecsoluction.reuniao.servicos.impl.ReuniaoServicoImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/ata")
@Scope("request")
public class AtaController  {
	
	private static final Logger logger = LoggerFactory.getLogger(AtaController.class);
	
    @Autowired
	private AtaServicoImpl ataServico;
	
	
	private List<Ata> ataes;
	

	@Autowired
	private ReuniaoServicoImpl reuniaoServico;
	
	private List< Reuniao> reunioes;

	
	
	  @InitBinder
	    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

	        binder.registerCustomEditor(Reuniao.class, new com.tecsoluction.reuniao.framework.AbstractEditor<Reuniao>(reuniaoServico.getReuniaoDao()){

	        });
	        
	  }
	

	
	   @RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	    public ModelAndView MovimentacaoAta() {
	        logger.info("Movimentacao Ata.");

	        ataes = ataServico.getAtaDao().todos();
	        
	        reunioes = reuniaoServico.getReuniaoDao().todos();
	        ModelAndView mv = new ModelAndView("movimentacaoata");
	        mv.addObject("ataList", ataes);
	        mv.addObject("reuniaoList", reunioes);

	        

	        return mv ;
	    }
	   
	    
	    @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String AddAta(@ModelAttribute ("ata") Ata ata) {
	       
	    	logger.info("Adicionando Ata! .");
	    	

	    	ataServico.getAtaDao().atualizar(ata);
	        

	        return "redirect:movimentacao" ;
	    }
	    
	    
		
	    @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public ModelAndView DeleteAta(@ModelAttribute ("ata") Ata ata) {
	       
	    	logger.info("Deletado Ata! .");
	    	
	    	ataServico.getAtaDao().excluir(ata);
	    	
	    	
			return MovimentacaoAta();
	    	

	    }	
	    

	    @RequestMapping(value = "/editar", method = RequestMethod.GET)
	    public ModelAndView editarAtaForm(HttpServletRequest request) {

	        long idf = Long.parseLong(request.getParameter("id"));
	        
	        ModelAndView edicao = new ModelAndView("editarata");
	        
	       
	        Ata ata =   new Ata();
	        
	        ata = ataServico.getAtaDao().pesquisarPorId(idf);
	       	        		
	     
	        edicao.addObject("ata", ata);


	        return edicao;
	    }


	    @RequestMapping(value = "/editar", method = RequestMethod.POST)
	    public ModelAndView editarAta(HttpServletRequest request, Ata ata) {


	        Long idf = Long.parseLong(request.getParameter("id"));

	        ataServico.getAtaDao().atualizar(ata);
	        

	        return MovimentacaoAta();
	    }
		
		
		
		
	    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
	    public ModelAndView VisualizarAta(HttpServletRequest request, Ata ata) {

	    	Ata atavis = new Ata();
	        Long idf = Long.parseLong(request.getParameter("id"));

	        atavis =ataServico.getAtaDao().pesquisarPorId(idf);
	        
	        
	        ModelAndView visualizacao = new ModelAndView("visualizacaoata");
	        visualizacao.addObject("ata", atavis);

	        

	        return  visualizacao;
	    }
	    
	    
	    @RequestMapping(value = "/converter", method = RequestMethod.GET)
	    public ModelAndView ConverterAta(HttpServletRequest request, Ata ata) {

//	    	Ata atavis = new Ata();
	        Long idf = Long.parseLong(request.getParameter("id"));

//	        atavis =ataServico.getAtaDao().pesquisarPorId(idf);
	        
//	        
//	        ModelAndView visualizacao = new ModelAndView("visualizacaoata");
//	        visualizacao.addObject("ata", atavis);
	        
	        String path = null;
	        String pathauto = null;
	        
	        
	        try {
				
	        	 path = new File("c://Users//winds//Documents//workspace-sts-3.7.2.RELEASE//camaraFinal//src//main//webapp//resources//ata//tag//atareplace.doc").getPath();
	        	 pathauto = new File("c://Users//winds//Documents//workspace-sts-3.7.2.RELEASE//camaraFinal//src//main//webapp//resources//ata//auto//ataauto.doc").getCanonicalPath();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        // primeiro parametro arquivo de modelo com as tags na máquina local
	        // segundo parametro onde será salvo o documento gerado
	        
	        WordPoi word = new WordPoi(path,pathauto);
	         word.replaceTag("NOME", "WINDSON");
	         word.replaceTag("CPF", "963-289-594-00");
	         word.write();

	        

	        return  MovimentacaoAta();
	    }
	
	
}
