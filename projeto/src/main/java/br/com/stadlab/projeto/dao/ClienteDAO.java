package br.com.stadlab.projeto.dao;

import javax.persistence.EntityManager;
import br.com.stadlab.projeto.entity.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Integer> {

	public ClienteDAO(EntityManager em) {
		super(em);
	}

}
