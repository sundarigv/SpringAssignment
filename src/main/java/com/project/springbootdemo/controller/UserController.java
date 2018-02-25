package com.project.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springbootdemo.model.Users;
import com.project.springbootdemo.repository.UserJpaRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserJpaRepository userJpaRepository;
//	@Autowired 
//	private 
	
	@GetMapping(value = "/all")
    public List<Users> findAll() {
        return userJpaRepository.findAll();
    }
	
	@GetMapping(value = "/avg")
    public float findAvgAge() {
        return userJpaRepository.findAge();
    }
	
	@GetMapping(value = "/{name}")
    public Users findByName(@PathVariable final String name){
        return userJpaRepository.findByEducation(name);
    }
	
	@GetMapping(value = "/id/{id1}")
    public Users findById(@PathVariable final Long id1){
        return userJpaRepository.findByCid(id1);
    }
	
	 @PostMapping(value = "/load")
	    public Users load(@RequestBody final Users users) {
	        userJpaRepository.save(users);
	        return userJpaRepository.findOne(users.getCid());
	        //userJpaRepository.find
	 }
	
}
