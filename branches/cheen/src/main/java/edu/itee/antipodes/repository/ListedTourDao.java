package edu.itee.antipodes.repository;

import java.util.List;

import edu.itee.antipodes.domain.*;

public interface ListedTourDao {

	public void addListedTour(ListedTour listedTour);
	
	public List<ListedTour> getListedTourList();

	public ListedTour getListedTourByID(int id);
	
	public void saveListedTour(ListedTour listedTour);
	
	public void dropListedTour(ListedTour listedTour);

}