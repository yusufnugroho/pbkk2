package id.ac.its.pbkk.pendidikan.data.dao;

import id.ac.its.pbkk.pendidikan.domain.registrasi_pd;

import java.util.List;
import java.util.UUID;

public interface registrasi_pd_Dao {
	public List<registrasi_pd> list();
    public registrasi_pd findByID(UUID id);
    public void save(registrasi_pd data);
    public void delete(registrasi_pd data);
    public List<registrasi_pd> findByName(String name); 

}
