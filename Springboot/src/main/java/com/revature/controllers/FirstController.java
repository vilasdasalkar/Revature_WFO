package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	@RequestMapping("/hi")
	public String firstPage() {
		return "index";
	}
	
	@RequestMapping("/page-2")
	public String page2() {
		return "page2";
	}
}
