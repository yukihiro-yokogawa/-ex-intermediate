package com.example2.Domein;

/**
 * ホテル情報を受け取るドメインクラスです.
 * 
 * @author yukihiro.yokogawa
 *
 */
public class Hotel {

	/** ホテルID */
	Integer id;
	/** 地域名 */
	String areaName;
	/** ホテル名 */
	String hotelName;
	/** 住所 */
	String address;
	/** 最寄り駅 */
	String nearestStation;
	/** 値段 */
	Integer price;
	/** 駐車場の有無 */
	String parking;

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", areaName=" + areaName + ", hotelName=" + hotelName + ", address=" + address
				+ ", nearestStation=" + nearestStation + ", price=" + price + ", parking=" + parking + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNearestStation() {
		return nearestStation;
	}

	public void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

}
