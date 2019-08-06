package com.example2.Contoroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example2.Service.BaseballService;

/**
 * 球団情報に関するドメインを操作するコントローラークラスです.
 * 
 * @author yukihiro.yokogawa
 *
 */
@Controller
@RequestMapping("/teamlist")
public class BaseballController {

	@Autowired
	public BaseballService baseballservice;
	
	/**
	 * チームリストのviewに遷移させるメソッドです.
	 * 
	 * @param model
	 * @return チームリスト
	 */
	@RequestMapping("")
	public String teamlist(Model model) {
		model.addAttribute("teamlist",baseballservice.findByAll());
		return "ex-intermediate/teamlist";
	}
	
}
