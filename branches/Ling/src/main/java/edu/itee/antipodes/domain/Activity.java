package edu.itee.antipodes.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * A persistence class that stores info from Activity table
 *
 */

public class Activity implements Serializable{

	private int activityID;
	private String activityName;
	private Set<Tour> tours = new HashSet<Tour>(0);
	

	public Activity(){}
	
	public int getActivityID() {
		return activityID;
	}

	private void setActivityID(int activityID){
		this.activityID=activityID;
	}
	
	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	
	
	
	public Set<Tour> getTours() {
		return tours;
	}

	public void setTours(Set<Tour> tours) {
		this.tours = tours;
	}

@Override
	public String toString() {
		return "Activity [activityID=" + activityID + ", activityName="
				+ activityName + "]";
	}

}
