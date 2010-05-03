package edu.itee.antipodes.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.itee.antipodes.domain.UniversalBean;
import edu.itee.antipodes.domain.db.Activity;
import edu.itee.antipodes.domain.db.Location;
import edu.itee.antipodes.domain.db.Tour;
import edu.itee.antipodes.domain.db.TourOperator;
import edu.itee.antipodes.repository.ActivityDao;
import edu.itee.antipodes.repository.DaoManager;
import edu.itee.antipodes.repository.LocationDao;
import edu.itee.antipodes.repository.ReportingDaoHibernate;
import edu.itee.antipodes.repository.TourOperatorDao;

public class SimpleReportingManager implements ReportingManager {

	private TourOperatorDao toDao = DaoManager.getTourOperatorDao();

	@Override
	public Map<String, Object> getBillingTourOperators(int tourOperatorID,
			Date startDate, Date endDate) {

		Map<String, Object> model = new HashMap<String, Object>();

		List<UniversalBean> list = new ArrayList<UniversalBean>();
		UniversalBean bean;

		bean = new UniversalBean();
		bean.setS1("July 2009");
		bean.setS2("Tour 1");
		bean.setI1(1);
		bean.setI2(20);
		list.add(bean);

		bean = new UniversalBean();
		bean.setS1("July 2009");
		bean.setS2("Tour 2");
		bean.setI1(2);
		bean.setI2(30);
		list.add(bean);

		bean = new UniversalBean();
		bean.setS1("August 2009");
		bean.setS2("Tour 3");
		bean.setI1(3);
		bean.setI2(20);
		list.add(bean);

		model.put("ReportTitle", "Billing tour operators report");
		model.put("ReportPeriod", "July 2009 - August 2009");
		model.put("CustomerName", getCustomerNameByID(1));
		model.put("dataSource", list);

		return model;
	}

	@Override
	public Map<String, Object> getDetectingAbuse(int numberOfCriterias) {
		UniversalBean ub;
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("ReportTitle", "Detecting abuse report");

		ReportingDaoHibernate rdh = DaoManager.getReporingDao();

		numberOfCriterias++;
		List<UniversalBean> list = new ArrayList<UniversalBean>();
		List<Object[]> tl = rdh
				.getSumOfActivitiesAndLocationsForToursByMinNum(numberOfCriterias);

		for (Object[] objects : tl) {
			ub = new UniversalBean();
			Tour tour = (Tour) objects[0];
			ub.setS1(tour.getTourID() + "");
			ub.setS2(tour.getTourName());
			ub.setS3(objects[1].toString());
			list.add(ub);
		}

		/*
		 * for (int i = 0; i < 10; i++) { ub = new UniversalBean();
		 * ub.setS1(String.format("{0}", i)); ub.setS2("Tour " + (int)
		 * (Math.random() * 100)); ub.setS3(" " + (int) (20 * Math.random()));
		 * list.add(ub); }
		 */
		model.put("dataSource", list);
		return model;
	}

	@Override
	public Map<String, Object> getMonitoringSearchCriteriaUtilisation(
			String criteria) {
		Map<String, Object> model = new HashMap<String, Object>();

		ReportingDaoHibernate rdh = DaoManager.getReporingDao();
		List<Object[]> locationList = new ArrayList<Object[]>();
		List<Object[]> activityList = new ArrayList<Object[]>();
		String prefix = "";
		int objectID;
		if (criteria.equals("all")) {
			activityList = rdh.getNumToursAsscWithActivity();
			locationList = rdh.getNumToursAsscWithLocation();
		} else {
			prefix = criteria.substring(0, 1);
			objectID = Integer.parseInt(criteria.substring(1));

			if (prefix.equalsIgnoreCase("a")) {
				activityList = rdh
						.getNumToursAsscWithActivityByActivityID(objectID);
			} else if (prefix.equalsIgnoreCase("l")) {
				locationList = rdh
						.getNumToursAsscWithLocationByLocationID(objectID);
			}
		}

		model.put("ReportTitle",
				"Monitoring search criteria utilisation report ");

		List<UniversalBean> result = new ArrayList<UniversalBean>();
		UniversalBean bean;

		for (Object[] objects : activityList) {
			bean = new UniversalBean();
			Activity ac = (Activity)objects[0];
			bean.setS1(ac.getActivityName());
			bean.setS2(objects[1].toString());
			result.add(bean);
		}
		
		for (Object[] objects : locationList) {
			bean = new UniversalBean();
			Location loc = (Location)objects[0];
			bean.setS1(loc.getLocationName());
			bean.setS2(objects[1].toString());
			result.add(bean);
		}
		
		model.put("dataSource", result);
		return model;
	}

	@Override
	public Map<String, Object> getMonitoringSystemUtilisation(Date startDate,
			Date endDate) {
		Map<String, Object> model = new HashMap<String, Object>();
		return model;
	}

	private String getCustomerNameByID(int customerID) {
		return "Hilsbrat hotel company association inc.(R)";
	}

	@Override
	public List<UniversalBean> getCriterias() {

		LocationDao ld = DaoManager.getLocationDao();
		List<Location> ll = ld.getLocationList();

		ActivityDao ad = DaoManager.getActivityDao();
		List<Activity> al = ad.getActivityList();

		List<UniversalBean> list = new ArrayList<UniversalBean>();
		UniversalBean ub;

		for (Location location : ll) {
			ub = new UniversalBean();
			ub.setS1("l" + location.getLocationID());
			ub.setS2(location.getLocationName());
			list.add(ub);
		}

		for (Activity activity : al) {
			ub = new UniversalBean();
			ub.setS1("a" + activity.getActivityID());
			ub.setS2(activity.getActivityName());
			list.add(ub);
		}

		return list;
	}

	@Override
	public List<TourOperator> getTourOperators() {
		return toDao.getTourOperatorList();
	}

}
