package id.ac.its.pbkk.pendidikan.data.dao.impl;
import id.ac.its.pbkk.pendidikan.data.dao.ptk_Dao;
import id.ac.its.pbkk.pendidikan.domain.ptk;
import java.util.List;
import java.util.UUID;
import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Repository("ptk")
public class ptk_Dao_Impl implements ptk_Dao {

    //Constructor
    public ptk_Dao_Impl(){}
    //SessionFactory
    	private SessionFactory session_factory;
	
	@Resource(name="sessionFactory") 
        public void setSessionFactory(SessionFactory sessionFactory){
            this.session_factory = sessionFactory;
        }
    
        public SessionFactory getSessionFactory(){
            return this.session_factory;
        }

    public List<ptk> list() {
        List<ptk> PTK = this.getSessionFactory().openSession().createQuery("from ptk").list();
        PTK.toString();
        return PTK;
    }

    public ptk findByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void save(ptk data) {
        Session session = this.session_factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(data);
        tx.commit();
        session.close();       
		
    }

    public void delete(ptk data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ptk> findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
