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
        pd data_1 = new pd("199922B9-3D6F-1CF8-7D81-51B8D11E01F7","2017","Oshi P GUsman Lagi");
        pd_Dao controller = ctx.getBean("pd",pd_Dao.class);
        controller.save(data_1);
        controller.list();
        System.out.println("Lihat database Mysqal anda");
    }
    
}
