package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.DadosPagamento;
import br.com.fiap.entity.Usuario;

public class TestePersist {

	public static void main(String[] args) {

		EntityManager em = null;

		try {
			em = Persistence.createEntityManagerFactory("rent-a-ride").createEntityManager();

			Usuario usuario = new Usuario("Fulano", "da Silva", "teste@gmail.com",
					new GregorianCalendar(1999, Calendar.JANUARY, 30), 111, 000);

			DadosPagamento dadosPagamento = new DadosPagamento(123456,
					new GregorianCalendar(2027, Calendar.DECEMBER, 1), "FULANO DA SILVA", 189, 10292385, usuario);

			em.getTransaction().begin();

			em.persist(usuario);
			em.persist(dadosPagamento);

			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();

			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}

		} finally {
			if (em != null) {
				em.close();
				
			}
		}
	}
}
