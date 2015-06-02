package id.ac.its.pbkk.pendidikan.data.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import id.ac.its.pbkk.pendidikan.data.dao.mapel_semester_Dao;
import id.ac.its.pbkk.pendidikan.domain.mapel_semester;

@Transactional
@Repository("mapel_semester")

public class mapel_semester_Dao_Impl implements mapel_semester_Dao{
	public mapel_semester_Dao_Impl(){}
    //SessionFactory
    	private SessionFactory session_factory;
	
	@Resource(name="sessionFactory") 
        public void setSessionFactory(SessionFactory sessionFactory){
            this.session_factory = sessionFactory;
        }
    
        public SessionFactory getSessionFactory(){
            return this.session_factory;
        }

		public List<mapel_semester_Dao> list() {
			// TODO Auto-generated method stub
			return null;
		}

		public mapel_semester_Dao findByID(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		public void save(mapel_semester data) {
			Session session = this.session_factory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.persist(data);
	        tx.commit();
	        session.close();    
			
		}

		public void delete(mapel_semester_Dao data) {
			// TODO Auto-generated method stub
			
		}

		public List<mapel_semester_Dao> findByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}

}
