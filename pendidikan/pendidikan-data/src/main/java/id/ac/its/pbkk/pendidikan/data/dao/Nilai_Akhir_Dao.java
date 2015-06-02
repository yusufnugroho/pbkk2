package id.ac.its.pbkk.pendidikan.data.dao;

import id.ac.its.pbkk.pendidikan.domain.Nilai_Akhir;
import java.util.List;
import java.util.UUID;

public interface Nilai_Akhir_Dao{
	
    public List<Nilai_Akhir_Dao> list();
    public Nilai_Akhir_Dao findByID(UUID id);
    public void save(Nilai_Akhir data);
    public void delete(Nilai_Akhir data);
    public List<Nilai_Akhir> findByName(String name);
}
