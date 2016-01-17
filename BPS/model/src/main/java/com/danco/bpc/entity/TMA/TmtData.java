package com.danco.bpc.entity.TMA;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "TMT_DATA", catalog = "mkyong")
@Entity
public class TmtData extends AbstractBaseEntity implements java.io.Serializable, Comparable<TmtData> {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "UPLOAD_SESSION_ID")
	private String uploadSessionId;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "STARTED")
	private Calendar started;
	@Column(name = "ENDED")
	private Calendar ended;
	@Column(name = "SESSION_ID")
	private String sessionId;

	public TmtData() {
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getUploadSessionId() {
		return uploadSessionId;
	}

	public void setUploadSessionId(String uploadSessionId) {
		this.uploadSessionId = uploadSessionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Calendar getStarted() {
		return started;
	}

	public void setStarted(Calendar started) {
		this.started = started;
	}

	public Calendar getEnded() {
		return ended;
	}

	public void setEnded(Calendar ended) {
		this.ended = ended;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public int compareTo(TmtData o) {
		return 0;
	}
}
