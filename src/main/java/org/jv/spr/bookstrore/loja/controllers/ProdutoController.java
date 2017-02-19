package org.jv.spr.bookstrore.loja.controllers;

import java.util.List;

import org.jv.spr.bookstrore.loja.dao.ProdutoDao;
import org.jv.spr.bookstrore.loja.model.Produto;
import org.jv.spr.bookstrore.loja.model.TipoPrecoEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoDao produtoDao;
	
	
	@RequestMapping(value="/form",method=RequestMethod.GET)
	public ModelAndView form(){
		
		System.out.println(">> entrou no form");
		
        ModelAndView modelAndView = new ModelAndView("produto/form");
        modelAndView.addObject("tipos", TipoPrecoEnum.values());		
		
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(Produto produto, RedirectAttributes redirectAttributes){
		System.out.println("POST GRAVAR" + produto);
		produtoDao.gravar(produto);
		
		redirectAttributes.addFlashAttribute("sucesso", "Legal! Produto cadastrado com sucesso!");
		return new ModelAndView("redirect:produtos");

	}	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar(){
		System.out.println("GET listar");
		
	    List<Produto> produtos = produtoDao.listar();
	    ModelAndView modelAndView = new ModelAndView("/produto/lista");
	    modelAndView.addObject("produtos", produtos);
	    return modelAndView;
	}	
	
}
