package com.cg.backgroundverification.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="login_table")
public class LoginDto {
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="password")
	private String password;
	@Column(name="role_id")
	private int roleId;
   /* @OneToOne
    UploadDocumentDto uploadDocument;
    */
	public LoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginDto(int empId, String empName, String password, int roleId) {
		//UploadDocumentDto uploadDocument
		this.empId = empId;
		this.empName = empName;
		this.password = password;
		this.roleId = roleId;
		//this.uploadDocument = uploadDocument;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

/*	public UploadDocumentDto getUploadDocument() {
		return uploadDocument;
	}

	public void setUploadDocument(UploadDocumentDto uploadDocument) {
		this.uploadDocument = uploadDocument;
	}
   */ 
	

}
