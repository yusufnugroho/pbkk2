package id.ac.its.pbkk.pendidikan.domain;

import java.util.*;

import org.joda.time.DateTime;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="rombel")
public class rombel {
	//Constructor
	public rombel(){}
	
	
	public rombel(int id_ptk, String id_matpel,
			String id_smt, String nm_rommbel, int jml_rommbel,
			int pertemuan_dalam_seminggu) {
		this.setId_matpel(id_matpel);
		this.setId_ptk(id_ptk);
		this.setId_smt(id_smt);
		this.setJml_rommbel(jml_rommbel);
		this.setPertemuan_dalam_seminggu(pertemuan_dalam_seminggu);
		this.setNm_rommbel(nm_rommbel);
	}


	@Id
	@GeneratedValue(generator="uuid2")
    @GenericGenerator(name="uuid2", strategy="uuid2")
	@Column(name = "ID_ROMBEL")
	private String id_rombel;
	
	@Column(name="ID_PTK")
	//@ManyToOne(fetch = FetchType.LAZY)
	private int id_ptk;
	
	@Column(name="ID_MATPEL")
	//@ManyToOne(fetch = FetchType.LAZY)
	private String id_matpel;
	
	@Column(name="ID_SMT")
	//@ManyToOne(fetch = FetchType.LAZY)
	private String id_smt;
	
	@Column(name="NM_ROMBBEL")
	private String nm_rommbel;
	
	@Column(name="JML_ROMBBEL")
	private int jml_rommbel;
	
	@Column(name="PERTEMUAN_DALAM_SEMINGGU")
	private int pertemuan_dalam_seminggu;
	
	/*Default Attribute*/

	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###

	public String getId_rombel() {
		return id_rombel;
	}


	public void setId_rombel(String id_rombel) {
		this.id_rombel = id_rombel;
	}


	public int getId_ptk() {
		return id_ptk;
	}


	public void setId_ptk(int id_ptk2) {
		this.id_ptk = id_ptk2;
	}


	public String getId_matpel() {
		return id_matpel;
	}


	public void setId_matpel(String id_matpel) {
		this.id_matpel = id_matpel;
	}


	public String getId_smt() {
		return id_smt;
	}


	public void setId_smt(String id_smt) {
		this.id_smt = id_smt;
	}


	public String getNm_rommbel() {
		return nm_rommbel;
	}


	public void setNm_rommbel(String nm_rommbel) {
		this.nm_rommbel = nm_rommbel;
	}


	public int getJml_rommbel() {
		return jml_rommbel;
	}


	public void setJml_rommbel(int jml_rommbel) {
		this.jml_rommbel = jml_rommbel;
	}


	public int getPertemuan_dalam_seminggu() {
		return pertemuan_dalam_seminggu;
	}


	public void setPertemuan_dalam_seminggu(int pertemuan_dalam_seminggu) {
		this.pertemuan_dalam_seminggu = pertemuan_dalam_seminggu;
	}

}
