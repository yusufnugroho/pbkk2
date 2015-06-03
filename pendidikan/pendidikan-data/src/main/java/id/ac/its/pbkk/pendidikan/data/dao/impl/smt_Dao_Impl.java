package id.ac.its.pbkk.pendidikan.data.dao.impl;

import id.ac.its.pbkk.pendidikan.data.dao.smt_Dao;
import id.ac.its.pbkk.pendidikan.domain.smt;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("smt")

public class smt_Dao_Impl implements smt_Dao{
    //Constructor
    public smt_Dao_Impl(){}
    //SessionFactory
    	private SessionFactory session_factory;
	
	@Resource(name="sessionFactory") 
        public void setSessionFactory(SessionFactory sessionFactory){
            this.session_factory = sessionFactory;
        }
    
        public SessionFactory getSessionFactory(){
            return this.session_factory;
        }
        //Function
    public List<smt_Dao> list() {
     List<smt_Dao> SMT = (List<smt_Dao>) session_factory.getCurrentSession().createQuery("from smt").list();//this.getSessionFactory().openSession().createQuery("from wali_pd").list();
	         SMT.toString();
	         return SMT;
    }

    public smt_Dao findByID(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void save(smt data) {
        Session session = this.session_factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(data);
        tx.commit();
        session.close();       
    }

    public void delete(smt data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<smt> findByName(String name) {
		return null;
    }
    
}
