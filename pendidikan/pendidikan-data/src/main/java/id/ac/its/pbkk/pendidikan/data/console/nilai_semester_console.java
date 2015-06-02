package id.ac.its.pbkk.pendidikan.data.console;

import id.ac.its.pbkk.pendidikan.data.dao.nilai_semester_Dao;
import id.ac.its.pbkk.pendidikan.domain.nilai_semester;

import org.springframework.context.support.GenericXmlApplicationContext;

public class nilai_semester_console {
	
	public static void main(String[] args) 
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        //UUID id_wali, String nim pd, String nm pd
        nilai_semester data_1 = new nilai_semester("1234","MTK12","50001",100,100,99);
        nilai_semester_Dao controller = ctx.getBean("nilai_semester",nilai_semester_Dao.class);
        controller.save(data_1);
        controller.list();
        System.out.println("Lihat database Mysqal anda");
    }

}
