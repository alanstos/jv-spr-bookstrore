package org.jv.spr.bookstrore.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(){
		System.out.println("passou pelo controller e metodo index");
		
		return "home";
	}

}
