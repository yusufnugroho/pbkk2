package id.ac.its.pbkk.pendidikan.data.console;

import id.ac.its.pbkk.pendidikan.data.dao.sat_pen_Dao;
import id.ac.its.pbkk.pendidikan.domain.sat_pen;

import org.springframework.context.support.GenericXmlApplicationContext;

public class sat_man_console {
	
	  public static void main(String[] args) 
	    {
	        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	        ctx.load("classpath:datasource.xml");
	        ctx.refresh();
	       
	        //sat_pen data_1 = new sat_pen("ITS",1,"teknik informatika","8291270","sma","kelas3","barat");
	        sat_pen_Dao controller = ctx.getBean("sat_pen",sat_pen_Dao.class);
	        //controller.save(data_1);
	        controller.list();
	        System.out.println("Lihat database Mysqal anda");
	    }

}
