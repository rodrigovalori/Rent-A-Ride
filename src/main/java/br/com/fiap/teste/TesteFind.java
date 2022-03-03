package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.Usuario;

public class TesteFind {

	public static void main(String[] args) {

		EntityManager em = Persistence.createEntityManagerFactory("rent-a-ride").createEntityManager();

		Usuario usuario = em.find(Usuario.class, 1);

		System.out.println(usuario.getId() + " " + usuario.getNome());

		em.close();

	}
}
