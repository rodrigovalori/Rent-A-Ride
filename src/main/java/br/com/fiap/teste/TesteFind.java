package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.Usuario;

public class TesteFind {

	public static void main(String[] args) {

		EntityManager em = null;

		try {
			em = Persistence.createEntityManagerFactory("rent-a-ride").createEntityManager();

			Usuario usuario = em.find(Usuario.class, 1);

			System.out.println(usuario.getId() + " " + usuario.getNome());

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
