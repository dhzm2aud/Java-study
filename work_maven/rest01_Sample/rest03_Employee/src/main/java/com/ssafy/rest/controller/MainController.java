package com.ssafy.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("restful.do")
	public String moveEmployeeController()
	{
		return "restful";
	}
}
