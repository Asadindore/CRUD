package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.User;
import com.hcl.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userservice;
	@RequestMapping(value="/")
	public String home()
	{
		return "index";
	}
	

	@RequestMapping(value="/register", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute User user)
	{
		userservice.register(user);
		return new ModelAndView("home");
	}
}
