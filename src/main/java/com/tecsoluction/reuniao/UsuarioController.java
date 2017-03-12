package com.tecsoluction.reuniao;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.reuniao.entidade.Role;
import com.tecsoluction.reuniao.entidade.Usuario;
import com.tecsoluction.reuniao.entidade.Vereador;
import com.tecsoluction.reuniao.servicos.UsuarioService;
import com.tecsoluction.reuniao.servicos.impl.RoleServicoImpl;
import com.tecsoluction.reuniao.servicos.impl.UsuarioServicoImpl;
import com.tecsoluction.reuniao.validator.UsuarioValidador;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/usuario")
@Scope("request")
public class UsuarioController {

	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);


	@Autowired
	private UsuarioServicoImpl usuarioServico;
	
	@Autowired
	private UsuarioValidador usuarioValidador;
	
	
	private List<Usuario> usuarios;
	
	private Set<Usuario> setUsuarios;
	
	@Autowired
	private RoleServicoImpl roleService;
	
	private List<Role> roles;

	private Set<Role> setRoles;
	
	
	
  @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Role.class, new com.tecsoluction.reuniao.framework.AbstractEditor<Role>(roleService.getRoleDao()){

        });
        
  }
	
    @RequestMapping(value = "movimentacao", method = RequestMethod.GET)
    public ModelAndView MovimentacaoUsuario() {
        logger.info("Movimentacao Usuario.");

        usuarios = usuarioServico.getUsuarioDao().todos();
        
        
//        model.addAttribute("usuario", new Usuario());
        
        roles = roleService.getRoleDao().todos();
        ModelAndView mv = new ModelAndView("movimentacaousuario");
        mv.addObject("usuarioList", usuarios);
        mv.addObject("roleList", roles);

        

        return mv ;
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String AddUsuario(@ModelAttribute ("usuario") Usuario usuario, BindingResult bindingResult, Model model) {
       
    	logger.info("Adicionando Usuario! .", usuario.getUserName());
    	
    	usuarioServico.getUsuarioDao().atualizar(usuario);

        

        return "redirect:movimentacao" ;
    }
	
	
	
	
	
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView DeleteUsuarior(@ModelAttribute ("usuario") Usuario usuario) {
       
    	logger.info("Deletado usuario! .", usuario.getUserName());
    	
    	usuarioServico.getUsuarioDao().excluir(usuario);
    	
    	
		return MovimentacaoUsuario();
    	

    }	
	
	

    @RequestMapping(value = "/editar", method = RequestMethod.GET)
    public ModelAndView editarUsuarioForm(HttpServletRequest request) {

        long idf = Long.parseLong(request.getParameter("id"));
        
        ModelAndView edicao = new ModelAndView("editarusuario");
        
       
        Usuario usuario =   new Usuario();
        
        usuario = usuarioServico.getUsuarioDao().pesquisarPorId(idf);
        
        roles = roleService.getRoleDao().todos();
       
        edicao.addObject("roleList", roles);
        		
     
        edicao.addObject("usuario", usuario);


        return edicao;
    }


    @RequestMapping(value = "/editar", method = RequestMethod.POST)
    public ModelAndView editarEntity(HttpServletRequest request, Usuario usuario) {


        Long idf = Long.parseLong(request.getParameter("id"));

        usuarioServico.getUsuarioDao().atualizar(usuario);
        

        return  MovimentacaoUsuario();
    }
	
	
	
	
    @RequestMapping(value = "/visualizacao", method = RequestMethod.GET)
    public ModelAndView VisualizarUsuario(HttpServletRequest request, Usuario usuario) {

    	Usuario usuariovis = new Usuario();
        Long idf = Long.parseLong(request.getParameter("id"));

        usuariovis =usuarioServico.getUsuarioDao().pesquisarPorId(idf);
        
        
        ModelAndView visualizacao = new ModelAndView("visualizacaousuario");
        visualizacao.addObject("usuario", usuariovis);

        

        return  visualizacao;
    }
	
	
	
	
	
	
	
	
//	private UsuarioDao usuarioDao;
//	
//	
//	
//	@Autowired
//	public UsuarioController(UsuarioDao dao) {
//		super("ata");
//		this.usuarioDao = dao;
//		
//		
//	}
//
//
//
//	@Override
//	protected UsuarioDao getDao() {
//		// TODO Auto-generated method stub
//		return usuarioDao;
//	}




	
	

 
}
