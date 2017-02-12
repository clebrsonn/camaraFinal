package com.tecsoluction.reuniao.dao;

import com.tecsoluction.reuniao.entidade.Reuniao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by clebr on 11/02/2017.
 */
@Repository
public interface ReuniaoDAO extends JpaRepository<Reuniao, Long> {

}
