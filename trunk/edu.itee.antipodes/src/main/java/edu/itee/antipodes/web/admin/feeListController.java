package edu.itee.antipodes.web.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.itee.antipodes.domain.db.AccountUser;
import edu.itee.antipodes.service.AccountManager;

@Controller
@RequestMapping("/admin/feeList.html")
public class feeListController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String showUserForm(Model model) {
		List<AccountUser> accounts = accountManager.getAccounts();
		model.addAttribute("accounts", accounts);
		return "feeList";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String post(@RequestParam("userID") int userID, Model model) {
		accountManager.dropAccountByID(userID);
		List<AccountUser> accounts = accountManager.getAccounts();
		model.addAttribute("accounts", accounts);
		return "feeList";
	}

	@Autowired
	AccountManager accountManager;
}
