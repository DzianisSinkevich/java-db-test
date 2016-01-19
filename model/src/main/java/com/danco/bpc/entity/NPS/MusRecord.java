package com.danco.bpc.entity.NPS;

import java.io.Serializable;
import java.sql.Date;

public class MusRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String recordStatus;
	private Date started;

	public MusRecord() {
	}

	public MusRecord(int id, String recordStatus, Date started) {
		this.setId(id);
		this.setRecordStatus(recordStatus);
		this.setStarted(started);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	public Date getStarted() {
		return started;
	}

	public void setStarted(Date started) {
		this.started = started;
	}
}
