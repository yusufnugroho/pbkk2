package id.ac.its.pbkk.pendidikan.data.dao.impl;

import id.ac.its.pbkk.pendidikan.data.dao.Thn_ajaran_Dao;
import id.ac.its.pbkk.pendidikan.domain.Thn_ajaran;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Transactional
@Repository("Thn_ajaran")

public class Thn_ajaran_dao_impl implements Thn_ajaran_Dao {

	//Constructor
		public Thn_ajaran_dao_impl(){}
		
		//session
		private SessionFactory session_factory;
		
		@Resource(name="sessionFactory") 
	        public void setSessionFactory(SessionFactory sessionFactory){
	            this.session_factory = sessionFactory;
	        }
	    
	        public SessionFactory getSessionFactory(){
	            return this.session_factory;
	        }
	        //FUNCTION
		public List<Thn_ajaran_Dao> list() {
			 throw new UnsupportedOperationException("Not supported yet.");
			
		}

		public Thn_ajaran_Dao findByID(String id) {
			 throw new UnsupportedOperationException("Not supported yet.");
			
		}

		public void save(Thn_ajaran data) {
			Session session = this.session_factory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.persist(data);
	        tx.commit();
	        session.close();       
			
		}

		public void delete(Thn_ajaran data) {
			 throw new UnsupportedOperationException("Not supported yet.");
			
		}

		public List<Thn_ajaran> findByName(String name) {
			 throw new UnsupportedOperationException("Not supported yet.");
			
		}
	
}
