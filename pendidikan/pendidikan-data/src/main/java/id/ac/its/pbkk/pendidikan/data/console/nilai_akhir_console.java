package id.ac.its.pbkk.pendidikan.data.console;
import java.util.List;

import id.ac.its.pbkk.pendidikan.domain.Nilai_Akhir;
import id.ac.its.pbkk.pendidikan.data.dao.Nilai_Akhir_Dao;
import id.ac.its.pbkk.pendidikan.data.dao.impl.nilai_akhir_dao_impl;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class nilai_akhir_console {
	public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        Nilai_Akhir data_1 = new Nilai_Akhir("50003",11, 90);
        Nilai_Akhir_Dao controller = ctx.getBean("Nilai_Akhir",Nilai_Akhir_Dao.class);
       // controller.save(data_1);
        //controller.list();
        //controller.findByID("50003").toString();
        //controller.delete("50003");
        controller.findByUAS(90).toString();
        System.out.println("Lihat database Mysqal anda");
    }

}
