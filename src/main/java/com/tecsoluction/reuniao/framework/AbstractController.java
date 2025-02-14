package com.tecsoluction.reuniao.framework;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public abstract class AbstractController<Entity> {


    private final String entityAlias;

    public AbstractController(String entityAlias) {
        this.entityAlias = entityAlias;
    }

    protected abstract JpaRepository<Entity, Long> getDao();

    @RequestMapping(value = "cadastro", method = RequestMethod.GET)
    public ModelAndView cadastrarEntity() {

        ModelAndView cadastro = new ModelAndView("cadastro" + entityAlias);
//        cadastro.addObject("acao", "add");

//        Iterable<Entity> entityList = getDao().findAll();
//    	 
//    	 cadastro.addObject("entityList", entityList);

        return cadastro;

//        return new ModelAndView("cadastro" + entityAlias);
    }

    @Transactional
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ModelAndView AdicionarEntity(@ModelAttribute Entity entity) {

//        ModelAndView cadastroEntity = new ModelAndView("cadastro" + entityAlias);

        getDao().save(entity);
//        getDao().PegarPorId(entity);

//        cadastroEntity.addObject("entity", entity);

        System.out.println(entityAlias);
//        return "redirect:cadastro";
        //cadastroEntity;

//        return new ModelAndView("redirect:/" + entityAlias + "/cadastro");

        return new ModelAndView("redirect:/" + entityAlias + "/movimentacao");
    }


    @RequestMapping(value = "movimentacao", method = RequestMethod.GET)
    public ModelAndView movimentacaoEntity() {

        ModelAndView movimentacao = new ModelAndView("movimentacao" + entityAlias);

        List<Entity> entityList = getDao().findAll();

        movimentacao.addObject(entityAlias + "List", entityList);

        return movimentacao;
    }

    @Transactional
    @RequestMapping(value = "edicao", method = RequestMethod.GET)
    public ModelAndView editarEntityForm(HttpServletRequest request) {

        Entity entity;
        long idf = Long.parseLong(request.getParameter("id"));
        ModelAndView edicao = new ModelAndView("edicao" + entityAlias);
        entity = getDao().findOne(idf);
        edicao.addObject(entityAlias, entity);
        edicao.addObject("acao", "edicao");


        return edicao;
    }

    @Transactional
    @RequestMapping(value = "edicao", method = RequestMethod.POST)
    public ModelAndView editarEntity(HttpServletRequest request, Entity entity) {


        Long idf = Long.parseLong(request.getParameter("id"));
        getDao().save(entity);


        return new ModelAndView("redirect:/" + entityAlias + "/" + "movimentacao");
    }

    @Transactional
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public ModelAndView deletarEntity(HttpServletRequest request) {


        long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView movimentacaocategoria = new ModelAndView("movimentacaocategoria");
        getDao().delete(idf);


        return new ModelAndView("redirect:/" + entityAlias + "/movimentacao");
    }


}
