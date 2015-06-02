package id.ac.its.pbkk.pendidikan.data.console;

import id.ac.its.pbkk.pendidikan.domain.ptk;
import id.ac.its.pbkk.pendidikan.data.dao.ptk_Dao;
import id.ac.its.pbkk.pendidikan.domain.Nilai_Akhir;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ptk_console {

    public static void main(String[] args) {
 GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        ptk data_1 = new ptk(145,"A147","YUSUF");
        ptk_Dao controller = ctx.getBean("ptk",ptk_Dao.class);
        //controller.save(data_1);
        controller.list();
        System.out.println("Lihat database Mysqal anda");
    }
    
}
