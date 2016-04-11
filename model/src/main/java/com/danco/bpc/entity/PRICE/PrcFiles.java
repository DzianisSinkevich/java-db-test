package com.danco.bpc.entity.PRICE;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "PRC_FILES")
@Entity
public class PrcFiles extends AbstractBaseEntity implements java.io.Serializable, Comparable<PrcFiles> {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "FILE_NAME")
	private String fileName;
	@Column(name = "UPLOAD_DATE")
	private Calendar uploadDate;
	@Column(name = "PROCESSING_DATE")
	private Calendar processingDate;
	@Column(name = "TOTAL_RECORDS")
	private Long totalRecords;
	@Column(name = "TOTAL_BATCHES")
	private Long totalBatches;
	@Column(name = "RECEIVED_BATCHES")
	private Long recievedBatches;
	@Column(name = "SESSION_ID")
	private String sessionId;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "TYPE")
	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Calendar getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Calendar uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Calendar getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(Calendar processingDate) {
		this.processingDate = processingDate;
	}

	public Long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}

	public Long getTotalBatches() {
		return totalBatches;
	}

	public void setTotalBatches(Long totalBatches) {
		this.totalBatches = totalBatches;
	}

	public Long getRecievedBatches() {
		return recievedBatches;
	}

	public void setRecievedBatches(Long recievedBatches) {
		this.recievedBatches = recievedBatches;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int compareTo(PrcFiles o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
