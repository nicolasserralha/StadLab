package br.com.stadlab.projeto.dao;

import javax.persistence.EntityManager;
import br.com.stadlab.projeto.entity.TipoEstabelecimento;

public class TipoEstabelecimentoDAO extends GenericDAO<TipoEstabelecimento, Integer> {

	public TipoEstabelecimentoDAO(EntityManager em) {
		super(em);
	}

}
