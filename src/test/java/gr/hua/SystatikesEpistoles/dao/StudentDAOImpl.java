package gr.hua.SystatikesEpistoles.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.SystatikesEpistoles.Student;

@Repository
public abstract class StudentDAOImpl implements StudentDAO {

    // inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Student> getStudents() {
        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<Student> query = currentSession.createQuery("from Student", Student.class);

        // execute the query and get the results list
        List<Student> students = query.getResultList();

        //return the results
        return students;
    }
}
