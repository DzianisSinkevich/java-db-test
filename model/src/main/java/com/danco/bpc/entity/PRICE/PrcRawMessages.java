package com.danco.bpc.entity.PRICE;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "PRC_RAW_MESSAGES")
@Entity
public class PrcRawMessages extends AbstractBaseEntity implements java.io.Serializable, Comparable<PrcFiles> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "FILE_ID")
	private int fileId;
	@Column(name = "LINE")
	private int line;
	@Column(name = "CREATE_AT")
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
	private int svOperId;
	@Column(name = "SEQUENCE_FILE")
	private int sequenceFile;
	@Column(name = "SEQUINCE_LOTE")
	private int sequinceLote;

	public PrcRawMessages() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
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

	public int getSvOperId() {
		return svOperId;
	}

	public void setSvOperId(int svOperId) {
		this.svOperId = svOperId;
	}

	public int getSequenceFile() {
		return sequenceFile;
	}

	public void setSequenceFile(int sequenceFile) {
		this.sequenceFile = sequenceFile;
	}

	public int getSequinceLote() {
		return sequinceLote;
	}

	public void setSequinceLote(int sequinceLote) {
		this.sequinceLote = sequinceLote;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(PrcFiles o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
