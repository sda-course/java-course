package java_course.jpa_hibernate;

import java_course.jpa_hibernate.entity.Player;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class _1_EntityManager {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("blog");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(new Player("ewa", 345));
        em.getTransaction().commit();
        em.close();
    }
}
