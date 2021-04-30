package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.User;
import com.app.services.IUserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class UserController {

	@Autowired
	IUserService userService;
	
	public UserController()
	{
		System.out.println("In constr of "+getClass().getName());
	}
    
    

    @GetMapping 
    public List<User> getUsers() {
        return  userService.getUsers();
    }

    @PostMapping
    void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
}