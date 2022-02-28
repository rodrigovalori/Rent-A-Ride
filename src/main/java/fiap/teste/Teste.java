package fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("rent-a-ride").createEntityManager();
		
	}
}
