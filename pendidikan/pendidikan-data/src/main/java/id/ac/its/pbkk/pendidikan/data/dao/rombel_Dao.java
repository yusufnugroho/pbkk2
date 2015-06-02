package id.ac.its.pbkk.pendidikan.data.dao;

import id.ac.its.pbkk.pendidikan.domain.rombel;;

import java.util.List;

public interface rombel_Dao {
	public List<rombel_Dao> list();
	public rombel_Dao findByID(String id);
	public void save(rombel_Dao data);
	public void delete(rombel_Dao data);
	public List<rombel_Dao> findByName(String name);

}
