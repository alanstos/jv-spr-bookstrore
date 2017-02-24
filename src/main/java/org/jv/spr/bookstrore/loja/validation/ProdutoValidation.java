package org.jv.spr.bookstrore.loja.validation;

import org.jv.spr.bookstrore.loja.model.Produto;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ProdutoValidation implements Validator {
	
	public void valida(Produto produto, Errors errors) {
		System.out.println("iniciando validacao i ProdutoValidation");
	    ValidationUtils.rejectIfEmpty(errors, "titulo", "field.required");
	    ValidationUtils.rejectIfEmpty(errors, "descricao", "field.required");
	    if (produto.getPaginas() <= 0){
	    	errors.rejectValue("paginas", "field.required");	
	    }
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return Produto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		valida((Produto)target, errors);
		
	}	

}
