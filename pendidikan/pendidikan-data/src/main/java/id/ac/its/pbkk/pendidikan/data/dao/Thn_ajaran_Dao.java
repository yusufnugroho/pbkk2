package id.ac.its.pbkk.pendidikan.data.dao;

import id.ac.its.pbkk.pendidikan.domain.Thn_ajaran;

import java.util.List;
import java.util.UUID;

public interface Thn_ajaran_Dao {
	
	 public List<Thn_ajaran_Dao> list();
	    public Thn_ajaran_Dao findByID(String id);
	    public void save(Thn_ajaran data);
	    public void delete(Thn_ajaran data);
	    public List<Thn_ajaran> findByName(String name);

}
