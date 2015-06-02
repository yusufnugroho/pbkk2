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
    //wali_pd data_1 = new wali_pd("215C936D-7BD4-4426-7726-233DC1FC9A16","akte2017","kk0274","Ruchi","Tantra");
    wali_pd_Dao controller = (wali_pd_Dao)ctx.getBean("wali_pd",wali_pd_Dao.class);
    //controller.save(data_1);
    List<wali_pd> walis = controller.list();
    
    System.out.println("Lihat database Mysqal anda");
	}

}
