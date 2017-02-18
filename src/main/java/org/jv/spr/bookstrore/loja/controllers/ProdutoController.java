package org.jv.spr.bookstrore.loja.controllers;

import org.jv.spr.bookstrore.loja.model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutoController {
	
	
	@RequestMapping("/form")
	public String form(){
		
		System.out.println("entrou no form");
		
		return "produto/form";
	}
	
	@RequestMapping("/form/produto")
	public String formulario(){
		
		System.out.println("entrou no form/produto");
		
		return "produto/form";
	}	
	
	@RequestMapping("/produtos")
	public String cadastar(Produto produto){
		
		System.out.println(produto);
		
		return "produto/ok";
	}	

}
