package edu.itee.antipodes.repository;

import java.util.List;

import edu.itee.antipodes.domain.TourDate;

public interface TourDateDao {

	public List<TourDate> getTourDateList();
	
	public void saveTourDate(TourDate tourDate);
	
	public void dropTourDate(TourDate tourDate);		

}
