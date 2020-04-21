package com.cg.backgroundverification.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.backgroundverification.dao.DocumentDao;
import com.cg.backgroundverification.dto.DocumentDto;
import com.cg.backgroundverification.service.DocumentService;


@Service
public class DocumentServiceImpl implements DocumentService {
    
	@Autowired
	DocumentDao docDao;
	public void setDocumentDao(DocumentDao docDao) 
	{
		this.docDao = docDao;
	}
	
	
	
	@Override
	@Transactional(readOnly=true)
	public DocumentDto getDoc(int docId) {
		
		return docDao.findById(docId).get();
	}

	@Override
	@Transactional(readOnly=true)
	public List<DocumentDto> getAllDocumentDetails() {
	
		return docDao.findAll();
	}

	@Override
	@Transactional
	public void addDocument(DocumentDto doc) {

        docDao.save(doc);
		
	}
	/*
	 * 	@Transactional(readOnly=true)
    public List<Booking> getAllBookingDetails()
    {
    	return bookingDao.findAll();
    }

	@Transactional
    public void addBookingDetails(Booking booking)
    {
    	bookingDao.save(booking);
    }
	
	 */

}
