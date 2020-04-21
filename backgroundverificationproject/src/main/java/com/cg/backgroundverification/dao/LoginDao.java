package com.cg.backgroundverification.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.backgroundverification.dto.LoginDto;

@Repository
public interface LoginDao extends JpaRepository<LoginDto,Integer> {

}
