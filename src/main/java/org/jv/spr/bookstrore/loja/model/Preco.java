package org.jv.spr.bookstrore.loja.model;

import java.math.BigDecimal;

import javax.persistence.Embeddable;


@Embeddable
//para que o Spring possa relacionar e portar os elementos de preço para dentro desta coleção, devemos marcar a classe Preco com uma a anotação Embeddable:
public class Preco {
	
	private BigDecimal valor;
	private TipoPrecoEnum tipo;
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public TipoPrecoEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoPrecoEnum tipo) {
		this.tipo = tipo;
	}

	
	

}
