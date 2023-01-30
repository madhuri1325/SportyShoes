package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoeRepo extends JpaRepository<Shoe,Integer> {

	//we can still define queires of our own over here 
	}


