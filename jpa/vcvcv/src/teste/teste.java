package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import produto.produto1;

public class teste {

	public static void main(String[] args) {
		produto1 p = new produto1();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vcvcv");
		EntityManager em = emf.createEntityManager();
		
		
		
		p.setId(1);
		p.setNome("diego");
		
		
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		

	}

}
