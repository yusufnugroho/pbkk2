package id.ac.its.pbkk.pendidikan.data.dao;

import id.ac.its.pbkk.pendidikan.domain.nilai_semester;

import java.util.List;
import java.util.UUID;

public interface nilai_semester_Dao {
	
	
	public List<nilai_semester> list();
    public nilai_semester_Dao findByID(String id);
    public void save(nilai_semester data);
    public void delete(nilai_semester data);
    public List<nilai_semester> findByName(String name);


}
