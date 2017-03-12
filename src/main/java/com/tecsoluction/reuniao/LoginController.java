package com.tecsoluction.reuniao;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.framework.AbstractController;
import com.tecsoluction.reuniao.servicos.impl.UsuarioServicoImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
@Scope("request")
public class LoginController  {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

   @Autowired
    private UsuarioServicoImpl usuarioServico;
    
    

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        
        ModelAndView mv = new ModelAndView("login");

        return mv ;
    }
    

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView Autenticacao(String username,  String senha) {
//
    		Usuario usuario = usuarioServico.buscaPorLoginESenha(username, senha);
//    		
    		if (usuario == null) {
////    			erroLogin
    			ModelAndView mv = new ModelAndView("erro");
    			return mv;
//
    		} else {
////    			usuario.setUltimoLogin(new Date());
////    			UsuarioDaoImpl.persistir(usuario);
////    			sessao.setAttribute("usuario", usuario);
//
    			ModelAndView mv = new  ModelAndView("home");
    			mv.addObject("usuario", usuario);
//
//    			/**
//    			 * Quando retornamos algo no formato redirect:/url estmaos
//    			 * na realidade fazendo o redirecionamento para uma action lógica
//    			 */
   			return mv;
   		}
    }

    
    
    @RequestMapping(value = "/erro", method = RequestMethod.GET)
    public ModelAndView Erro(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);


        
        ModelAndView mv = new ModelAndView("erro");

        return mv ;
    }
 
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView Home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        
        ModelAndView mv = new ModelAndView("home");

        return mv ;
    }
    
	private String getPrincipal(){
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails)principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}
	
	
//	 @ModelAttribute
//	    public void addAttributes(Model model) {
//
//	        List<Categoria> categoriaList = getDao().getAll();
//	        model.addAttribute("categoriaList", categoriaList);
//	    }
}
