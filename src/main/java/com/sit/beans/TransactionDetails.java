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
public class TransactionDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer txnID;
	@Column
	private Integer amount;
	@Column
	private String txnType;
	@Column
	private String accountNumber;
	@Column
	private Integer balance;

	public TransactionDetails() {
		// TODO Auto-generated constructor stub
	}

	public TransactionDetails(Integer txnID, Integer amount, String txnType, Integer balance) {
		super();
		this.txnID = txnID;
		this.amount = amount;
		this.txnType = txnType;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Integer getTxnID() {
		return txnID;
	}

	public void setTxnID(Integer txnID) {
		this.txnID = txnID;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "TransactionDetails [txnID=" + txnID + ", amount=" + amount + ", txnType=" + txnType + ", balance="
				+ balance + "]";
	}

}
