package edu.itee.antipodes.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.itee.antipodes.domain.db.AccountUser;

@Controller
@RequestMapping("/editAccount.html")
public final class editAccountController {
	
	@Autowired
	private Validator validator;
	
	public void setValidator(Validator validator) {
		this.validator = validator;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showUserForm(ModelMap model) {
		AccountUser accountUser = new AccountUser();
		model.addAttribute("accountUser", accountUser);
		return "editAccount";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String post(@ModelAttribute("accountUser") AccountUser accountUser,
			BindingResult result) {
		
		validator.validate(accountUser, result);
		if (result.hasErrors()) { return "editAccount"; }
		
		// Use the redirect-after-post pattern to reduce double-submits.
		return "redirect:thanks.html";
		
	}

}