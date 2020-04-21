package com.cg.backgroundverification.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.backgroundverification.dto.DocumentDto;

@Repository
public interface DocumentDao extends JpaRepository<DocumentDto,Integer> {

}
