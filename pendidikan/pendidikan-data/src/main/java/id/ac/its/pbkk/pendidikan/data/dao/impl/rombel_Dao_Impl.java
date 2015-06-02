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

	public List<rombel_Dao> list() {
		 throw new UnsupportedOperationException("Not supported yet.");
		// TODO Auto-generated method stub
	}

	public rombel findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(rombel data) {
		// TODO Auto-generated method stub
		Session session = this.session_factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(data);
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
