package id.ac.its.pbkk.pendidikan.domain;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import java.util.*;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "registrasi_pd")
public class registrasi_pd {
	//Constructor
	public registrasi_pd(){}
	
	
	public registrasi_pd(String id_sat_man, String id_pd) {
		this.setId_pd(id_pd);
		this.setId_sat_man(id_sat_man);
	}


	@Id
	@GeneratedValue(generator="uuid2")
    @GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(name="ID_REGISTRASI")
	private String id_registrasi;
	
	@Column(name="ID_SAT_MAN")
	//@ManyToOne(fetch = FetchType.LAZY)
	private String id_sat_man;
	
	@Column(name="ID_PD")
	//@ManyToOne(fetch = FetchType.LAZY)
	private String id_pd;
	
	@Column(name="TANGGAL_MASUK")
	private DateTime tanggal_masuk;
	
	@Column(name="TANGGAL_KELUAR")
	private DateTime tanggal_keluar;
	
	/*
	 * Default table*/
	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;

	
	//Setter and Getter
	
	
	public String getId_registrasi() {
		return id_registrasi;
	}

	public void setId_registrasi(String id_registrasi) {
		this.id_registrasi = id_registrasi;
	}

	public String getId_sat_man() {
		return id_sat_man;
	}

	public void setId_sat_man(String id_sat_man) {
		this.id_sat_man = id_sat_man;
	}

	public String getId_pd() {
		return id_pd;
	}

	public void setId_pd(String id_pd) {
		this.id_pd = id_pd;
	}
  @Override
	    public String toString() {
	    String str1 = "ID REGISTRASI :"+id_registrasi+"\n";
	    str1 = str1+"ID SAT MAN :"+id_sat_man+"\n";
	    str1 = str1 +"ID PD :"+ id_pd+"\n";

	    System.out.println(str1);
	    return str1;
	    }

}
