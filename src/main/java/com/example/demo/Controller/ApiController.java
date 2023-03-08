package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Sport;
import com.example.demo.Repository.sportRepository;
import com.example.demo.Service.ApiService;

@RestController
@CrossOrigin
public class ApiController {

@Autowired
	ApiService ser;
@Autowired
	sportRepository repo;

@GetMapping("/getall")
	public List<Sport> getall(){
		return repo.findAll();
	}
@GetMapping("/byid/{id}")
	public Optional<Sport>getbyId(@PathVariable int id){
		return repo.findById(id);
	}
@PostMapping("/addnew")
	public String addnew(@RequestBody Sport s) {
		repo.save(s);
		return "New entry added";
	}
@PutMapping("/put")
	public String update(@RequestBody Sport s) {
		return ser.updation(s);
	}
@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return ser.deletion(id);
	}
}
