package com.cg.backgroundverification.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.backgroundverification.dto.DocumentDto;
import com.cg.backgroundverification.dto.LoginDto;
import com.cg.backgroundverification.dto.UploadDocumentDto;
import com.cg.backgroundverification.serviceimpl.DocumentServiceImpl;
import com.cg.backgroundverification.serviceimpl.LoginServiceImpl;
import com.cg.backgroundverification.serviceimpl.UploadDocumentServiceImpl;




@RestController
public class BackGroundVerificationController {
	@Autowired
	LoginServiceImpl loginService;
	public void setLoginServiceImpl(LoginServiceImpl loginService){ this.loginService=loginService; }
	@Autowired
	UploadDocumentServiceImpl uploadService;
	public void setUploadDocumentService(UploadDocumentServiceImpl uploadService) { this.uploadService=uploadService; }
	@Autowired
	DocumentServiceImpl documentService;
	public void setDocumentService(DocumentServiceImpl documentService) { this.documentService=documentService; }
	
	
	@GetMapping("login/{empid}/{password}")
	public void login(@PathVariable int empid,@PathVariable String password)
	{
		System.out.println(empid);
		System.out.println(password);		  
	    int i=0;
   	List <LoginDto> login=loginService.getLogin();
	   for(LoginDto login1:login)
	   {
		    if(login1.getEmpId()==empid && login1.getPassword().equals(password))
   		       {System.out.println("userfound");
   		       i=2;
   		       if(login1.getRoleId()==401)
   		          {
   		    	   System.out.println("Officer");
   		           }
   		     else {
   		    	 System.out.println("Employee");
   		          }
   		        }
	        
	    }
	      if(i==0)
	      System.out.println("User not found");                                       
	}
	
    @GetMapping(value="/getUploadDocument/{uploadDocId}",produces="application/json")
    public UploadDocumentDto getUploadDoc(@PathVariable int uploadDocId)
    {
   	 return uploadService.getUploadDoc(uploadDocId);
    }
    
    @PostMapping(value="/addUploadDocument")
    public String addBookingDetails(@RequestBody()UploadDocumentDto uploadDocument)
    {
   	 for(DocumentDto d : uploadDocument.getDocument())
   		 documentService.addDocument(d);
   	     uploadService.addUploadDocument(uploadDocument);
   	     return "Documents stored";
    }
    @GetMapping(value="/getAllBookingDetails",produces="application/json")
    public List<UploadDocumentDto> getAllUploadDetails()
    {
   	 return uploadService.getAllUploadDetails();
    }
    

	
}
