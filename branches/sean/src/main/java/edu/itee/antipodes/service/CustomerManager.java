package edu.itee.antipodes.service;

import java.util.List;

import edu.itee.antipodes.domain.db.Tour;

public interface CustomerManager {
	
	public List<Tour> searchTours(String parameters);

}
