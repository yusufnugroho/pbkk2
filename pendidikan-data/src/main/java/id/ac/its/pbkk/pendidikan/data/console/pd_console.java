package id.ac.its.pbkk.pendidikan.data.console;

import id.ac.its.pbkk.pendidikan.domain.pd;
import id.ac.its.pbkk.pendidikan.data.dao.pd_Dao;
import id.ac.its.pbkk.pendidikan.domain.pd;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class pd_console {
    public static void main(String[] args) 
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        //UUID id_wali, String nim pd, String nm pd
        pd data_1 = new pd("9DEF5B97-4124-5CAA-70C1-0B16F4D36134","2017","Rachmania");
        pd_Dao controller = ctx.getBean("pd",pd_Dao.class);
        controller.save(data_1);
        controller.list();
        System.out.println("Lihat database Mysqal anda");
    }
    
}
