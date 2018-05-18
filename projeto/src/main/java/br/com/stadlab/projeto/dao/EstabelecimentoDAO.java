package br.com.stadlab.projeto.dao;

import javax.persistence.EntityManager;

import br.com.stadlab.projeto.entity.Estabelecimento;

public class EstabelecimentoDAO extends GenericDAO<Estabelecimento, Integer> {

	public EstabelecimentoDAO(EntityManager em) {
		super(em);
	}

}
