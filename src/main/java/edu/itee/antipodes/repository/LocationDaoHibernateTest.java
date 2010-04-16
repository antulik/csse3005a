package edu.itee.antipodes.repository;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.itee.antipodes.domain.Location;

public class LocationDaoHibernateTest extends TestCase{
	private ApplicationContext ctx = null;
	private Location location=null;
	private LocationDaoHibernate dao = null;
	@Before
	public void setUp() throws Exception {
		super.setUp();
		String[] paths = {"edu/itee/antipodes/repository/antipodes-application-config.xml"};
        ctx = new ClassPathXmlApplicationContext(paths);
        dao = (LocationDaoHibernate) ctx.getBean("locationDao");		
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
        dao = null;
	}

	@Test
	public void testGetLocation() {
		assertEquals("NewYork", dao.getLocation(3).getLocationName());
	}

	@Test
	public void testDropLocation() {
		location=dao.getLocation(4);
		dao.dropLocation(location);
		assertNull(dao.getLocation(4));
	}

	@Test
	public void testGetLocationList() {
		assertNotNull(dao.getLocationList());
	}

	@Test
	public void testSaveLocation() {
		location= new Location();
		location.setLatitude(23.0000);
		location.setLongitude(124.0903);
		location.setLocationName("HAHA");
		dao.saveLocation(location);
		assertEquals("HAHA", dao.getLocation(4).getLocationName());
		
	}

	@Test
	public void testGetToursByLocationId() {
		assertEquals(1, dao.getLocation(3).getTours().size());
	}

}
