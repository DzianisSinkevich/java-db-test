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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "FILE_NAME")
	private String fileName;
	@Column(name = "UPLOAD_DATE")
	private Calendar uploadDate;
	@Column(name = "PROCESSING_DATE")
	private Calendar processingDate;
	@Column(name = "TOTAL_RECORDS")
	private int totalRecords;
	@Column(name = "TOTAL_BATCHES")
	private int totalBatches;
	@Column(name = "RECIEVED_BATCHES")
	private int recievedBatches;
	@Column(name = "SESSION_ID")
	private String sessionId;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "TYPE")
	private String type;

	public PrcFiles() {
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

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getTotalBatches() {
		return totalBatches;
	}

	public void setTotalBatches(int totalBatches) {
		this.totalBatches = totalBatches;
	}

	public int getRecievedBatches() {
		return recievedBatches;
	}

	public void setRecievedBatches(int recievedBatches) {
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
