package com.danco.bpc.entity.PRICE;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "PRC_RAW_MESSAGES")
@Entity
public class PrcRawMessages extends AbstractBaseEntity implements java.io.Serializable, Comparable<PrcRawMessages> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "FILE_ID")
	private Long fileId;
	@Column(name = "LINE")
	private Long line;
	@Column(name = "CREATED_AT")
	private Calendar createdAt;
	@Column(name = "TYPE")
	private String type;
	@Column(name = "SEND_COUNT")
	private int sendCount;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "SESSION_ID")
	private String sessionId;
	@Column(name = "SV_OPER_ID")
	private Long svOperId;
	@Column(name = "SEQUENCE_FILE")
	private Long sequenceFile;
	@Column(name = "SEQUENCE_LOTE")
	private Long sequenceLote;

	public PrcRawMessages() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFileId() {
		return fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

	public Long getLine() {
		return line;
	}

	public void setLine(Long line) {
		this.line = line;
	}

	public Calendar getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Calendar createdAt) {
		this.createdAt = createdAt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSendCount() {
		return sendCount;
	}

	public void setSendCount(int sendCount) {
		this.sendCount = sendCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Long getSvOperId() {
		return svOperId;
	}

	public void setSvOperId(Long svOperId) {
		this.svOperId = svOperId;
	}

	public Long getSequenceFile() {
		return sequenceFile;
	}

	public void setSequenceFile(Long sequenceFile) {
		this.sequenceFile = sequenceFile;
	}

	public Long getSequenceLote() {
		return sequenceLote;
	}

	public void setSequenceLote(Long sequenceLote) {
		this.sequenceLote = sequenceLote;
	}

	@Override
	public int compareTo(PrcRawMessages o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
