package org.jv.spr.bookstrore.loja.controllers;

import org.jv.spr.bookstrore.loja.dao.ProdutoDao;
import org.jv.spr.bookstrore.loja.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutoController {
	
//	Logger logger = Logger.getLogger(ProdutoController.class);
	
	@Autowired
	private ProdutoDao produtoDao;
	
	
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
	public String gravar(Produto produto){
		try {
			System.out.println(produto);
			produtoDao.gravar(produto);
			
			return "produto/ok";
			
		} catch (Exception e) {
			e.printStackTrace();
//			logger.error("erro ao realizar operacao de gravar", e);
			return "produto/erro";
		}
	}	
}
