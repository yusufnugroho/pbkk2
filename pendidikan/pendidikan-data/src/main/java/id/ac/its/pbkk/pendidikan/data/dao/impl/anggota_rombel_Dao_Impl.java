package id.ac.its.pbkk.pendidikan.data.dao.impl;

import id.ac.its.pbkk.pendidikan.data.dao.anggota_rombel_Dao;
import id.ac.its.pbkk.pendidikan.domain.anggota_rombel;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("anggota_rombel")
public class anggota_rombel_Dao_Impl implements anggota_rombel_Dao {
	
	public anggota_rombel_Dao_Impl(){}
	
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
	public List<anggota_rombel_Dao> list() {
		 throw new UnsupportedOperationException("Not supported yet.");
		
	}

	public anggota_rombel_Dao findByID(UUID id) {
		 throw new UnsupportedOperationException("Not supported yet.");
		
	}

	public void save(anggota_rombel data) {
		Session session = this.session_factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(data);
        tx.commit();
        session.close();       
		
	}

	public void delete(anggota_rombel data) {
		 throw new UnsupportedOperationException("Not supported yet.");
		
	}

	public List<anggota_rombel> findByName(String name) {
		 throw new UnsupportedOperationException("Not supported yet.");
		
	}

}
