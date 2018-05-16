package projeto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = null ;
		
		try {
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("stadlab");
			em = fabrica.createEntityManager();

		} catch (Exception e) {
			
			if(em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			
			e.printStackTrace();
		}
		
		if(em != null) {
			em.close();
		}
		
		System.exit(0);

	}

}
