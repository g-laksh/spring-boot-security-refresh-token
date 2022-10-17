package com.javainuse.springbootsecurity.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@RequestMapping("/hellouser")
	public String getUser()
	{
		return "Hello User";
	}

	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	public String getAdmin()
	{
		return "Congratulations ";
	}

}