package edu.itee.antipodes.web.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginFailController {

	@RequestMapping("/loginFail.html")
	//@RequestMapping(value = {"/errors.html"})
	public String redirect()
	{
		return "loginFail";
	}
}
