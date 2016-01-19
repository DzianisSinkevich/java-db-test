package com.danco.bpc.entity.TMA;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "BATCH_DATA")
@Entity
public class BatchData extends AbstractBaseEntity implements java.io.Serializable, Comparable<BatchData> {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "BATCH_STATUS")
	private String batchStatus;
	@Column(name = "CREATED")
	private Calendar created;
	@Column(name = "SEND")
	private Calendar send;
	@Column(name = "BATCH_SIZE")
	private int batchSize;
	@Column(name = "SESSION_ID")
	private String sessionId;

	public BatchData() {
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public Calendar getCreated() {
		return created;
	}

	public void setCreated(Calendar created) {
		this.created = created;
	}

	public Calendar getSend() {
		return send;
	}

	public void setSend(Calendar send) {
		this.send = send;
	}

	public int getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public int compareTo(BatchData arg0) {
		return 0;
	}
}
