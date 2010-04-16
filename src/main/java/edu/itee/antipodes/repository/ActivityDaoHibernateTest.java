package edu.itee.antipodes.repository;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.itee.antipodes.domain.Activity;

public class ActivityDaoHibernateTest extends TestCase {
	
	private ApplicationContext ctx = null;
	private Activity activity=null;
	private ActivityDaoHibernate dao =null;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		String[] paths = {"edu/itee/antipodes/repository/antipodes-application-config.xml"};
        ctx = new ClassPathXmlApplicationContext(paths);
        dao = (ActivityDaoHibernate) ctx.getBean("activityDao");		
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
        dao = null;	
	}

//	@Test
//	public void testGetActivity() {
//		assertEquals("Jump", dao.getActivity(0001).getActivityName());
//	}
//
//	@Test
//	public void testGetActivityList() {
//		assertNotNull(dao.getActivityList());
//	}	
//	
//	@Test
//	public void testSaveActivity() {
//		activity = new Activity();
//		activity.setActivityName("Smile");
//		dao.saveActivity(activity);
//		assertEquals("Smile", dao.getActivity(5).getActivityName());
//	}

	@Test
	public void testDropActivity() {
		activity = dao.getActivity(4);
		dao.dropActivity(activity);
		assertNull(dao.getActivity(4));
	}
	@Test
	public void testGetToursByActivityId(){
		assertEquals(1,dao.getToursByActivityId(1).size());
	}

}
