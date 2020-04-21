package com.cg.backgroundverification.service;

import java.util.List;

import com.cg.backgroundverification.dto.DocumentDto;



public interface DocumentService {
	
      public DocumentDto  getDoc(int docId);
	 
	  public List<DocumentDto> getAllDocumentDetails();
	 
	  public void addDocument(DocumentDto doc);

}
