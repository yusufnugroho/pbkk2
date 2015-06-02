package id.ac.its.pbkk.pendidikan.data.console;
import id.ac.its.pbkk.pendidikan.domain.Nilai_Akhir;
import id.ac.its.pbkk.pendidikan.data.dao.Nilai_Akhir_Dao;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class nilai_akhir_console {
	public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        Nilai_Akhir data_1 = new Nilai_Akhir("50001",90, 90);
        Nilai_Akhir_Dao controller = ctx.getBean("Nilai_Akhir",Nilai_Akhir_Dao.class);
        controller.save(data_1);
        System.out.println("Lihat database Mysqal anda");
    }

}
