package gr.hua.SystatikesEpistoles.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import gr.hua.SystatikesEpistoles.Professor;

public class CreateProfessor {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Professor.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create the professor object
            Professor professor = new Professor("Antonio", "Rodrigez", "antoniorodrigez@hua.gr");

            // start a transaction
            session.beginTransaction();

            // save the professor object
            session.save(professor);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            factory.close();
        }
    }
}
