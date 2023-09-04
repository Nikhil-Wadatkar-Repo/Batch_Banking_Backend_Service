package com.sit.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sit.beans.BankDetails;
import com.sit.beans.TransactionDetails;
import com.sit.repo.BankingRepo;
import com.sit.repo.transactionDetailsRepo;

@Service
public class BankingServiceImpl implements BankingService {

	@Autowired
	private BankingRepo bankRepo;
	@Autowired
	private transactionDetailsRepo txnRepo;

	public BankDetails createBankDetails(BankDetails bankingDetails) {
		return bankRepo.save(bankingDetails);
	}

	public BankDetails updateBankDetails(BankDetails bankingDetails) {
		BankDetails existedBankDetailsByID = getBankDetailsByID(bankingDetails.getBankId());
		if (null != existedBankDetailsByID) {
			existedBankDetailsByID.setAccHolderCity(bankingDetails.getAccHolderCity());
			existedBankDetailsByID.setAccHolderContact(bankingDetails.getAccHolderContact());
			existedBankDetailsByID.setAccHolderDOB(bankingDetails.getAccHolderDOB());
			existedBankDetailsByID.setAccHolderName(bankingDetails.getAccHolderName());
			existedBankDetailsByID.setAccHolderPincode(bankingDetails.getAccHolderPincode());
			existedBankDetailsByID.setBalance(bankingDetails.getBalance());
			existedBankDetailsByID.setAccountNumber(bankingDetails.getAccountNumber());
		}
		return bankRepo.save(existedBankDetailsByID);
	}

	public BankDetails getBankDetailsByID(Integer id) {
		Optional<BankDetails> findById = bankRepo.findById(id);
		if (findById.isPresent())
			return findById.get();
		else
			return null;
	}

	public List<BankDetails> getAllBankDetails() {
		return bankRepo.findAll();
	}

	public BankDetails getAppointment(Integer id) {
		return bankRepo.findById(id).get();
	}

	public String deleteBankDetailsByID(Integer appID) {
		String message = "";
		Optional<BankDetails> findBankDetailsByAppTime = bankRepo.findById(appID);

		if (findBankDetailsByAppTime.isPresent()) {
			bankRepo.deleteById(findBankDetailsByAppTime.get().getBankId());
			message = "Deleted";
		}
		message = "Not found";
		return message;
	}

	public String debitOrCredit(TransactionDetails transactionDetails) {
		Optional<BankDetails> findByAccountNumber = bankRepo.findByAccountNumber(transactionDetails.getAccountNumber());
		BankDetails bankDetails = null;
		String message = "failed";
		int balance;
		if (findByAccountNumber.isPresent()) {
			bankDetails = findByAccountNumber.get();
			balance = bankDetails.getBalance();
			if (transactionDetails.getTxnType().equalsIgnoreCase("credit")) {
				balance = balance + transactionDetails.getAmount();
			} else {
				balance = balance - transactionDetails.getAmount();
			}
			bankDetails.setBalance(balance);
			transactionDetails.setBalance(balance);
			BankDetails updatedBankDetails = bankRepo.save(bankDetails);
			TransactionDetails updatedTransactionDetails = txnRepo.save(transactionDetails);
			if (updatedBankDetails.getBalance() == balance && updatedTransactionDetails.getBalance() == balance)
				message = "success";
		}
		return message;
	}

	public List<TransactionDetails> getAllTransactions() {
		return txnRepo.findAll();
	}
}
