package id.ac.its.pbkk.pendidikan.data.console;

import id.ac.its.pbkk.pendidikan.data.dao.anggota_rombel_Dao;
import id.ac.its.pbkk.pendidikan.domain.anggota_rombel;

import org.springframework.context.support.GenericXmlApplicationContext;

public class anggota_rombel_console {
	public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        //String id_anggota_rombel(10), String id_rombel(UUID), String id_pd()
        anggota_rombel anggota = new anggota_rombel("900900","7a5b006c-0950-11e5-9b76-85b1e6718237", "30D6F4CD-24F0-365D-4E03-A64E11E94582");
        anggota_rombel_Dao controller = ctx.getBean("anggota_rombel",anggota_rombel_Dao.class);
        controller.save(anggota);
        System.out.println("Lihat database Mysqal anda");

}
}
