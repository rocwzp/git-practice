/**
 * 
 */
package com.sivalabs.simplewebapp.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sivalabs.simplewebapp.entities.User;

/**
 * @author Siva
 *
 */
@Repository
public class UserRepository 
{

	private static final Map<Integer, User> MOCK_USER_TABLE = new HashMap<Integer, User>();
	
	static
	{
		User admin = new User();
		admin.setUserId(1);
		admin.setUserName("admin");
		admin.setPassword("admin");
		admin.setFullName("Administrator");
		admin.setEmail("admin@gmail.com");
		
		User siva = new User();
		siva.setUserId(2);
		siva.setUserName("siva");
		siva.setPassword("siva");
		siva.setFullName("SivaPrasad");
		siva.setEmail("siva@gmail.com");
		
		MOCK_USER_TABLE.put(admin.getUserId(), admin);
		MOCK_USER_TABLE.put(siva.getUserId(), siva);
		
		
	}
	public User findUserById(Integer userId) {
		User user = null;
		user = MOCK_USER_TABLE.get(userId);
		return user;
	}

	public List<User> findAllUsers() {
		return new ArrayList<User>(MOCK_USER_TABLE.values()); 
	}

	public User login(String userName, String password)
	{
		List<User> users = findAllUsers();
		for (User user : users)
		{
			if(userName.equals(user.getUserName()) && password.equals(user.getPassword()))
			{
				return user;
			}
		}
		return null;
	}
}
