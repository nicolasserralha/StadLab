package projeto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.stadlab.projeto.entity.*;
import br.com.stadlab.projeto.dao.*;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = null ;
		
		try {
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("stadlab");
			em = fabrica.createEntityManager();
			
			Cliente cliente = new Cliente("Nicolas Serralha","31440351813","nicolas.serralha@hotmail.com","11945141665");
			ClienteDAO clienteDAO = new ClienteDAO(em);
			
/*			Equipamento equipamento = new Equipamento();
			EquipamentoDAO equipamentoDAO = new EquipamentoDAO(em);
			
			Estabelecimento estabelecimento = new Estabelecimento();
			EstabelecimentoDAO estabelecimentoDAO = new EstabelecimentoDAO(em);
			
			TipoEstabelecimento tipoEstabelecimento = new TipoEstabelecimento();*/
/*			tipoEstabelecimento.setNome("teste");
			*/
			
			
			clienteDAO.cadastrar(cliente);
			clienteDAO.commit();
			
			

		} catch (Exception e) {
			
			if(em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			
			e.printStackTrace();
		}
		
		
		if(em != null) {
			em.getTransaction().commit();
			em.close();
		}
		
		System.exit(0);

	}

}
