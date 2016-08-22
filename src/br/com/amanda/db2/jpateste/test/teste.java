package br.com.amanda.db2.jpateste.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class teste {


	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bd2");
		EntityManager em = emf.createEntityManager();

	}

}
