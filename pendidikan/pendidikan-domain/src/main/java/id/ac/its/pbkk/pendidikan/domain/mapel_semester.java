package id.ac.its.pbkk.pendidikan.domain;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import java.util.*;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "mapel_semester")
public class mapel_semester {

	/*Constructor*/
	public mapel_semester(){}
	
	
	
	public mapel_semester(String id_mapel_semester, String id_matpel,
			String id_smt) {
		this.setId_mapel_semester(id_mapel_semester);
		this.setId_matpel(id_matpel);
		this.setId_smt(id_smt);

	}



	@Id
	@Column(name="ID_MAPEL_SEMESTER")
	private String id_mapel_semester;
	
	@Column(name="ID_MATPEL",nullable =false)
	//@ManyToOne(fetch = FetchType.LAZY)
	private String id_matpel;
	
	@Column(name="ID_SMT",nullable=false)
	//@ManyToOne(fetch = FetchType.LAZY)
	private String id_smt;

	/*Default Attribute*/

	@Column(name = "SOFT_DELETE", nullable = true)
	private boolean soft_delete;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "CREATE_DATE", nullable = true)
	private DateTime create_date;
	//###

	public String getId_mapel_semester() {
		return id_mapel_semester;
	}



	public void setId_mapel_semester(String id_mapel_semester) {
		this.id_mapel_semester = id_mapel_semester;
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
	
	
	
	
}
