package com.tecsoluction.reuniao.aplicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.tecsoluction.reuniao.dao.impl.UsuarioDaoImpl;
import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.servicos.impl.UsuarioServicoImpl;

/**
 * Created by clebr on 01/09/2016.
 */


@ControllerAdvice
@Scope("request")
public class ContextoAplicacao {

	
	

	private UsuarioServicoImpl usuarioServico;

    
	
	
    public ContextoAplicacao(UsuarioServicoImpl usuarioAtt) {

        this.usuarioServico = usuarioAtt;
    }


    @ModelAttribute
    public void addAttributes(Model model) {
        Usuario usuarioAtt = usuarioServico.getUsuarioDao().pesquisarPorId(1L);
        model.addAttribute("usuarioAtt", usuarioAtt);
        
    }

}
