package cn.o.publicer.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import cn.o.publicer.service.*;
import cn.o.publicer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class indexa {
	/*@Autowired*/
	private UserService userService;
	@Autowired
	public void setMuserService(UserService muserService) {
		this.userService = muserService;
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String indexl(){
		return "index";
	}
	
	@RequestMapping(value="/allUser",method=RequestMethod.GET)
	public String getAllUser(HttpServletRequest request){
		List<User> UserAll = userService.findAll();
	
		request.setAttribute("userList", UserAll);
		return "Userlist";
		
	}
}
