package edu.itee.antipodes.repository;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.itee.antipodes.domain.ListedTour;
import edu.itee.antipodes.domain.TourOperator;

public class ListedTourDaoHibernateTest extends TestCase{
	private ApplicationContext ctx = null;
	private ListedTour list=null;
	private ListedTourDaoHibernate dao=null;
	private TourOperatorDaoHibernate dao1=null;
	@Before
	public void setUp() throws Exception {
		String[] paths = {"edu/itee/antipodes/repository/antipodes-application-config.xml"};
        ctx = new ClassPathXmlApplicationContext(paths);
        dao1=(TourOperatorDaoHibernate)ctx.getBean("tourOperatorDao");
        dao=(ListedTourDaoHibernate)ctx.getBean("listedTourDao");
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
        dao = null;	
        dao1 = null;
	}

//	@Test
//	public void testGetListedTour() {
//		assertEquals(2,dao.getListedTour(2).getTourID());
//	}
//
//	@Test
//	public void testDropListedTour() {
//		list= dao.getListedTour(8);
//		dao.dropListedTour(list);
//		assertNull(dao.getListedTour(8));
//		
//	}
//
//	@Test
//	public void testGetListedTourList() {
//		assertNotNull(dao.getListedTourList());
//	}

//	@Test
//	public void testSaveListedTour() {
//		list=new ListedTour();
//		TourOperator operator = dao1.getTourOperator(8);
//		list.setOperator(operator);
//		list.setTourID(17);
//		dao.saveListedTour(list);
//		assertEquals(17, dao.getListedTour(list.getListID()).getTourID());
//	}
	@Test
	public void testGetTourOperatorByListedTourId(){
		assertEquals(5,dao.getTourOperatorByListedTourId(7).getOperatorID());
	}	
	@Test
	public void testGetTourByListedTourId(){
		assertEquals(8, dao.getTourByListedTourId(8).getTourID());
	}

}
