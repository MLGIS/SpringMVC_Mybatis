package cn.o.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class index {

	
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String indexl(){
		return "index";
	}
}
