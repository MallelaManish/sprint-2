package com.cg.backgroundverification.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.backgroundverification.dao.UploadDocumentDao;
import com.cg.backgroundverification.dto.UploadDocumentDto;
import com.cg.backgroundverification.service.UploadDocumentService;

@Service
public class UploadDocumentServiceImpl implements UploadDocumentService {
	
	@Autowired
	UploadDocumentDao uploadDoc;
	public void setUploadDocumentDao(UploadDocumentDao uploadDoc) {this.uploadDoc=uploadDoc;}
	
	@Override
	@Transactional(readOnly=true)
	public UploadDocumentDto getUploadDoc(int uploadDocId) {
		
		return uploadDoc.findById(uploadDocId).get();
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<UploadDocumentDto> getAllUploadDetails() {
		
		return uploadDoc.findAll();
	}
	
	@Override
	@Transactional
	public void addUploadDocument(UploadDocumentDto  uploadDocument) {
	
		uploadDoc.save(uploadDocument);
	}

	
	
	

}
