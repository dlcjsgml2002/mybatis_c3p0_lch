package kr.or.yi.mybatis_c3p0_lch.dao;

import java.util.List;

import kr.or.yi.mybatis_c3p0_lch.dto.Title;

public interface TitleDao {
	List<Title> selectTitleByAll();

	Title selectTitleByCode(Title title);

	int insertTitle(Title title);

	int deleteTitle(int code);

	int updateTitle(Title title);
}
