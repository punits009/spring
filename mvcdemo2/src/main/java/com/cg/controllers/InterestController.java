package com.cg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterestController {

@RequestMapping(value="/intrest",method=RequestMethod.GET)
	
	public String intrest(Model model,@RequestParam("amount") double p,@RequestParam("rate") double r,@RequestParam("time") int t){
		double s=p*(r/100/12) *t
				/100;
		model.addAttribute("msg","intrest "+s);
		return "home";
	}
}
