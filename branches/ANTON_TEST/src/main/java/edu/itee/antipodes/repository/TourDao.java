package edu.itee.antipodes.repository;

import java.util.List;

import edu.itee.antipodes.domain.Tour;

public interface TourDao {
	
	public List<Tour> getTourList();
	
	public void saveTour(Tour tour);
	
	public void dropTour(Tour tour);

}
