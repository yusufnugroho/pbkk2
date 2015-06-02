package id.ac.its.pbkk.pendidikan.data.dao;


import id.ac.its.pbkk.pendidikan.domain.rombel;

import java.util.List;
import java.util.UUID;

public interface rombel_Dao {
	public List<rombel_Dao> list();
    public rombel findByID(int id);
    public void save(rombel data);
    public void delete(rombel data);
    public List<rombel> findByName(String name);

}
