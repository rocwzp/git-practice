/**
 * 
 */
package com.sivalabs.simplewebapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sivalabs.simplewebapp.entities.User;
import com.sivalabs.simplewebapp.repositories.UserRepository;

/**
 * @author Siva
 *
 */
@Service
@Transactional
public class UserService 
{
	@Autowired private UserRepository userRepository;
	
	public List<User> findAllUsers() {
		return userRepository.findAllUsers();
	}

	public User login(String userName, String password)
	{
		return userRepository.login(userName, password);
	}
	
}
