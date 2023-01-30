package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoeDAO {

	@Autowired
ShoeRepo repo;
	
	public Shoe insert(Shoe s) {
		return repo.save(s);
	}
	public List<Shoe> getall()
	{
		return repo.findAll();
	}
	public Shoe edit(Shoe s) {
		// TODO Auto-generated method stub
		
			Shoe ss=repo.findById(s.getShoeid()).orElse(null);
			ss.setShoeid(s.getShoeid());
			ss.setShoename(s.getShoename());
		return	repo.save(ss);
			
		}


	
	public String delete(Shoe e) {
		repo.delete(e);
		return "deleted";
	}
	
}
