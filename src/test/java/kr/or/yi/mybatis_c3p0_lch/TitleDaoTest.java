package kr.or.yi.mybatis_c3p0_lch;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.mybatis_c3p0_lch.dao.TitleDao;
import kr.or.yi.mybatis_c3p0_lch.dao.TitleDaoImpl;
import kr.or.yi.mybatis_c3p0_lch.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TitleDaoTest extends AbstractTest {
	private static TitleDao titleDao = new TitleDaoImpl();

	@Test
	public void test01InsertTitle() {
		log.debug("test01InsertTitle()");
		Title title = new Title();
		title.setCode(5);
		title.setName("인턴");
		int res = titleDao.insertTitle(title);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test02selectTitleByAll() {
		log.debug("test02selectTitleByAll()");
		List<Title> titleList = titleDao.selectTitleByAll();
		Assert.assertNotNull(titleList);
	}

	@Test
	public void test03SelectTitleByCode() {
		log.debug("test03SelectTitleByCode()");
		Title title = new Title();
		title.setCode(5);
		Title searchTitle = titleDao.selectTitleByCode(title);
		log.debug("searchTitle : " + searchTitle);
		Assert.assertNotNull(searchTitle);
	}

	@Test
	public void test04UpdateTitle() {
		log.debug("test04UpdateTitle()");
		Title title = new Title();
		title.setCode(5);
		title.setName("무기계약직");
		int res = titleDao.updateTitle(title);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test05DeleteTitle() {
		log.debug("test05DeleteTitle()");
		int res = titleDao.deleteTitle(5);
		Assert.assertEquals(1, res);
	}
}
