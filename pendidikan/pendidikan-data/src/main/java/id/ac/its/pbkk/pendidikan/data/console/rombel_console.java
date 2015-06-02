package id.ac.its.pbkk.pendidikan.data.console;
import org.springframework.context.support.GenericXmlApplicationContext;

import id.ac.its.pbkk.pendidikan.data.dao.registrasi_pd_Dao;
import id.ac.its.pbkk.pendidikan.data.dao.rombel_Dao;
import id.ac.its.pbkk.pendidikan.domain.rombel;

public class rombel_console {
	public static void main(String[] args) 
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        //UUID id_wali, String nim pd, String nm pd
        rombel data_1 = new rombel(145,"32", "24", "pbkk-B",14,2);
        rombel_Dao controller = ctx.getBean("rombel",rombel_Dao.class);
        controller.save(data_1);
        controller.list();
        System.out.println("Lihat database Mysqal anda");
    }

}
