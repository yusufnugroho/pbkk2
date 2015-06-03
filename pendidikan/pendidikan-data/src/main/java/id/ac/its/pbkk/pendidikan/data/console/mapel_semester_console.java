package id.ac.its.pbkk.pendidikan.data.console;
import org.springframework.context.support.GenericXmlApplicationContext;

import id.ac.its.pbkk.pendidikan.data.dao.mapel_semester_Dao;
import id.ac.its.pbkk.pendidikan.domain.mapel_semester;


public class mapel_semester_console {
	 public static void main(String[] args) 
	    {
	        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	        ctx.load("classpath:datasource.xml");
	        ctx.refresh();
                //String id_mapel_semester, String id_matpel,String id_smt
	        mapel_semester data_1 = new mapel_semester("444","001","88");
	        mapel_semester_Dao controller = ctx.getBean("mapel_semester",mapel_semester_Dao.class);
	        controller.save(data_1);
	        controller.list();
	        System.out.println("Lihat database Mysqal anda");
	    }
	    

}
