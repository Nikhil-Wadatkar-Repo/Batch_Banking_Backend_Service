package com.sit.beans;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@javax.persistence.Entity
@Table
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bankId;

	@Column
	private Integer balance;
	@Column
	private String accountNumber;
	@Column
	private String accHolderName;
	@Column
	private String accHolderCity;
	@Column
	private String accHolderPincode;
	@Column
	private Long accHolderContact;
	@Column
	private String accHolderDOB;

	public BankDetails() {
		// TODO Auto-generated constructor stub
	}

	public BankDetails(Integer bankId, String accountNumber, String accHolderName, String accHolderCity,
			String accHolderPincode, Long accHolderContact, String accHolderDOB) {
		super();
		this.bankId = bankId;
		this.accountNumber = accountNumber;
		this.accHolderName = accHolderName;
		this.accHolderCity = accHolderCity;
		this.accHolderPincode = accHolderPincode;
		this.accHolderContact = accHolderContact;
		this.accHolderDOB = accHolderDOB;
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccHolderCity() {
		return accHolderCity;
	}

	public void setAccHolderCity(String accHolderCity) {
		this.accHolderCity = accHolderCity;
	}

	public String getAccHolderPincode() {
		return accHolderPincode;
	}

	public void setAccHolderPincode(String accHolderPincode) {
		this.accHolderPincode = accHolderPincode;
	}

	public Long getAccHolderContact() {
		return accHolderContact;
	}

	public void setAccHolderContact(Long accHolderContact) {
		this.accHolderContact = accHolderContact;
	}

	public String getAccHolderDOB() {
		return accHolderDOB;
	}

	public void setAccHolderDOB(String accHolderDOB) {
		this.accHolderDOB = accHolderDOB;
	}

	@Override
	public String toString() {
		return "BankDetails [accountNumber=" + accountNumber + ", accHolderName=" + accHolderName + ", accHolderCity="
				+ accHolderCity + ", accHolderPincode=" + accHolderPincode + ", accHolderContact=" + accHolderContact
				+ ", accHolderDOB=" + accHolderDOB + "]";
	}

}
