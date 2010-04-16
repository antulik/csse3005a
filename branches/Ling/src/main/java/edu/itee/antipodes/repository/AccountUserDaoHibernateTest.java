package edu.itee.antipodes.repository;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.itee.antipodes.domain.AccountUser;

public class AccountUserDaoHibernateTest extends TestCase {

	private ApplicationContext ctx = null;
	private AccountUser accountUser1=null;
	private AccountUser accountUser2=null;
	private AccountUserDaoHibernate dao =null;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		String[] paths = {"edu/itee/antipodes/repository/antipodes-application-config.xml"};
        ctx = new ClassPathXmlApplicationContext(paths);
        dao = (AccountUserDaoHibernate) ctx.getBean("accountUserDao");			
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
        dao = null;	
	}

	@Test
	public void testGetUser() {
		assertEquals("user1", dao.getUserById(0001).getUserName());
	}

	@Test
	public void testDropAccountUser() {
		accountUser1=dao.getUserById(3);
		dao.dropAccountUser(accountUser1);
		assertNull(dao.getUserById(3));
		
	}

	@Test
	public void testGetAccountUserList() {
		assertNotNull(dao.getAccountUserList());
	}

	@Test
	public void testSaveAccountUser() {
		accountUser2=new AccountUser();
		accountUser2.setUserName("user9");
		accountUser2.setPassword("77777777");
		accountUser2.setUserType("operator");
		dao.saveAccountUser(accountUser2);
		assertEquals(9, dao.getUserById(9).getUserID());
	}

}
