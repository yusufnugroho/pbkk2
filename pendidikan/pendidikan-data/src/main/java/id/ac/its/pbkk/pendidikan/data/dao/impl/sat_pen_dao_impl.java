package id.ac.its.pbkk.pendidikan.data.dao.impl;

import id.ac.its.pbkk.pendidikan.data.dao.sat_pen_Dao;
import id.ac.its.pbkk.pendidikan.domain.ptk;
import id.ac.its.pbkk.pendidikan.domain.sat_pen;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository("sat_pen")
public class sat_pen_dao_impl implements sat_pen_Dao{

	public sat_pen_dao_impl(){}
    //SessionFactory
    	private SessionFactory session_factory;
	
	@Resource(name="sessionFactory") 
        public void setSessionFactory(SessionFactory sessionFactory){
            this.session_factory = sessionFactory;
        }
    
        public SessionFactory getSessionFactory(){
            return this.session_factory;
        }

		public List<sat_pen> list() {
			 List<sat_pen> SAT_PEN = this.getSessionFactory().openSession().createQuery("from sat_pen").list();
		        SAT_PEN.toString();
		        return SAT_PEN;
		}

		public sat_pen_Dao findByID(UUID id) {
			// TODO Auto-generated method stub
			return null;
		}

		public void save(sat_pen data) {
			 Session session = this.session_factory.openSession();
		        Transaction tx = session.beginTransaction();
		        session.persist(data);
		        tx.commit();
		        session.close(); 
			
		}

		public void delete(sat_pen data) {
			// TODO Auto-generated method stub
			
		}

		public List<sat_pen> findByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}
	
}
