package com.tecsoluction.reuniao.framework;

import java.beans.PropertyEditorSupport;

import com.tecsoluction.reuniao.dao.DaoGenerico;

/**
 * Created by clebr on 17/07/2016.
 */   

public class AbstractEditor<Entity> extends PropertyEditorSupport {

    private final DaoGenerico<Entity,Long> dao;

    public AbstractEditor(final DaoGenerico<Entity,Long> dao) {
        this.dao = dao;
    }

    @Override
    public void setAsText(final String id) {

        if (id.equalsIgnoreCase("")) {
            this.setValue(null);
        } else {
            final Entity entity = dao.pesquisarPorId(Long.parseLong(id));

            this.setValue(entity);
        }
    }

}
