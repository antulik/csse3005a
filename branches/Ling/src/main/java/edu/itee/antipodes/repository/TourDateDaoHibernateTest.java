package edu.itee.antipodes.repository;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import edu.itee.antipodes.domain.TourDate;

public class TourDateDaoHibernateTest extends TestCase {
	private ApplicationContext ctx = null;
	private TourDate tourDate=null;
	private TourDateDaoHibernate dao =null;
	@Before
	public void setUp() throws Exception {
		super.setUp();
       	String[] paths = {"edu/itee/antipodes/repository/antipodes-application-config.xml"};
        ctx = new ClassPathXmlApplicationContext(paths);
        dao = (TourDateDaoHibernate) ctx.getBean("tourDateDao");
	}

	@Test
	public void testGetTourDateById() {
		
		assertEquals(1, dao.getTourDateById(1).getDateID());
	}

	

	@Test
	public void testDropTourDate() {
		tourDate=dao.getTourDateById(8);
		dao.dropTourDate(tourDate);
		assertNull(dao.getTourDateById(8));
		
	}
//
//	@Test
//	public void testGetTourDateList() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSaveTourDate() {
//		fail("Not yet implemented");
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		super.tearDown();
//        dao = null;	
//	}

}
