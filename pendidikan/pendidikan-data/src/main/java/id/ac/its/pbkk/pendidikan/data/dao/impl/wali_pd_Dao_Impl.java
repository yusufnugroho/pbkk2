package id.ac.its.pbkk.pendidikan.data.dao.impl;

import id.ac.its.pbkk.pendidikan.data.dao.wali_pd_Dao;
import id.ac.its.pbkk.pendidikan.domain.ptk;
import id.ac.its.pbkk.pendidikan.domain.wali_pd;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("wali_pd")
public class wali_pd_Dao_Impl implements wali_pd_Dao{
	
	 public wali_pd_Dao_Impl(){}
	    //SessionFactory
	    	private SessionFactory session_factory;
		
		@Resource(name="sessionFactory") 
	        public void setSessionFactory(SessionFactory sessionFactory){
	            this.session_factory = sessionFactory;
	        }
	    
	        public SessionFactory getSessionFactory(){
	            return this.session_factory;
	        }

	    public List<wali_pd> list() {
	         List<wali_pd> WALI_PD = (List<wali_pd>) session_factory.getCurrentSession().createQuery("from wali_pd").list();//this.getSessionFactory().openSession().createQuery("from wali_pd").list();
	         WALI_PD.toString();
	         return WALI_PD;
	    }

	    public wali_pd findByID(UUID id) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	    public void save(wali_pd data) {
	        Session session = this.session_factory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.persist(data);
	        tx.commit();
	        session.close();  
	    }

	    public void delete(wali_pd data) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	    public List<wali_pd> findByName(String name) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

}
