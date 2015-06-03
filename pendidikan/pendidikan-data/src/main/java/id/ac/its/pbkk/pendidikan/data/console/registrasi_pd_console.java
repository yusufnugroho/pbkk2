package id.ac.its.pbkk.pendidikan.data.console;

import id.ac.its.pbkk.pendidikan.data.dao.registrasi_pd_Dao;
import id.ac.its.pbkk.pendidikan.domain.registrasi_pd;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class registrasi_pd_console {
	public static void main(String[] args) 
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        //String id_sat_man, String id_pd
        registrasi_pd data_1 = new registrasi_pd("496459fe-0950-11e5-9b76-85b1e6718237","215C936D-7BD4-4426-7726-233DC1FC9A16");
        registrasi_pd_Dao controller = ctx.getBean("registrasi_pd",registrasi_pd_Dao.class);
        //controller.save(data_1);
        controller.list();
        System.out.println("Lihat database Mysqal anda");
    }
}
