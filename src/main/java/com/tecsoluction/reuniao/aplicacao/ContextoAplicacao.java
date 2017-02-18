package com.tecsoluction.reuniao.aplicacao;

import com.tecsoluction.reuniao.dao.UsuarioDAO;
import com.tecsoluction.reuniao.entidade.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by clebr on 01/09/2016.
 */


@ControllerAdvice
public class ContextoAplicacao {

    private
    final
    UsuarioDAO usuarioDao;

    @Autowired
    public ContextoAplicacao(UsuarioDAO usuarioAtt) {

        this.usuarioDao = usuarioAtt;
    }


    @ModelAttribute
    public void addAttributes(Model model) {
//        Usuario usuarioAtt = usuarioDao.findOne(00002L);
//        model.addAttribute("usuarioAtt", usuarioAtt);
    }

}
