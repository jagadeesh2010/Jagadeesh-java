package com.test.controller;

import org.springframework.stereotype.Controller;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController 
{
	@GeetMapping("/userform")
	public String userLOginForm()
	{
		return "loginpage";
	}
	@GetMApping ("submit")
	{
		public String userSubitForm(HttpServletRequest request,User 
			
		}
	}

}
