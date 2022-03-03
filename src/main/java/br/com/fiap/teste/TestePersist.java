package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.Usuario;

public class TestePersist {

	public static void main(String[] args) {

		EntityManager em = Persistence.createEntityManagerFactory("rent-a-ride").createEntityManager();

		Usuario usuario = new Usuario("Fulano", "da Silva", "teste2@gmail.com", new GregorianCalendar(1999, Calendar.JANUARY, 30), 111, 000);

		try {
			em.getTransaction().begin();

			em.persist(usuario);

			em.getTransaction().commit();
		} catch (Exception e) {
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		em.close();
	}
}
