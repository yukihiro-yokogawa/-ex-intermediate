package com.example2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example2.Domein.Hotel;
import com.example2.Repository.HotelRepository;

@Service
@Transactional
public class HotelService {

	@Autowired
	private HotelRepository hotelrepository;
	
	/**
	 * 特定の値段以下のホテルのリストを検索するリポジトリクラスのメソッドを呼び出すメソッドです.
	 * 
	 * @param price ホテルの値段
	 * @return 特定の値段以下のホテルのリスト
	 */
	public List<Hotel> serchByLessThanPrice(Integer price){
		return hotelrepository.searchByLessThanPrice(price);
	}
	
}
