package id.ac.its.pbkk.pendidikan.data.console;

import id.ac.its.pbkk.pendidikan.domain.smt;
import id.ac.its.pbkk.pendidikan.data.dao.smt_Dao;
import id.ac.its.pbkk.pendidikan.domain.smt;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class smt_console {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        smt data_1 = new smt("159","2017","323");
        smt_Dao controller = ctx.getBean("smt",smt_Dao.class);
        controller.save(data_1);
        controller.list();
        System.out.println("Lihat database Mysqal anda");
   
    }
    
}
