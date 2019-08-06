package com.example2.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example2.Domein.BaseballTeam;

/**
 * 野球チームのデータベースを操作するクラスです.
 * 
 * @author yukihiro.yokogawa
 *
 */
@Repository
public class BaseballRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<BaseballTeam> BASEBALLTEAM_ROW_MAPPER = (rs, i) -> {
		BaseballTeam baseballteam = new BaseballTeam();
		baseballteam.setId(rs.getInt("id"));
		baseballteam.setLeagueName(rs.getString("league_name"));
		baseballteam.setTeamName(rs.getString("team_name"));
		baseballteam.setHeadquaters(rs.getString("headquaters"));
		baseballteam.setInauguation(rs.getString("inauguation"));
		baseballteam.setHistory(rs.getString("history"));
		return baseballteam;
	};

	/**
	 * 全件検索のメソッドです.
	 * 
	 * @return チームリスト
	 */
	public List<BaseballTeam> findByAll() {
		String sql = "SELECT league_name FROM teams ORDER BY inauguation";

		List<BaseballTeam> teamList = template.query(sql, BASEBALLTEAM_ROW_MAPPER);

		return teamList;
	}

	/**
	 * 野球チームの詳細情報を一軒検索するメソッドです.
	 * 
	 * @param id 球団id
	 * @return 野球チームの詳細情報
	 */
	public BaseballTeam load(Integer id) {
		String sql = "SELECT league_name,team_name,headquaters,inauguation,history FROM teams WHERE id=:id";

		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);

		BaseballTeam baseballteam = template.queryForObject(sql, param, BASEBALLTEAM_ROW_MAPPER);

		return baseballteam;
	}

}
