package id.ac.its.pbkk.pendidikan.data.dao;

import id.ac.its.pbkk.pendidikan.domain.wali_pd;

import java.util.List;
import java.util.UUID;

public interface wali_pd_Dao {
	public List<wali_pd> list();
    public wali_pd findByID(UUID id);
    public void save(wali_pd data);
    public void delete(wali_pd data);
    public List<wali_pd> findByName(String name); 

}
