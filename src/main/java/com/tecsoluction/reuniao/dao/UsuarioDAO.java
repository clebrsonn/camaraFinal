package com.tecsoluction.reuniao.dao;

import com.tecsoluction.reuniao.entidade.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by clebr on 11/02/2017.
 */
@Repository
public interface UsuarioDAO extends CrudRepository<Usuario, Long> {
}
