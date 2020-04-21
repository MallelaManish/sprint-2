package com.cg.backgroundverification.service;

import java.util.List;

import com.cg.backgroundverification.dto.UploadDocumentDto;



public interface UploadDocumentService {
	
	  public UploadDocumentDto getUploadDoc(int uploadDocId);
	 
	  public List<UploadDocumentDto> getAllUploadDetails();
	 
	  public void addUploadDocument(UploadDocumentDto uploadDoc);
	

}
