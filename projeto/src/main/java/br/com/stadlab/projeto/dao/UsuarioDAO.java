package br.com.stadlab.projeto.dao;

import javax.persistence.EntityManager;
import br.com.stadlab.projeto.entity.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario, Integer> {

	public UsuarioDAO(EntityManager em) {
		super(em);
	}

}
