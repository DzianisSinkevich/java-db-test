package config;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import db.tests.OpenSession;

public abstract class DBUnitConfig<T> {

	private EntityManager em = Persistence.createEntityManagerFactory(
			"DBUnitEx").createEntityManager();

	public void save(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}

	public void delete(T entity) {
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
	}

	public abstract T get(int id);

	public void update(T entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
	}

	public List<OpenSession> getAll() {
		TypedQuery<OpenSession> namedQuery = em.createNamedQuery("Person.getAll",
				OpenSession.class);

		return namedQuery.getResultList();
	}

}
