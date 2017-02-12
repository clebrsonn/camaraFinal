package com.tecsoluction.reuniao;


import com.tecsoluction.reuniao.dao.ReuniaoDAO;
import com.tecsoluction.reuniao.entidade.Reuniao;
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
@RequestMapping(value = "reuniao")
public class ReuniaoController extends AbstractController<Reuniao> {

    private static final Logger logger = LoggerFactory.getLogger(ReuniaoController.class);


    @Autowired private ReuniaoDAO dao;



    public ReuniaoController(ReuniaoDAO dao) {
        super("reuniao");
        this.dao = dao;

    }

    @Override
    protected ReuniaoDAO getDao() {
        // TODO Auto-generated method stub
        return dao;
    }


}
