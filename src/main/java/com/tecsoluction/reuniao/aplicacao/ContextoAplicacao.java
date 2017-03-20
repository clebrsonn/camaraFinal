package com.tecsoluction.reuniao.aplicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.servicos.impl.UsuarioServicoImpl;

/**
 * Created by clebr on 01/09/2016.
 */


@ControllerAdvice
@Scope("request")
public class ContextoAplicacao {

	
	
	@Autowired
	private UsuarioServicoImpl usuarioServico;

    
	
	
    public ContextoAplicacao(UsuarioServicoImpl usuarioAtt) {

        this.usuarioServico = usuarioAtt;
    }


    @ModelAttribute
    public void addAttributes(Model model) {

//        Usuario usuarioAtt = usuarioServico.buscaPorUserName(getPrincipal());
    	
//    	Usuario usuarioAtt = usuarioServico.getUsuarioDao().pesquisarPorId(2L);
    	
        model.addAttribute("usuarioAtt", getPrincipal());
        
    }
    
	private Usuario getPrincipal(){
		
    	
  	Usuario usuarioAtt = usuarioServico.getUsuarioDao().pesquisarPorId(2L);
		
		Authentication authentication = (Authentication) SecurityContextHolder.getContext().getAuthentication(); 
		if(authentication != null){
			Object obj = authentication.getPrincipal();
			if (obj instanceof Usuario){
				return (Usuario) obj;
			}		
		}
		return usuarioAtt;
		
	}

}
