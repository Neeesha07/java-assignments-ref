package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Project;
import com.service.ProjectService;

@Controller
@RequestMapping("/mainapp")
public class RestApp {
	//private static List<User> userList=new ArrayList<User>();
	@Autowired
	private ProjectService projectDAO;

	@RequestMapping(value="/register",method=RequestMethod.GET)

	public String registerPageGet() {
		return "register";
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	
	public String loginPageGet() {
		return "login";
	}
//	//@RequestMapping(value="/login",method=RequestMethod.POST)
//	@PostMapping("/login")
//	public String loginPage(@RequestParam("uname")String uname,@RequestParam("pass")String pass) {
//		if(projectDAO.login(uname, pass)) {
//			return "loginSuccess";
//		}
//		return "login";
//	}


}
