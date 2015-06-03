package id.ac.its.pbkk.pendidikan.data.console;
import org.springframework.context.support.GenericXmlApplicationContext;

import id.ac.its.pbkk.pendidikan.data.dao.rombel_Dao;
import id.ac.its.pbkk.pendidikan.domain.rombel;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class rombel_console {
	public static void main(String[] args) 
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        //int id_ptk, String id_matpel, String id_smt, String nm_rommbel, int jml_rommbel, int pertemuan_dalam_seminggu
        //UUID id_wali, String nim pd, String nm pd
        //rombel data_1 = new rombel(147,"900", "147", "APL",14,2);
        rombel_Dao controller = ctx.getBean("rombel",rombel_Dao.class);
        //controller.save(data_1);
        controller.list();
        System.out.println("Lihat database Mysqal anda");
    }

}
