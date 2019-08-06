package com.example2.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example2.Domein.BaseballTeam;

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

	public List<BaseballTeam> findByAll() {
		String sql = "SELECT league_name,team_name,headquaters,inauguation,history FROM teams WHERE id=:id ORDER BY inauguation";
		
		List<BaseballTeam> teamList = template.query(sql, BASEBALLTEAM_ROW_MAPPER);
		
		return teamList;
	}

}
