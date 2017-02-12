package com.tecsoluction.reuniao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tecsoluction.reuniao.dao.UsuarioDAO;
import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.framework.AbstractController;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "usuario/")
public class UsuarioController extends AbstractController<Usuario> {
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
	

	private final UsuarioDAO dao;
	
//    private final String entityAlias;

	
	@Autowired
	public UsuarioController(UsuarioDAO dao) {
		super("usuario");
		this.dao = dao;
//        this.entityAlias = entityAlias;

	
	}

	@Override
	protected UsuarioDAO getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
	
//    @Transactional
//    @RequestMapping(value = "add", method = RequestMethod.POST)
//    public ModelAndView AdicionarEntity(@ModelAttribute Entity entity) {
//
////        ModelAndView cadastroEntity = new ModelAndView("cadastro" + entityAlias);
//
//        getDao().add(entity);
////        getDao().PegarPorId(entity);
//
////        cadastroEntity.addObject("entity", entity);
//
//        System.out.println(entityAlias);
////        return "redirect:cadastro";//cadastroEntity;
//       
//        return new ModelAndView("redirect:/" + entityAlias + "/movimentacao");
//    }
	
}
