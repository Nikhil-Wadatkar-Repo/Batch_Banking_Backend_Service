package com.sit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sit.beans.TransactionDetails;

@Repository
public interface transactionDetailsRepo extends JpaRepository<TransactionDetails, Integer> {

}
