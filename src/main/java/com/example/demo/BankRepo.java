package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepo extends JpaRepository<Bank,Integer> {

	//we can still define queires of our own over here 
	}

