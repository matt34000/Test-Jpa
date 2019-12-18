package tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entites.Livre;

public class TestJpa {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		//Livre li = em.find(Livre.class, 1);
		//System.out.println(li);
		
		
		TypedQuery<Livre> query = em.createQuery("select li from Livre li where li.titre='Germinal'",Livre.class);
		Livre li2 = query.getResultList().get(0);
		System.out.println(li2.toString());
		
		em.close();
		entityManagerFactory.close();
		

	}

}
