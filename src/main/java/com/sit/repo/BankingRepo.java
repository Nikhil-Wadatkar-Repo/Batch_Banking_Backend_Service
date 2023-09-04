package com.sit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sit.beans.BankDetails;

@Repository
public interface BankingRepo extends JpaRepository<BankDetails, Integer> {
	Optional<BankDetails> findByAccountNumber(String accNumber);

}
