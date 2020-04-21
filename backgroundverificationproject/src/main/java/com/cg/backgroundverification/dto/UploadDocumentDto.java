package com.cg.backgroundverification.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="upload_document")
public class UploadDocumentDto {
	
	@Id
	@Column(name="upload_doc_id")
	private int uploadDocId;
	@Column(name="status")
    private String status;
	@Column(name="upload_date")
    private String uploadDate;
    @OneToOne
    @JoinColumn(name="source" , referencedColumnName="emp_id")
    LoginDto loginDto;
    @OneToMany(mappedBy="DocumentDto")
    @JoinColumn(name="source" ,referencedColumnName="doc_id")
    private List<DocumentDto> document;
	public UploadDocumentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UploadDocumentDto(int uploadDocId, String status, String uploadDate, List<DocumentDto> document) {
		
		this.uploadDocId = uploadDocId;
		this.status = status;
		this.uploadDate = uploadDate;
		this.document = document;
	}
	public int getUploadDocId() {
		return uploadDocId;
	}
	public void setUploadDocId(int uploadDocId) {
		this.uploadDocId = uploadDocId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
	public List<DocumentDto> getDocument() {
		return document;
	}
	public void setDocument(List<DocumentDto> document) {
		this.document = document;
	}
    

}
