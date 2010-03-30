package edu.itee.antipodes.service;

import java.io.Serializable;
import java.util.List;

import edu.itee.antipodes.domain.Tour;

public interface TourManager extends Serializable {
	
	public List<Tour> getTours();

}
