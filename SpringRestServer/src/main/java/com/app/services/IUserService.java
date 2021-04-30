package com.app.services;

import java.util.List;

import com.app.pojos.User;

public interface IUserService {

	List<User> getUsers();

	void addUser(User user);

	User getUserById(int id);

}
