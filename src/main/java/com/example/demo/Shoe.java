package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Shoe {
@Id	
	private int shoeid;
	private String shoename;
	private float shoeprice;
	

}
