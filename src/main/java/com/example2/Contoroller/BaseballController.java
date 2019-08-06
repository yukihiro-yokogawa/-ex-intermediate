package com.example2.Contoroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example2.Service.BaseballService;

@Controller
@RequestMapping("/")
public class BaseballController {

	@Autowired
	public BaseballService baseballservice;
	
	@RequestMapping("/teamlist")
	public String teamlist(Model model) {
		model.addAttribute("teamlist",baseballservice.findByAll());
		return "teamlist";
	}
	
}
