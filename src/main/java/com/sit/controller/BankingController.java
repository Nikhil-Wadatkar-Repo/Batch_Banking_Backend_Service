package com.sit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sit.beans.BankDetails;
import com.sit.beans.TransactionDetails;
import com.sit.service.BankingService;
import com.sit.service.BankingServiceImpl;

@CrossOrigin
@RestController
public class BankingController {
	@Autowired
	private BankingServiceImpl bankingservice;

	@PostMapping("/createBankDetails")
	public BankDetails createBankDetails(@RequestBody BankDetails bankingDetails) {
		return bankingservice.createBankDetails(bankingDetails);
	}

	@PostMapping("/updateBankDetails")
	public BankDetails updateBankDetails(@RequestBody BankDetails bankingDetails) {
		return bankingservice.updateBankDetails(bankingDetails);
	}

	@GetMapping("/getBankDetailsByID/{id}")
	public BankDetails getBankDetailsByID(@PathVariable("id") Integer id) {
		BankDetails findById = bankingservice.getBankDetailsByID(id);
		return findById;
	}

	@GetMapping("/getAllBankDetails")
	public List<BankDetails> getAllBankDetails() {
		return bankingservice.getAllBankDetails();
	}

	@DeleteMapping("/deleteBankDetailsByID/{id}")
	public String deleteBankDetailsByID(Integer appID) {
		return bankingservice.deleteBankDetailsByID(appID);
	}

	@PostMapping("/debitcredit")
	public String debitCredit(@RequestBody TransactionDetails details) {
		return bankingservice.debitOrCredit(details);
	}

	@GetMapping("/getAllTransactions")
	public List<TransactionDetails> getAllTransactions() {
		return bankingservice.getAllTransactions();
	}
}
