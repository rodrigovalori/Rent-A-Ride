package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.Usuario;

public class TesteMerge {

	public static void main(String[] args) {

		EntityManager em = null;
		try {
			em = Persistence.createEntityManagerFactory("rent-a-ride").createEntityManager();
			Usuario usuario = em.find(Usuario.class, 5);
			usuario.setNome("Bar do Joao");
			em.merge(usuario);
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (em != null) {
			em.close();
		}
		System.exit(0);
	}
}
