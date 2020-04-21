package com.cg.backgroundverification.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="document_table")
public class DocumentDto {
	
	@Id
	@Column(name="doc_id")
	private int docId;
	@Column(name="doc_type")
	private String docType;
	@Column(name="doc_issuse_authority")
	private String docIssuseAuthority;
	@Column(name="doc_issuse_date")
	private String docIssuseDate;
	@Column(name="file_location")
	private String fileLocation;
	public DocumentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentDto(int docId, String docType, String docIssuseAuthority, String docIssuseDate,
			String fileLocation) {
		super();
		this.docId = docId;
		this.docType = docType;
		this.docIssuseAuthority = docIssuseAuthority;
		this.docIssuseDate = docIssuseDate;
		this.fileLocation = fileLocation;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getDocIssuseAuthority() {
		return docIssuseAuthority;
	}
	public void setDocIssuseAuthority(String docIssuseAuthority) {
		this.docIssuseAuthority = docIssuseAuthority;
	}
	public String getDocIssuseDate() {
		return docIssuseDate;
	}
	public void setDocIssuseDate(String docIssuseDate) {
		this.docIssuseDate = docIssuseDate;
	}
	public String getFileLocation() {
		return fileLocation;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	
	

}
