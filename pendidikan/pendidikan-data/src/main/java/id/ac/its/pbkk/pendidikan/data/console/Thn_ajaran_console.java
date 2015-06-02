package id.ac.its.pbkk.pendidikan.data.console;

import id.ac.its.pbkk.pendidikan.data.dao.Thn_ajaran_Dao;
import id.ac.its.pbkk.pendidikan.domain.Thn_ajaran;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Thn_ajaran_console {
	
	public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        Thn_ajaran data_1 = new Thn_ajaran("124",2000);
        Thn_ajaran_Dao controller = ctx.getBean("Thn_ajaran",Thn_ajaran_Dao.class);
        controller.save(data_1);
        System.out.println("Lihat database Mysqal anda");
    }

}

