import config.HibernateConfig;
import entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();

        Person person=new Person("Lisa",23);
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
        emf.close();


    }
}