package id.ac.its.pbkk.pendidikan.data.dao;

import java.util.List;
import java.util.UUID;
import id.ac.its.pbkk.pendidikan.domain.anggota_rombel;

public interface anggota_rombel_Dao {
	public List<anggota_rombel_Dao> list();
    public anggota_rombel_Dao findByID(UUID id);
    public void save(anggota_rombel data);
    public void delete(anggota_rombel data);
    public List<anggota_rombel> findByName(String name);

}
