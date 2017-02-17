package com.tecsoluction.reuniao.dao;

import com.tecsoluction.reuniao.entidade.Requerimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RequerimentoDAO extends JpaRepository<Requerimento, Long>{

	

}
