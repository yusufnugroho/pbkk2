package id.ac.its.pbkk.pendidikan.data.dao.impl;

import id.ac.its.pbkk.pendidikan.data.dao.registrasi_pd_Dao;
import id.ac.its.pbkk.pendidikan.domain.registrasi_pd;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("registrasi_pd")
public class registrasi_pd_Dao_Impl  implements registrasi_pd_Dao{

	public registrasi_pd_Dao_Impl(){}
    //SessionFactory
    	private SessionFactory session_factory;
	
	@Resource(name="sessionFactory") 
        public void setSessionFactory(SessionFactory sessionFactory){
            this.session_factory = sessionFactory;
        }
    
        public SessionFactory getSessionFactory(){
            return this.session_factory;
        }

		public List<registrasi_pd> list() {
                    List<registrasi_pd> REGISTRASI = this.getSessionFactory().openSession().createQuery("from registrasi_pd").list();
                    REGISTRASI.toString();
                    return REGISTRASI;	
                }

		public registrasi_pd findByID(UUID id) {
			// TODO Auto-generated method stub
			return null;
		}

		public void save(registrasi_pd data) {
			  	Session session = this.session_factory.openSession();
		        Transaction tx = session.beginTransaction();
		        session.persist(data);
		        tx.commit();
		        session.close();       
			
		}

		public void delete(registrasi_pd data) {
			// TODO Auto-generated method stub
			
		}

		public List<registrasi_pd> findByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}


}
