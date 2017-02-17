package com.tecsoluction.reuniao.dao;

import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecsoluction.reuniao.entidade.OradoresDia;




@Repository
public interface OradoresDiaDAO extends JpaRepository<OradoresDia, Long>{

	

}
