package edu.itee.antipodes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class editAccountListController {

	@RequestMapping("/editAccountList.html")
	public String redirect()
	{
		return "editAccountList";
	}
}