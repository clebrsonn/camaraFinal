package com.tecsoluction.reuniao;

import com.tecsoluction.reuniao.entidade.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    private Usuario usuario;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "login";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public ModelAndView Home(Locale locale, Model model) {

//		chamar algum m�todo de autentica��o

//        usuario = new Usuario();
//        usuario.setId(00001L);
//        usuario.setNome("Cristina Alves");
//        usuario.setSenha("1321645");
//        usuario.setEmail("lalalal@alal.com");

        ModelAndView home = new ModelAndView("home");


        home.addObject("Usuario", usuario);


        return home;
    }


}
