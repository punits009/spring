package com.cg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.entities.Product;

@Controller
@RequestMapping("/add-product")
public class ProductController {
	
	@GetMapping
	public String showForm(Model model)
	{
		Product p=new Product();
		p.setPrice(100D);
		model.addAttribute("product",p);
		System.out.println("product= "+p);
		return "form";
	}
	@PostMapping
	public String submit(Model model,@ModelAttribute("product") Product product,BindingResult results)
	{
		String msg1="";
		System.out.println("Processing="+product.getName());
		if(!results.hasErrors()){
			msg1="No Errors Found";
			model.addAttribute("productname",product.getName());
		}
		else
		{
			msg1=results.getErrorCount()+" errors occured";
		}
		model.addAttribute("msg",msg1);
		model.addAttribute("errors",results.getAllErrors());
		return "success";
	}

}
