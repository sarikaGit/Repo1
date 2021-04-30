package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserRepository;
import com.app.pojos.User;
 
@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private   UserRepository userRepository;
	
	public UserServiceImpl() {
	System.out.println("In constr of "+getClass().getName());
}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
		
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public User getUserById(int id) {
		 
		return userRepository.findById(id).get();
	}

}
