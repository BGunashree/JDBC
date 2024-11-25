package com.xworkz.bankdb.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_table")
public class BankDTO {

	@Id
	
	private int id;
	private String holdername;
	private String gender;
	private String bankname;
	private String email;
	private String address;
	private long accountno;
	private long accountbalance;
	private String atype;
	private String branch;
	public BankDTO(int id, String holdername, String gender, String bankname, String email, String address,
			long accountno, long accountbalance, String atype, String branch) {
		super();
		this.id = id;
		this.holdername = holdername;
		this.gender = gender;
		this.bankname = bankname;
		this.email = email;
		this.address = address;
		this.accountno = accountno;
		this.accountbalance = accountbalance;
		this.atype = atype;
		this.branch = branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public long getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(long accountbalance) {
		this.accountbalance = accountbalance;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}


