package br.com.stadlab.projeto.dao;

import javax.persistence.EntityManager;
import br.com.stadlab.projeto.entity.Medicao;

public class MedicaoDAO extends GenericDAO<Medicao, Integer> {

	public MedicaoDAO(EntityManager em) {
		super(em);
	}

}
