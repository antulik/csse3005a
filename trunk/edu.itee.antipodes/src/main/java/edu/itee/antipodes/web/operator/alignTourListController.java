package edu.itee.antipodes.web.operator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.itee.antipodes.domain.db.Tour;
import edu.itee.antipodes.service.CurrentUser;
import edu.itee.antipodes.service.TourManager;

@Controller
@RequestMapping("/operator/alignTourList.html")
public class alignTourListController {
	
	CurrentUser currentUser = new CurrentUser();
	
	@RequestMapping(method = RequestMethod.GET)
	public String showTour(Model model) {
		List<Tour> tours = tourManager.getToursByOperatorID(currentUser.getCurrentUserID());
		model.addAttribute("tours", tours);
		return "alignTourList";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String alignTour(@RequestParam("tourID") int tourID, Model model) {
		tourManager.dropTourByID(tourID);
		List<Tour> tours = tourManager.getTours();
		model.addAttribute("tours", tours);
		return "alignTourList";
	}
	
	@Autowired
	TourManager tourManager;
	
}
