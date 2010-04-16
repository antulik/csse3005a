package edu.itee.antipodes.repository;

import java.util.List;
import java.util.Set;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.itee.antipodes.domain.ListedTour;
import edu.itee.antipodes.domain.TourOperator;

public class TourOperatorDaoHibernate extends HibernateDaoSupport implements TourOperatorDao {
	public TourOperator getTourOperator(int id){
		return (TourOperator)getHibernateTemplate().get(TourOperator.class, id);
	}
	
	public void dropTourOperator(TourOperator tourOperator) {
		Object record = getHibernateTemplate().load(TourOperator.class, tourOperator.getOperatorID());
        getHibernateTemplate().delete(record);
    }

	public List<TourOperator> getTourOperatorList() {
		return getHibernateTemplate().find("from TourOperator");
		//.find() returns a list
	}

	public void saveTourOperator(TourOperator tourOperator) {
		getHibernateTemplate().saveOrUpdate(tourOperator);	
	}	
	public Set<ListedTour> getListedToursByOperatorId(int operatorID){
		return ((TourOperator)getHibernateTemplate().get(TourOperator.class, operatorID)).getListedTour();
		
	}
}
