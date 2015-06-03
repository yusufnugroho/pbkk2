package id.ac.its.pbkk.pendidikan.data.dao;

import id.ac.its.pbkk.pendidikan.domain.rombel;

import java.util.List;
import java.util.UUID;

import id.ac.its.pbkk.pendidikan.domain.rombel;

import java.util.List;

public interface rombel_Dao {
	public List<rombel> list();
	public rombel findByID(String id);
	public void save(rombel data_1);
	public void delete(rombel data);
	public List<rombel> findByName(String name);


}
