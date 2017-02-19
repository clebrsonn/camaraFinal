package com.tecsoluction.reuniao;

import com.sun.media.sound.ModelAbstractChannelMixer;
import com.tecsoluction.reuniao.dao.UsuarioDAOImpl;
import com.tecsoluction.reuniao.entidade.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpSession;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    private Usuario usuario;
    
    
    private UsuarioDAOImpl daoimpl;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);
        
        ModelAndView mv = new ModelAndView("login");

        return mv ;
    }
    

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView Autenticacao(@RequestParam("login") String login, @RequestParam("senha") String senha, HttpSession sessao) {
    	
    		Usuario usuario = daoimpl.getUsuario(login, senha);
    		if (usuario != null) {
//    			erroLogin
    			ModelAndView mv = new ModelAndView("erro");
    			return mv;
    			
    		} else {
    			usuario.setUltimoLogin(new Date());
//    			UsuarioDAOImpl.persistir(usuario);
    			sessao.setAttribute("usuario", usuario);
    			
    			ModelAndView mv = new  ModelAndView("home");
    			mv.addObject("usuario", usuario);
    			
    			/**
    			 * Quando retornamos algo no formato redirect:/url estmaos
    			 * na realidade fazendo o redirecionamento para uma action lógica
    			 */
    			return mv;
    		} 

    }
    
    @RequestMapping(value = "/erro", method = RequestMethod.GET)
    public ModelAndView Erro(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);
        
        ModelAndView mv = new ModelAndView("erro");

        return mv ;
    }
 
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView Home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);
        
        ModelAndView mv = new ModelAndView("home");

        return mv ;
    }


}
