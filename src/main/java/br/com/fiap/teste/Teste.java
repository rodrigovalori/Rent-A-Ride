package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.Locador;

public class Teste {

	public static void main(String[] args) {

		EntityManager em = Persistence.createEntityManagerFactory("rent-a-ride").createEntityManager();

		Locador locador = new Locador();

		try {
			em.getTransaction().begin();

			em.persist(locador);

			em.getTransaction().commit();
		} catch (Exception e) {
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		em.close();
	}
}
