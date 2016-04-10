package com.danco.bpc.entity.MAIN;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "EVT_EVENT_OBJECT")
@Entity
public class EvtEventObject implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "EVENT_ID")
	private int eventId;
	@Column(name = "PROCEDURE_NAME")
	private String procedureName;
	@Column(name = "ENTITY_TYPE")
	private String entityType;
	@Column(name = "OBJECT_ID")
	private Long objectId;
	@Column(name = "EFF_DATE")
	private Date effDate;
	@Column(name = "EVENT_TIMESTAMP")
	private Date eventTimestamp;
	@Column(name = "INST_ID")
	private int instId;
	@Column(name = "SPLIT_HASH")
	private int splitHash;
	@Column(name = "SESSION_ID")
	private Long sessionId;
	@Column(name = "PROC_SESSION_ID")
	private Long procSessionId;
	@Column(name = "STATUS")
	private String status	;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getProcedureName() {
		return procedureName;
	}
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public Long getObjectId() {
		return objectId;
	}
	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}
	public Date getEffDate() {
		return effDate;
	}
	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}
	public Date getEventTimestamp() {
		return eventTimestamp;
	}
	public void setEventTimestamp(Date eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}
	public int getInstId() {
		return instId;
	}
	public void setInstId(int instId) {
		this.instId = instId;
	}
	public int getSplitHash() {
		return splitHash;
	}
	public void setSplitHash(int splitHash) {
		this.splitHash = splitHash;
	}
	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	public Long getProcSessionId() {
		return procSessionId;
	}
	public void setProcSessionId(Long procSessionId) {
		this.procSessionId = procSessionId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
