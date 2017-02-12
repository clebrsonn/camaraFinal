package com.tecsoluction.reuniao;

import com.tecsoluction.reuniao.dao.UsuarioDAO;
import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.framework.AbstractController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "usuario")
public class UsuarioController extends AbstractController<Usuario> {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);


    private final UsuarioDAO dao;


    @Autowired
    public UsuarioController(UsuarioDAO dao) {
        super("usuario");
        this.dao = dao;

    }

    @Override
    protected UsuarioDAO getDao() {
        // TODO Auto-generated method stub
        return dao;
    }


}
