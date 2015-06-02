/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.its.pbkk.pendidikan.data.dao;
import id.ac.its.pbkk.pendidikan.domain.ptk;
import java.util.List;
import java.util.UUID;

public interface ptk_Dao{
	
    public List<ptk> list();
    public ptk findByID(String id);
    public void save(ptk data);
    public void delete(ptk data);
    public List<ptk> findByName(String name);
}

