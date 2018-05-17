package projeto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.stadlab.projeto.entity.TipoEstabelecimento;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = null ;
		
		try {
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("stadlab");
			em = fabrica.createEntityManager();
			TipoEstabelecimento tipoEstabelecimento = new TipoEstabelecimento();
			tipoEstabelecimento.setNome("teste");
			
			em.getTransaction().begin();
			
			em.persist(tipoEstabelecimento);
			

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
