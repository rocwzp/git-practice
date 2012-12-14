package com.sivalabs.simplewebapp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sivalabs.simplewebapp.entities.User;

/**
 * @author Siva
 *
 */
//@Component
public class LoginInterceptor extends HandlerInterceptorAdapter
{
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception
	{
		String uri = request.getRequestURI();
		if (!uri.endsWith("login.htm") && !uri.endsWith("logout.htm"))
		{
			User userData = (User) request.getSession().getAttribute("LOGIN_USER");
			if (userData == null)
			{
				response.sendRedirect("login.htm");
				return false;
			}
		}
		return true;
	}
}
