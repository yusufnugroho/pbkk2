package id.ac.its.pbkk.pendidikan.data.dao;

<<<<<<< HEAD
import id.ac.its.pbkk.pendidikan.domain.registrasi_pd;
=======

>>>>>>> bcd093cb7ee3eea84744390d0549ca5cfd1cbe89
import id.ac.its.pbkk.pendidikan.domain.rombel;

import java.util.List;
import java.util.UUID;

<<<<<<< HEAD
import id.ac.its.pbkk.pendidikan.domain.rombel;

import java.util.List;

public interface rombel_Dao {
	public List<rombel> list();
	public rombel findByID(String id);
	public void save(rombel data_1);
	public void delete(rombel data);
	public List<rombel> findByName(String name);

=======
public interface rombel_Dao {
	public List<rombel_Dao> list();
    public rombel findByID(int id);
    public void save(rombel data);
    public void delete(rombel data);
    public List<rombel> findByName(String name);
>>>>>>> bcd093cb7ee3eea84744390d0549ca5cfd1cbe89

}
