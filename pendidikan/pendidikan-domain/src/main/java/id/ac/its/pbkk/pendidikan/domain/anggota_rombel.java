package id.ac.its.pbkk.pendidikan.domain;

import java.util.*;

import org.joda.time.DateTime;
import org.hibernate.annotations.Type;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="anggota_rombel")
public class anggota_rombel {
	//Constructor
	public anggota_rombel(){}
	
	public anggota_rombel(String id_anggota_rombel, String id_rombel, String id_pd) 
	{
		this.setId_anggota_rombel(id_anggota_rombel);
		this.setId_rombel(id_rombel);
		this.setId_pd(id_pd);
	}

	@Id
	@Column(name="ID_ANGGOTA_ROMBEL")
	private String id_anggota_rombel;
	
	@Column(name="ID_ROMBEL")
	//@ManyToOne(fetch = FetchType.LAZY)
	private String id_rombel;
	
	@Column(name="ID_PD")
	//@ManyToOne(fetch = FetchType.LAZY)
	private String id_pd;
	
	/*Default Attribute*/

	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###

	public String getId_anggota_rombel() {
		return id_anggota_rombel;
	}

	public void setId_anggota_rombel(String id_anggota_rombel) {
		this.id_anggota_rombel = id_anggota_rombel;
	}

	public String getId_rombel() {
		return id_rombel;
	}

	public void setId_rombel(String id_rombel) {
		this.id_rombel = id_rombel;
	}

	public String getId_pd() {
		return id_pd;
	}

	public void setId_pd(String id_pd) {
		this.id_pd = id_pd;
	}

	public boolean isSoft_delete() {
		return soft_delete;
	}

	public void setSoft_delete(boolean soft_delete) {
		this.soft_delete = soft_delete;
	}

	public DateTime getCreate_date() {
		return create_date;
	}

	public void setCreate_date(DateTime create_date) {
		this.create_date = create_date;
	}

	//setter and getter
         @Override
	    public String toString() {
	    String str1 = "ID ANGGOTA ROMBEL :"+id_anggota_rombel+"\n";
	    str1 = str1+"ID PD :"+id_pd+"\n";
	    str1 = str1 +"ID ROMBEL :"+ id_rombel+"\n";

	    System.out.println(str1);
	    return str1;
	    }
		
}
