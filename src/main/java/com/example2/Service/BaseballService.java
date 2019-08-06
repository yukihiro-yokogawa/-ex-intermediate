package com.example2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example2.Domein.BaseballTeam;
import com.example2.Repository.BaseballRepository;

/**
 * リポジトリクラスを操作するクラスです.
 * 
 * @author yukihiro.yokogawa
 *
 */
@Service
@Transactional
public class BaseballService {

	@Autowired
	public BaseballRepository repository;
	
	/**
	 * リポジトリクラスの全件検索メソッドを呼び出し、返すクラスです.
	 * 
	 * @return チームリスト
	 */
	public List<BaseballTeam> showList() {
		return repository.showList();
	}
	
	/**
	 * リポジトリクラスの詳細検索のメソッドを呼び出し、返すクラスです.
	 * 
	 * @param id 球団ID
	 * @return チームの詳細情報
	 */
	public BaseballTeam showDetail(Integer id) {
		return repository.showDetail(id);
	}
	
}
