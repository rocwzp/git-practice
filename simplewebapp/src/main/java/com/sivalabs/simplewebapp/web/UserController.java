/**
 * 
 */
package com.sivalabs.simplewebapp.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sivalabs.simplewebapp.entities.User;
import com.sivalabs.simplewebapp.services.UserService;

/**
 * @author Siva
 *
 */
@Controller
public class UserController 
{

	@Autowired
	private UserService userService;
	
	@RequestMapping({"/",/welcome"})
	public String welcome(Model model) 
	{
		List<User> users = userService.findAllUsers();
		model.addAttribute("USERS", users);
		return "welcome";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm()
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String doLogin(User user, Model model, HttpServletRequest request)
	{
		User loginUser = userService.login(user.getUserName(), user.getPassword());
		if(loginUser == null)
		{
			model.addAttribute("ERROR_MSG","Login failed. Invalid Credentials.");
			return "login";
		}
		request.getSession().setAttribute("LOGIN_USER", loginUser);
		return "redirect:welcome.htm";
	}
	
	@RequestMapping("/logout")
	public String logout(Model model, HttpServletRequest request)
	{
		request.getSession().invalidate();
		return "redirect:login.htm?logout=success";
	}
}
