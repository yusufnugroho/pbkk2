package id.ac.its.pbkk.pendidikan.data.console;
import id.ac.its.pbkk.pendidikan.data.dao.mata_pelajaran_Dao;
import id.ac.its.pbkk.pendidikan.domain.mata_pelajaran;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class mata_pelajaran_console {
	public static void main(String[] args) 
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        //String id_matpel,String id_sat_man,String nama_matpel
        
        mata_pelajaran data_1 = new mata_pelajaran("002","fb76ab46-0974-11e5-9b76-85b1e6718237","Kimia");
        mata_pelajaran_Dao controller = ctx.getBean("mata_pelajaran",mata_pelajaran_Dao.class);
        controller.save(data_1);
        controller.list();
        System.out.println("Lihat database Mysqal anda");
    }

}

