package id.ac.its.pbkk.pendidikan.data.dao;
import java.util.List;
import id.ac.its.pbkk.pendidikan.domain.mata_pelajaran;

public interface mata_pelajaran_Dao {
	public List<mata_pelajaran> list();
	public mata_pelajaran findByID(String id);
	public void save(mata_pelajaran data);
	public void delete(mata_pelajaran data);
	public List<mata_pelajaran> findByName(String name);

}
