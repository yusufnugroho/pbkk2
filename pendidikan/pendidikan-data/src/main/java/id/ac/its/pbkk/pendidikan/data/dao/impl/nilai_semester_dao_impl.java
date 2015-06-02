package id.ac.its.pbkk.pendidikan.data.dao.impl;

import java.util.List;

import id.ac.its.pbkk.pendidikan.data.dao.nilai_semester_Dao;
import id.ac.its.pbkk.pendidikan.domain.nilai_semester;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("nilai_semester")

public class nilai_semester_dao_impl implements nilai_semester_Dao{
	
	public nilai_semester_dao_impl(){}
    //SessionFactory
    	private SessionFactory session_factory;
	
	@Resource(name="sessionFactory") 
        public void setSessionFactory(SessionFactory sessionFactory){
            this.session_factory = sessionFactory;
        }
    
        public SessionFactory getSessionFactory(){
            return this.session_factory;
        }

		public List<nilai_semester> list() {
			// TODO Auto-generated method stub
			return null;
		}

		public nilai_semester_Dao findByID(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		public void save(nilai_semester data) {
			 Session session = this.session_factory.openSession();
		        Transaction tx = session.beginTransaction();
		        session.persist(data);
		        tx.commit();
		        session.close(); 
			
		}

		public void delete(nilai_semester data) {
			// TODO Auto-generated method stub
			
		}

		public List<nilai_semester> findByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}

}
