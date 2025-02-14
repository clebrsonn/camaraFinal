package com.tecsoluction.reuniao.framework;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Cleberson on 04/07/2016.
 *
 * @version 1.0
 */
@Component
public abstract class AbstractEntityDao<Entity> {

    protected
    @PersistenceContext
    EntityManager manager;

    private Class<Entity> entityClass;
    private String entityAlias;
    
    

    public AbstractEntityDao(Class<Entity> entityClass, String entityAlias) {
        this.entityClass = entityClass;
        this.entityAlias = entityAlias;
    }

    public List<Entity> getAll() {
        List<Entity> result = manager.createQuery("SELECT p FROM " + entityAlias + " p", entityClass).getResultList();
        return result;
    }

    @Transactional
    public void add(Entity entity) {
        manager.persist(entity);
    }

//    public int searchEntityCount() {
//        StringBuilder predicate = new StringBuilder("1 = 1");
//        appendPredicate(predicate, options);
//        String jpql = "select count(" + entityAlias + ") from " + entityClass.getName() + " " + entityAlias + " where " + predicate;
//        TypedQuery<Long> query = manager.createQuery(jpql, Long.class);
//        setParameters(options, query);
//        Long result = query.getSingleResult();
//        return result.intValue();
//    }

    @Transactional
    public void editar(Entity entity) {
//    	manager.find(entityClass, id);
    	
//    	Entity entityant = manager.find(entityClass, id);
//    	entityant.= entity;
 //   	manager.remove(entityant);
    	
    	 manager.merge(entity);
    	
    }

    @Transactional
    public void delete(long id) {
//        Object id = manager.getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(entity);
//        Entity managedEntity = manager.find(entityClass, id);
        Entity managedEntity = manager.getReference(entityClass, id);
        manager.remove(managedEntity);
    }

    @Transactional
    public Entity PegarPorId(long entityId) {
        return manager.find(entityClass, entityId);
    }


//    public Entity searchOneEntity(String entity) {
//        TypedQuery<Entity> query = manager.createQuery(createQueryOne(),
//                entityClass);
//        query.setParameter("entityName", entity.toUpperCase());
//        List<Entity> result = query.getResultList();
//        if (result.isEmpty()) {
//            return null;
//        } else {
//            return result.get(0);
//        }
//    }

}
