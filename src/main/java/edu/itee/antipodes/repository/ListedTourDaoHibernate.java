package edu.itee.antipodes.repository;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.itee.antipodes.domain.ListedTour;
import edu.itee.antipodes.domain.Tour;
import edu.itee.antipodes.domain.TourOperator;

public class ListedTourDaoHibernate extends HibernateDaoSupport implements ListedTourDao {

	public ListedTour getListedTour(int id){
		return (ListedTour)getHibernateTemplate().get(ListedTour.class, id);
	}
	
	public void dropListedTour(ListedTour listedTour) {
		Object record = getHibernateTemplate().load(ListedTour.class, listedTour.getListID());
        getHibernateTemplate().delete(record);
    }

	public List<ListedTour> getListedTourList() {
		return (List<ListedTour>)getHibernateTemplate().find("from ListedTour");
		//.find() returns a list
	}

	public void saveListedTour(ListedTour listedTour) {
		getHibernateTemplate().saveOrUpdate(listedTour);	
	}			
	public TourOperator getTourOperatorByListedTourId(int id){
		return ((ListedTour)getHibernateTemplate().get(ListedTour.class, id)).getOperator();
	}
	public Tour getTourByListedTourId(int id){
		return ((ListedTour)getHibernateTemplate().get(ListedTour.class, id)).getTour();
	}
}
