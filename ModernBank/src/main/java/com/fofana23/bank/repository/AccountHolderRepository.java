package com.fofana23.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fofana23.bank.model.AccountHolder;

@Repository

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer> {
	
	public AccountHolder findByEmail(String email);

}
