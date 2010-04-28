package edu.itee.antipodes.web.reporting;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.itee.antipodes.domain.db.TourOperator;
import edu.itee.antipodes.domain.pages.BillingTourOperators;
import edu.itee.antipodes.repository.DaoManager;
import edu.itee.antipodes.repository.TourOperatorDaoHibernate;
import edu.itee.antipodes.service.ReportingManager;
import edu.itee.antipodes.service.SimpleReportingManager;

@Controller
@RequestMapping("/billTourOperator.html")
public class billTourOperatorController {
	@Autowired
	private Validator validator;

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String redirect(Model model) {
		SimpleReportingManager srm = new SimpleReportingManager();

		model.addAttribute("touroperators", srm.getTourOperators());
		model.addAttribute("billingTourOperator", new BillingTourOperators());

		return "billTourOperator";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView post(
			@ModelAttribute("billingTourOperator") BillingTourOperators bto,
			BindingResult result) {

		validator.validate(bto, result);
		if (result.hasErrors()) {
			return new ModelAndView("billTourOperator");
		}

		try {
			// DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			ReportingManager rp = new SimpleReportingManager();
			TourOperatorDaoHibernate todh = DaoManager.getTourOperatorDao();

			Date fromDate = new Date();
			Date toDate = new Date();
			int tourOperator = 3;
			String format = "pdf";

			// TODO: do mapping
			// fromDate = df.parse(bto.getFromDate());
			// toDate = df.parse(bto.getToDate());
			// tourOperator = Integer.parseInt(bto.getTourOperatorID()) ;

			TourOperator to = todh.getTourOperatorByID(tourOperator);

			Map<String, Object> model = rp.getBillingTourOperators(
					tourOperator, fromDate, toDate);
			model.put("format", format);
			model.put("ReportTitle", "Billing report for "
					+ to.getOperatorName());

			return new ModelAndView("reportBillingTourOperators", model);
		} catch (Exception e) {
			return new ModelAndView("billTourOperator");
		}
	}
}
