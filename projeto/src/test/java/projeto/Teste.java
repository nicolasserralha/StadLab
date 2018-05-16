package projeto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.stadlab.projeto.entity.*;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = null ;
		
		try {
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("stadlab");
			em = fabrica.createEntityManager();
			
/*			Cliente cliente = new Cliente();
			cliente.setCelular("123456");
			cliente.setCpf("0323233232");
			cliente.setEmail("nicolas.serralha@hotmail.com");
			cliente.setNome("Nicolas");*/
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
