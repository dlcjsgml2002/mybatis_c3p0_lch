package kr.or.yi.mybatis_c3p0_lch;

import org.junit.Assert;
import org.junit.Test;

import kr.or.yi.mybatis_c3p0_lch.dao.TitleDao;
import kr.or.yi.mybatis_c3p0_lch.dao.TitleDaoImpl;
import kr.or.yi.mybatis_c3p0_lch.dto.Title;

public class TitleDaoTest extends AbstractTest {
	private static TitleDao titleDao = new TitleDaoImpl();

	@Test
	public void testInsertTitle() {
		log.debug("testInsertTitle()");
		Title title = new Title();
		title.setCode(5);
		title.setName("인턴");
		int res = titleDao.insertTitle(title);
		Assert.assertEquals(1, res);
	}

}
