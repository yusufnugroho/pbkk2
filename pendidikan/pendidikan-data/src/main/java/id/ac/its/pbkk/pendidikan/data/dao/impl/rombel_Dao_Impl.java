package id.ac.its.pbkk.pendidikan.data.dao.impl;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import id.ac.its.pbkk.pendidikan.data.dao.rombel_Dao;
import id.ac.its.pbkk.pendidikan.domain.rombel;

@Transactional
@Repository("rombel")
public class rombel_Dao_Impl implements rombel_Dao {
	public rombel_Dao_Impl (){}
	//SessionFactory
	private SessionFactory session_factory;

@Resource(name="sessionFactory") 
    public void setSessionFactory(SessionFactory sessionFactory){
        this.session_factory = sessionFactory;
    }

    public SessionFactory getSessionFactory(){
        return this.session_factory;
    }

	public List<rombel> list() {
		List<rombel> ROMBEL = this.getSessionFactory().openSession().createQuery("from rombel").list();
         ROMBEL.toString();
         return ROMBEL;
	}

	public rombel findByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(rombel data_1) {
		  Session session = this.session_factory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.persist(data_1);
	        tx.commit();
	        session.close();       
		
	}

	public void delete(rombel data) {
		// TODO Auto-generated method stub
		
	}

	public List<rombel> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
