package edu.itee.antipodes.repository;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.itee.antipodes.domain.TourDate;

public class TourDateDaoHibernate extends HibernateDaoSupport implements TourDateDao{
	
	public TourDate getTourDateById(int id){
		return (TourDate)getHibernateTemplate().get(TourDate.class, id);
	}
//	public TourDate getTourDateByTourId(int id){
//		return (TourDate)getHibernateTemplate().find("from TourDate T where T.tourID= :id ");
//	}
	
	@Override
	public void dropTourDate(TourDate tourDate) {
		Object record = getHibernateTemplate().load(TourDate.class, tourDate.getDateID());
        getHibernateTemplate().delete(record);
		
	}

	@Override
	public List<TourDate> getTourDateList() {
		return (List<TourDate>)getHibernateTemplate().find("from TourDate");
	}

	@Override
	public void saveTourDate(TourDate tourDate) {
		getHibernateTemplate().saveOrUpdate(tourDate);	
		
	}

}
