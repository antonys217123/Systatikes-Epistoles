package gr.hua.SystatikesEpistoles.dao;

import java.util.List;

import javax.transaction.Transactional;

import gr.hua.SystatikesEpistoles.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.SystatikesEpistoles.Professor;

@Repository
public abstract class ProfessorDAOImpl implements ProfessorDAO{

    // inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Professor> getProfessors() {
        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<Professor> query = currentSession.createQuery("from Professor", Professor.class);

        // execute the query and get the results list
        List<Professor> professors = query.getResultList();

        //return the results
        return professors;
    }
}
