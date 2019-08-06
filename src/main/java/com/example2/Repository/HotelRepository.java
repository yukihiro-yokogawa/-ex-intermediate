package com.example2.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example2.Domein.Hotel;

/**
 * ホテルの詳細情報をもつデータベースを操作するメソッドです.
 * 
 * @author yukihiro.yokogawa
 *
 */
@Repository
public class HotelRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<Hotel> HOTEL_ROW_MAPPER = (rs, i) -> {
		Hotel hotel = new Hotel();
		hotel.setId(rs.getInt("id"));
		hotel.setAreaName(rs.getString("area_name"));
		hotel.setHotelName(rs.getString("hotel_name"));
		hotel.setAddress(rs.getString("address"));
		hotel.setNearestStation(rs.getString("nearest_station"));
		hotel.setPrice(rs.getInt("price"));
		hotel.setParking(rs.getString("parking"));

		return hotel;
	};

	/**
	 * 特定の値段以下のホテルのリストを返すメソッドです. 値段に何も入力されていない場合は全てのホテル情報を返します.
	 * 
	 * @param price ホテルの値段
	 * @return 特定の値段以下のホテルのリスト
	 */
	public List<Hotel> searchByLessThanPrice(Integer price) {

		if (price == null) {

			String sql = "SELECT id,area_name,hotel_name,address,nearest_station,price,parking FROM hotels";

			List<Hotel> hotel = template.query(sql, HOTEL_ROW_MAPPER);

			return hotel;
			
		} else {

			String sql = "SELECT id,area_name,hotel_name,address,nearest_station,price,parking FROM hotels WHERE price <=:price";

			SqlParameterSource param = new MapSqlParameterSource().addValue("price", price);

			List<Hotel> hotel = template.query(sql, param, HOTEL_ROW_MAPPER);

			return hotel;

		}
	}
}
