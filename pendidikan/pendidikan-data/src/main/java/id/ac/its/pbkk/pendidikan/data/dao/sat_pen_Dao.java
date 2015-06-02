package id.ac.its.pbkk.pendidikan.data.dao;

import id.ac.its.pbkk.pendidikan.domain.sat_pen;

import java.util.List;
import java.util.UUID;

public interface sat_pen_Dao {
	
	public List<sat_pen> list();
    public sat_pen_Dao findByID(UUID id);
    public void save(sat_pen data);
    public void delete(sat_pen data);
    public List<sat_pen> findByName(String name);

}
