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
	String headquaters;
	/**	球団設立日 */
	String inauguation;
	/**	歴史 */
	String history;

	@Override
	public String toString() {
		return "BaseballTeam [id=" + id + ", leagueName=" + leagueName + ", teamName=" + teamName + ", headquaters="
				+ headquaters + ", inauguation=" + inauguation + ", history=" + history + "]";
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

	public String getHeadquaters() {
		return headquaters;
	}

	public void setHeadquaters(String headquaters) {
		this.headquaters = headquaters;
	}

	public String getInauguation() {
		return inauguation;
	}

	public void setInauguation(String inauguation) {
		this.inauguation = inauguation;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

}
