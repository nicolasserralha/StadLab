package br.com.stadlab.projeto.dao;

import javax.persistence.EntityManager;
import br.com.stadlab.projeto.entity.Equipamento;

public class EquipamentoDAO extends GenericDAO<Equipamento, Integer> {

	public EquipamentoDAO(EntityManager em) {
		super(em);
	}

}
