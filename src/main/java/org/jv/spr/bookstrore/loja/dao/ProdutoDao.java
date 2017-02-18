package org.jv.spr.bookstrore.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jv.spr.bookstrore.loja.model.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProdutoDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public void gravar(Produto produto){
//		entityManager.persist(produto);
		entityManager.merge(produto);
	}
	
}
