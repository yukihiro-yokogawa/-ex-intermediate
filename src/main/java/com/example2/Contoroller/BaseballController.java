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
	public String showList(Model model) {
		model.addAttribute("teamlist", baseballservice.showList());
		return "ex-intermediate/teamlist";
	}

	/**
	 * 球団の詳細情報のviewに遷移させるメソッドです.
	 * 
	 * @param id 球団ID
	 * @param model 球団の詳細情報のリクエストパラメータ
	 * @return 球団の詳細情報
	 */
	@RequestMapping("/teamdetail")
	public String showDetail(Integer id, Model model) {
		model.addAttribute("teamdetail", baseballservice.showDetail(id));
		return "ex-intermediate/teamdetail";
	}

}
