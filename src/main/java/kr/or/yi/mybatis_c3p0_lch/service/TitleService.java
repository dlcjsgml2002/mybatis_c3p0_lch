package kr.or.yi.mybatis_c3p0_lch.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_c3p0_lch.dao.TitleDao;
import kr.or.yi.mybatis_c3p0_lch.dto.Title;
import kr.or.yi.mybatis_c3p0_lch.jdbc.MyBatisSqlSessionFactory;

public class TitleService implements TitleDao {
	private String namespace = "kr.or.yi.mybatis_c3p0_lch.dao.TitleDao";
	private static final Log log = LogFactory.getLog(TitleService.class);

	@Override
	public List<Title> selectTitleByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Title selectTitleByCode(Title title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertTitle(Title title) {
		log.debug("insertTitle()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.insert(namespace + ".insertTitle", title);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int deleteTitle(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

}
