package com.cg.backgroundverification.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.backgroundverification.dto.UploadDocumentDto;

@Repository
public interface UploadDocumentDao extends JpaRepository<UploadDocumentDto,Integer> {

}
