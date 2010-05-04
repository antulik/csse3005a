package edu.itee.antipodes.repository;

//import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import edu.itee.antipodes.domain.Activity;
//import edu.itee.antipodes.domain.ListedTour;
import edu.itee.antipodes.domain.Tour;
//import edu.itee.antipodes.domain.TourOperator;

public class ActivityDaoHibernate extends HibernateDaoSupport implements ActivityDao {
	
	@SuppressWarnings("unchecked")
	public List<Activity> getActivityList() {
		return getHibernateTemplate().find("from Activity");
		//.find() returns a list
	}

	public Activity getActivityByID(int id){
		return (Activity)getHibernateTemplate().get(Activity.class, id);
	}
	public void addActivity(Activity activity) {
		getHibernateTemplate().save(activity);
	}
	public void saveActivity(Activity activity) {
		getHibernateTemplate().saveOrUpdate(activity);	
	}	

	public void dropActivity(Activity activity) {
		Object record = getHibernateTemplate().load(Activity.class, activity.getActivityID());
        getHibernateTemplate().delete(record);
    }
	public Set<Tour> getToursByActivityID(int activityID){
		return ((Activity)getHibernateTemplate().get(Activity.class, activityID)).getTours();
	}
	
}
