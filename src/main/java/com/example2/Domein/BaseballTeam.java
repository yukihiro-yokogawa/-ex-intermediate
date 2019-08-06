package com.example2.Domein;

/**
 * 球団情報を受け取るドメインクラスです.
 * 
 * @author yukihiro.yokogawa
 *
 */
public class BaseballTeam {

	/**	球団ID */
	Integer id;
	/**	リーグ名 */
	String leagueName;
	/** チーム名 */
	String teamName;
	/** 本拠地 */
	String headquarters;
	/**	球団設立日 */
	String inauguration;
	/**	歴史 */
	String history;

	@Override
	public String toString() {
		return "BaseballTeam [id=" + id + ", leagueName=" + leagueName + ", teamName=" + teamName + ", headquaters="
				+ headquarters + ", inauguation=" + inauguration + ", history=" + history + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquaters) {
		this.headquarters = headquaters;
	}

	public String getInauguration() {
		return inauguration;
	}

	public void setInauguration(String inauguation) {
		this.inauguration = inauguation;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

}
