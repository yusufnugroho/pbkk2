package id.ac.its.pbkk.pendidikan.domain;
import java.util.*;
import org.joda.time.DateTime;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="wali_pd")
public class wali_pd {
	@Id
	@GeneratedValue(generator="uuid2")
    @GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(name="ID_WALI",length=36)
	private String id_wali;
	
	@Column(name="ID_PD",length=36)
	private String id_pd;
	

	@Column(name="NO_AKTE",length=36,nullable=true)
	private String no_akte;
	

	@Column(name="NO_KK",length=36,nullable=true)
	private String no_kk;
	

	@Column(name="NAMA_AYAH",length=50,nullable=true)
	private String nama_ayah;
	

	@Column(name="NAMA_IBU",length=50,nullable=true)
	private String nama_ibu;
	
	/*
	 * Default table*/
	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	
	/*Setter and Getter*/
	

	public String getId_wali() {
		return id_wali;
	}

	public void setId_wali(String id_wali) {
		this.id_wali = id_wali;
	}

	public String getId_pd() {
		return id_pd;
	}

	public void setId_pd(String id_pd) {
		this.id_pd = id_pd;
	}

	public String getNo_akte() {
		return no_akte;
	}

	public void setNo_akte(String no_akte) {
		this.no_akte = no_akte;
	}

	public String getNo_kk() {
		return no_kk;
	}

	public void setNo_kk(String no_kk) {
		this.no_kk = no_kk;
	}

	public String getNama_ayah() {
		return nama_ayah;
	}

	public void setNama_ayah(String nama_ayah) {
		this.nama_ayah = nama_ayah;
	}

	public String getNama_ibu() {
		return nama_ibu;
	}

	public void setNama_ibu(String nama_ibu) {
		this.nama_ibu = nama_ibu;
	}

	/*Constructor*/
	public wali_pd(){}
	
	public wali_pd(String id_pd,String no_akte,String no_kk,String nama_ayah,String nama_ibu)
	{
		this.setId_pd(id_pd);
		this.setNama_ayah(nama_ayah);
		this.setNama_ibu(nama_ibu);
		this.setNo_akte(no_akte);
		this.setNo_kk(no_kk);
	}
	 @Override
	    public String toString() {
	    String str1 = "ID_WALI_PD :"+id_wali+"\n";
	    str1 = str1+"ID_PD"+id_pd+"\n";
	    str1 = str1 +"Nama Ayah"+ nama_ayah+"\n";
	    str1 = str1 +"Nama Ibu"+ nama_ibu+"\n";
	    System.out.println(str1);
	    return str1;
	    }
		
	
	
}
