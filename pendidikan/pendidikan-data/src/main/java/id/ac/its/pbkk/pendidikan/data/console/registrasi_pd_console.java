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
        //UUID id_wali, String nim pd, String nm pd
        registrasi_pd data_1 = new registrasi_pd("3294accd-090c-11e5-9536-2cd05a4a81f6","30D6F4CD-24F0-365D-4E03-A64E11E94582");
        registrasi_pd_Dao controller = ctx.getBean("registrasi_pd",registrasi_pd_Dao.class);
        controller.save(data_1);
        controller.list();
        System.out.println("Lihat database Mysqal anda");
    }
}
