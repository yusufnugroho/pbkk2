package id.ac.its.pbkk.pendidikan.data.console;

//import id.ac.its.pbkk.pendidikan.data.dao.wali_pd_Dao;
//import id.ac.its.pbkk.pendidikan.domain.wali_pd;

import java.util.List;

import id.ac.its.pbkk.pendidikan.domain.wali_pd;
import id.ac.its.pbkk.pendidikan.data.dao.wali_pd_Dao;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class wali_pd_console {
	public static void main(String[] args)
	{
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("classpath:datasource.xml");
    ctx.refresh();
    //UUID id_wali, String nim pd, String nm pd
    //String id_pd,String no_akte,String no_kk,String nama_ayah,String nama_ibu
    wali_pd data_1 = new wali_pd("5AF59142-198A-4C5C-7F65-7DDDECE527FA","akte2020","kk0290","Welly","Ehm");
    wali_pd_Dao controller = ctx.getBean("wali_pd",wali_pd_Dao.class);
    controller.save(data_1);
    controller.list();
    //List<wali_pd> walis = controller.list();
    
    System.out.println("Lihat database Mysqal anda");
	}

}
