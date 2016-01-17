package com.danco.bpc.entity.TMA;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "TMT_SESSION_MESSAGE", catalog = "mkyong")
@Entity
public class TmtSessionMessage extends AbstractBaseEntity implements java.io.Serializable,
Comparable<TmtSessionMessage>{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "TMT_SESSION_ID")
	private int tmtSessionId;
	@Column(name = "CREATED")
	private Date created;
	@Column(name = "UPLOAD_SESSION_ID")
	private String uploadSessionId;
	@Column(name = "SESSION_TYPE")
	private String sessionType;
	@Column(name = "S74")
	private int s74;
	@Column(name = "S75")
	private int s75;
	@Column(name = "S76")
	private int s76;
	@Column(name = "S77")
	private int s77;
	@Column(name = "S86")
	private int s86;
	@Column(name = "S87")
	private int s87;
	@Column(name = "S88")
	private int s88;
	@Column(name = "S89")
	private int s89;
	@Column(name = "S97")
	private int s97;
	@Column(name = "S109")
	private int s109;
	@Column(name = "S110")
	private int s110;
	@Column(name = "S80")
	private int s80;
	@Column(name = "S81")
	private int s81;
	@Column(name = "S85")
	private int s85;
	@Column(name = "S105")
	private int s105;
	@Column(name = "S106")
	private int s106;
	@Column(name = "S107")
	private int s107;
	@Column(name = "S108")
	private int s108;

	public TmtSessionMessage() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTmtSessionId() {
		return tmtSessionId;
	}

	public void setTmtSessionId(int tmtSessionId) {
		this.tmtSessionId = tmtSessionId;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getUploadSessionId() {
		return uploadSessionId;
	}

	public void setUploadSessionId(String uploadSessionId) {
		this.uploadSessionId = uploadSessionId;
	}

	public String getSessionType() {
		return sessionType;
	}

	public void setSessionType(String sessionType) {
		this.sessionType = sessionType;
	}

	public int getS74() {
		return s74;
	}

	public void setS74(int s74) {
		this.s74 = s74;
	}

	public int getS75() {
		return s75;
	}

	public void setS75(int s75) {
		this.s75 = s75;
	}

	public int getS76() {
		return s76;
	}

	public void setS76(int s76) {
		this.s76 = s76;
	}

	public int getS77() {
		return s77;
	}

	public void setS77(int s77) {
		this.s77 = s77;
	}

	public int getS86() {
		return s86;
	}

	public void setS86(int s86) {
		this.s86 = s86;
	}

	public int getS87() {
		return s87;
	}

	public void setS87(int s87) {
		this.s87 = s87;
	}

	public int getS88() {
		return s88;
	}

	public void setS88(int s88) {
		this.s88 = s88;
	}

	public int getS89() {
		return s89;
	}

	public void setS89(int s89) {
		this.s89 = s89;
	}

	public int getS97() {
		return s97;
	}

	public void setS97(int s97) {
		this.s97 = s97;
	}

	public int getS109() {
		return s109;
	}

	public void setS109(int s109) {
		this.s109 = s109;
	}

	public int getS110() {
		return s110;
	}

	public void setS110(int s110) {
		this.s110 = s110;
	}

	public int getS80() {
		return s80;
	}

	public void setS80(int s80) {
		this.s80 = s80;
	}

	public int getS81() {
		return s81;
	}

	public void setS81(int s81) {
		this.s81 = s81;
	}

	public int getS85() {
		return s85;
	}

	public void setS85(int s85) {
		this.s85 = s85;
	}

	public int getS105() {
		return s105;
	}

	public void setS105(int s105) {
		this.s105 = s105;
	}

	public int getS106() {
		return s106;
	}

	public void setS106(int s106) {
		this.s106 = s106;
	}

	public int getS107() {
		return s107;
	}

	public void setS107(int s107) {
		this.s107 = s107;
	}

	public int getS108() {
		return s108;
	}

	public void setS108(int s108) {
		this.s108 = s108;
	}

	@Override
	public int compareTo(TmtSessionMessage o) {
		return 0;
	}

}
