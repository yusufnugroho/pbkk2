package id.ac.its.pbkk.pendidikan.data.console;

import id.ac.its.pbkk.pendidikan.data.dao.anggota_rombel_Dao;
import id.ac.its.pbkk.pendidikan.domain.anggota_rombel;

import org.springframework.context.support.GenericXmlApplicationContext;

public class anggota_rombel_console {
	public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        anggota_rombel anggota = new anggota_rombel("123456789","7fb9dbad-090c-11e5-9536-2cd05a4a81f6", "215C936D-7BD4-4426-7726-233DC1FC9A16");
        anggota_rombel_Dao controller = ctx.getBean("anggota_rombel",anggota_rombel_Dao.class);
        controller.save(anggota);
        System.out.println("Lihat database Mysqal anda");

}
}
