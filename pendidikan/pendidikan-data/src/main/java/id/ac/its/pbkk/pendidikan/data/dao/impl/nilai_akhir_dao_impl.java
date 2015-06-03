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
import java.util.ArrayList;
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
   
    public List<Nilai_Akhir> list() 
    {
    	 
         List<Nilai_Akhir> NILAI_AKHIR_DAO = this.getSessionFactory().openSession().createQuery("from Nilai_Akhir").list();
         NILAI_AKHIR_DAO.toString();
         return NILAI_AKHIR_DAO;
         
    }

	public Nilai_Akhir findByID(String id) {
            Nilai_Akhir nilai_akhir = null;
            List<Nilai_Akhir>nilai_akhir_temp = this.list();
            for(int i=0;i<nilai_akhir_temp.size();i++){
                nilai_akhir = nilai_akhir_temp.get(i);
                if(nilai_akhir.getId_nilai_akhir().equals(id)){break;}
            }
            return nilai_akhir;
	}

	public void save(Nilai_Akhir data) {
		Session session = this.session_factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(data);
        tx.commit();
        session.close();       
		
	}

	public void delete(String data) {
		

    	Nilai_Akhir nilai = this.findByID(data);
    	nilai.setSoft_delete(1);
    	nilai.setId_nilai_akhir(data);
        
        Session session = this.session_factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(nilai);
        tx.commit();
        session.close();
	}

	public List<Nilai_Akhir> findByUAS(int val) 
	{
            List<Nilai_Akhir> nilai_akhir = new ArrayList<Nilai_Akhir>();
            List<Nilai_Akhir>nilai_akhir_temp = this.list();
            Nilai_Akhir temp=null;
            for(int i=0;i<nilai_akhir_temp.size();i++){
                temp = nilai_akhir_temp.get(i);
                if(temp.getNilai_uas()==val){
                nilai_akhir.add(temp);
                }
            }
            return nilai_akhir;
		
	}

}
