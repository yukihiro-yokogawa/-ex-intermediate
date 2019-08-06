package com.example2.Contoroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example2.Service.HotelService;

/**
 * ホテルの情報に関するドメインを操作するコントローラクラスです.
 * 
 * @author yukihiro.yokogawa
 *
 */
@Controller
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	public HotelService hotelservice;

	@Autowired
	public HttpSession session;

	/**
	 * 検索画面に遷移するメソッドです.
	 * 
	 * @return 検索画面
	 */
	@RequestMapping("")
	public String hotel() {
		return "ex-intermediate/hotel";
	}

	/**
	 * ホテルのリストを表示させる画面に遷移するメソッドです.
	 * 
	 * @param price 検索したい値段
	 * @param redirectAttributes フラッシュスコープ
	 * @return 検索完了画面に遷移
	 */
	@RequestMapping("/search")
	public String hotelSearch(Integer price,RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("hotel",hotelservice.serchByLessThanPrice(price));
		return "redirect:/hotel";
	}

}
