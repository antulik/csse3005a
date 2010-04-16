package edu.itee.antipodes.repository;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.itee.antipodes.domain.Tour;

public class HibernateSearchTest extends TestCase{
	private ApplicationContext ctx = null;
	private HibernateSearch dao =null;
	@Before
	public void setUp() throws Exception {
		super.setUp();
        String[] paths = {"edu/itee/antipodes/repository/antipodes-application-config.xml"};
        ctx = new ClassPathXmlApplicationContext(paths);
        dao = (HibernateSearch) ctx.getBean("HibernateDao");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAccountUserByTourOperatorID() {
		fail("Not yet implemented");
	}

}
