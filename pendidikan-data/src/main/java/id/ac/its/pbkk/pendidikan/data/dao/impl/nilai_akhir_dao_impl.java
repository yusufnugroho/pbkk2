package id.ac.its.pbkk.pendidikan.data.dao.impl;

import id.ac.its.pbkk.pendidikan.data.dao.Nilai_Akhir_Dao;
import id.ac.its.pbkk.pendidikan.domain.Nilai_Akhir;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("Nilai_Akhir")

public class nilai_akhir_dao_impl implements Nilai_Akhir_Dao {

	//Constructor
	public nilai_akhir_dao_impl(){}
	
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
	public List<Nilai_Akhir_Dao> list() {
		 throw new UnsupportedOperationException("Not supported yet.");
		
	}

	public Nilai_Akhir_Dao findByID(UUID id) {
		 throw new UnsupportedOperationException("Not supported yet.");
		
	}

	public void save(Nilai_Akhir data) {
		Session session = this.session_factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(data);
        tx.commit();
        session.close();       
		
	}

	public void delete(Nilai_Akhir data) {
		 throw new UnsupportedOperationException("Not supported yet.");
		
	}

	public List<Nilai_Akhir> findByName(String name) {
		 throw new UnsupportedOperationException("Not supported yet.");
		
	}

}
