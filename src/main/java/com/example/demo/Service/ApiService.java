package com.example.demo.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Sport;
import com.example.demo.Repository.sportRepository;

@Service
public class ApiService {
	
@Autowired
	sportRepository repo;

public String updation(Sport s ) {
	repo.save(s);
	return "updated";
}
public String deletion(int id) {
	repo.deleteById(id);
	return "entry deleted";
}


}
