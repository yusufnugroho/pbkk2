package id.ac.its.pbkk.pendidikan.data.dao;
import id.ac.its.pbkk.pendidikan.domain.smt;
import java.util.List;
import java.util.UUID;

public interface smt_Dao {
    public List<smt_Dao> list();
    public smt_Dao findByID(UUID id);
    public void save(smt data);
    public void delete(smt data);
    public List<smt> findByName(String name);
}


