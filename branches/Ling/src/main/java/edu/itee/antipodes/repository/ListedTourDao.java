package edu.itee.antipodes.repository;

import java.util.List;

import edu.itee.antipodes.domain.ListedTour;

public interface ListedTourDao {

	public List<ListedTour> getListedTourList();
	
	public void saveListedTour(ListedTour listedTour);
	
	public void dropListedTour(ListedTour listedTour);

}
