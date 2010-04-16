/**
 * 
 */
package edu.itee.antipodes.repository;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.itee.antipodes.domain.Tour;

/**
 * @author s4193152
 *
 */
public class TourDaoHibernateTest extends TestCase{
	private ApplicationContext ctx = null;
	private Tour tour=null;
	private TourDaoHibernate dao =null;
	/**
	 * @throws java.lang.Exception
	 */
	
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
       	String[] paths = {"edu/itee/antipodes/repository/antipodes-application-config.xml"};
        ctx = new ClassPathXmlApplicationContext(paths);
        dao = (TourDaoHibernate) ctx.getBean("tourDao");

	}

	/**
	 * Test method for {@link edu.itee.antipodes.repository.TourDaoHibernate#getTour(int)}.
	 */
	@Test
	public void testGetTour() {
		assertEquals(1099.95, dao.getTourByID(15).getPrice());
	}

	/**
	 * Test method for {@link edu.itee.antipodes.repository.TourDaoHibernate#dropTour(edu.itee.antipodes.domain.Tour)}.
	 */
	@Test
	public void testDropTour() {
		tour = dao.getTourByID(16);
		dao.dropTour(tour);
		assertNull(dao.getTourByID(16));
	}

	/**
	 * Test method for {@link edu.itee.antipodes.repository.TourDaoHibernate#saveTour(edu.itee.antipodes.domain.Tour)}.
	 * addTour(tour) has the same implementation as saveTour(tour), so only the later is tested here.
	 */
	@Test
	public void testSaveTour() {
		tour = new Tour();
		tour.setPrice(555);
		tour.setTotalDays(5);
		tour.setTourDesc("fun");
		tour.setTourName("London Holiday");
		dao.saveTour(tour);
		assertEquals(18, dao.getTourByID(tour.getTourID()).getTourID());
	
	}

	/**
	 * Test method for {@link edu.itee.antipodes.repository.TourDaoHibernate#getTourList()}.
	 */
	@Test
	public void testGetTourList() {
		assertNotNull(dao.getTourList());
	}

	@Test
	public void testGetActivitiesByTourId(){
		assertEquals(1,dao.getActivitiesByTourId(1).size());
	}
	@Test
	public void testGetLocationsByTourId(){
		assertEquals(1,dao.getActivitiesByTourId(2).size());
	}
	
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		super.tearDown();
        dao = null;
	}

}
