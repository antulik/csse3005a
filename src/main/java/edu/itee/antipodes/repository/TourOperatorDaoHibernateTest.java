package edu.itee.antipodes.repository;

import static org.junit.Assert.*;

import java.sql.Date;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.itee.antipodes.domain.AccountUser;
import edu.itee.antipodes.domain.TourOperator;

public class TourOperatorDaoHibernateTest extends TestCase{
	private ApplicationContext ctx = null;
	private TourOperator operator=null;
	private TourOperatorDaoHibernate dao=null;
	private AccountUserDaoHibernate dao1=null;
	@Before
	public void setUp() throws Exception {
		super.setUp();
		String[] paths = {"edu/itee/antipodes/repository/antipodes-application-config.xml"};
        ctx = new ClassPathXmlApplicationContext(paths);
        dao=(TourOperatorDaoHibernate)ctx.getBean("tourOperatorDao");
        dao1=(AccountUserDaoHibernate)ctx.getBean("accountUserDao");
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
        dao = null;	
	}

	@Test
	public void testGetTourOperator() {
		assertEquals("operator0003@company3.com", dao.getTourOperator(3).getEmail());
	}

	@Test
	public void testDropTourOperator() {
		operator=dao.getTourOperator(8);
		dao.dropTourOperator(operator);
		assertNull(dao.getTourOperator(8));
	}

	@Test
	public void testGetTourOperatorList() {
		assertNotNull(dao.getTourOperatorList());
	}

	@Test
	public void testSaveTourOperator() {
		operator=new TourOperator();
		operator.setEmail("operator0009@company9.com");
		operator.setCompanyInfo("company9");
//		operator.setMembershipExpired(Date.valueOf("20100512"));
		AccountUser user= dao1.getUserById(2);
		operator.setUser(user);
		dao.saveTourOperator(operator);
		assertNotNull(dao.getTourOperator(2));
		assertEquals(2, dao.getTourOperator(2).getUser().getUserID());
	
	}
	@Test
	public void testGetListedToursByOperatorId(){
		assertEquals(3,dao.getListedToursByOperatorId(5).size());
	}
}
