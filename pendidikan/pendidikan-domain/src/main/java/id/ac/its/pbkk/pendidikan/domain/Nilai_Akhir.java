package id.ac.its.pbkk.pendidikan.domain;

import java.util.*;

import org.joda.time.DateTime;
import org.hibernate.annotations.Type;

import java.util.Date;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table (name="nilai_akhir")
public class Nilai_Akhir {
	@Id
	@Column(name ="ID_NILAI_AKHIR")
	private String id_nilai_akhir;
	
	@Column(name ="NILAI_UJIAN_AKHIR")
	private int nilai_ujian_akhir;
	
	@Column(name="NILAI_UAS")
	private int nilai_uas;
	/*Default Attribute*/

	@Column(name = "SOFT_DELETE")
	private int soft_delete;
	
	@Column(name = "CREATE_DATE")
	private String create_date;
	//###
	/*
	 * SETTER and GETTER*/
	
	
	/*Constructor
	 * 
	 * */
	public Nilai_Akhir(){}
	
	public String getId_nilai_akhir() {
		return id_nilai_akhir;
	}
	public void setId_nilai_akhir(String id_nilai_akhir) {
		this.id_nilai_akhir = id_nilai_akhir;
	}
	public int getNilai_ujian_akhir() {
		return nilai_ujian_akhir;
	}
	public void setNilai_ujian_akhir(int nilai_ujian_akhir) {
		this.nilai_ujian_akhir = nilai_ujian_akhir;
	}
	public int getNilai_uas() {
		return nilai_uas;
	}
	public void setNilai_uas(int nilai_uas) {
		this.nilai_uas = nilai_uas;
	}
	
	public int getSoft_delete() {
		return soft_delete;
	}
	public void setSoft_delete(int soft_delete) {
		this.soft_delete = soft_delete;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public Nilai_Akhir(String id_nilai_akhir, int nilai_ujian_akhir,int nilai_uas)
	{
		this.setId_nilai_akhir(id_nilai_akhir);
		this.setNilai_ujian_akhir(nilai_ujian_akhir);
		this.setNilai_uas(nilai_uas);

	}
	 @Override
	    public String toString() {
	    String str1 = "ID Nilai Ujian Akhir : "+id_nilai_akhir+"\n";
	    str1 = str1+"Nilai Ujian Akhir : "+nilai_ujian_akhir+"\n";
	    System.out.println(str1);
	    return str1;
	    }
	
	

}
