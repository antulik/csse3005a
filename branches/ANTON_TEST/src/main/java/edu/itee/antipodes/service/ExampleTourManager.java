package edu.itee.antipodes.service;

import java.util.List;

import edu.itee.antipodes.domain.Tour;

public class ExampleTourManager implements TourManager {
	
	private List<Tour> tours;

	public List<Tour> getTours() {
		return tours;
	}

	public void setTours(List<Tour> tours) {
		this.tours = tours;
	}

}
