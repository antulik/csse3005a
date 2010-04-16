package edu.itee.antipodes.domain;
import java.io.Serializable;
import java.util.Date;
/**
 * A persistence class that stores the tours listed from ListedTours table in DB.
 *
 */
public class ListedTour implements Serializable{
	private int listID;
//	private int tourID;
//	private int operatorID; NO NEED, because of operator below.
	private Date listedFrom;
	private Date listedUntil;
	private TourOperator operator;
	private Tour tour;
	
	public ListedTour(){}
	
	public int getListID() {
		return listID;
	}
	public void setListID(int listID){
		this.listID=listID;
	}
//	public int getTourID() {
//		return tourID;
//	}
//	public void setTourID(int tourID){
//		this.tourID=tourID;
//	}

	
//	public int getOperatorID() {
//		return operatorID;
//	}
//	public void setOperatorID(int operatorID) {
//		this.operatorID = operatorID;
//	}
	public Date getListedFrom() {
		return listedFrom;
	}
	public void setListedFrom(Date listedFrom) {
		this.listedFrom = listedFrom;
	}
	public Date getListedUntil() {
		return listedUntil;
	}
	public void setListedUntil(Date listedUntil) {
		this.listedUntil = listedUntil;
	}
	
	public TourOperator getOperator() {
		return operator;
	}

	public void setOperator(TourOperator operator) {
		this.operator = operator;
	}
	

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	@Override
	public String toString() {
		return "ListedTour [listID=" + listID + ", listedFrom=" + listedFrom
				+ ", listedUntil=" + listedUntil + ", operatorID=" + operator.getOperatorID()
				+ ", tourID=" + tour.getTourID() + "]";
	}

	
	
}