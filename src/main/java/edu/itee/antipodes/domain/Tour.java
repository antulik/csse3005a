package edu.itee.antipodes.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;




public class Tour implements Serializable {
	
	private int tourID; 
	private String tourName;
	private String tourDesc;
	private double price;
	private int totalDays;
	/*private Set tourDates;*/
	private Set<Activity> activities=new HashSet<Activity>(0);
	private Set<Location> locations=new HashSet<Location>(0);
	
	
	/*private String currency;
	private boolean ondemand;*/
	
	

	
	//default constructor, instances are initiated by Constructor.newInstance()
	public Tour(){	}
	
	public int getTourID() {
		return tourID;
	}
	
	public void setTourID(int tourID) {
		this.tourID = tourID;
	}
	
	public String getTourName() {
		return tourName;
	}
	
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	
	public String getTourDesc() {
		return tourDesc;
	}
	
	public void setTourDesc(String tourDesc) {
		this.tourDesc = tourDesc;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getTotalDays() {
		return totalDays;
	}
	
	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	/*public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public boolean isOndemand() {
		return ondemand;
	}

	public void setOndemand(boolean ondemand) {
		this.ondemand = ondemand;
	}*/

	

	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}
	

	public Set<Location> getLocations() {
		return locations;
	}

	public void setLocations(Set<Location> locations) {
		this.locations = locations;
	}

	@Override
	public String toString() {
		return "Tour [price=" + price + ", totalDays=" + totalDays
				+ ", tourDesc=" + tourDesc + ", tourID=" + tourID
				+ ", tourName=" + tourName + "]";
	}
	
}
