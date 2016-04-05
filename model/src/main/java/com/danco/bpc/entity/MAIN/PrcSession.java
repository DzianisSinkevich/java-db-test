package com.danco.bpc.entity.MAIN;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PRC_SESSION", catalog = "mkyong")
@Entity
public class PrcSession implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "PROCESS_ID")
	private int processId;
	@Column(name = "PARENT_ID")
	private int parentId;
	@Column(name = "START_TIME")
	private Date startTime;
	@Column(name = "END_TIME")
	private Date endTime;
	@Column(name = "THREAD_COUNT")
	private int threadCount;
	@Column(name = "ESTIMATED_COUNT")
	private int estimatedCount;
	@Column(name = "PROCESSED")
	private int processed;
	@Column(name = "REJECTED")
	private int rejected;
	@Column(name = "EXCEPTED")
	private int escepted;
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "RESULT_CODE")
	private String resultCode;
	@Column(name = "INST_ID")
	private int instId;
	@Column(name = "STTL_DAY")
	private int sttlDay;
	@Column(name = "STTL_DATE")
	private Date sttlDate;
	@Column(name = "IP_ADDRESS")
	private String ipAddress;

	public PrcSession() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProcessId() {
		return processId;
	}

	public void setProcessId(int processId) {
		this.processId = processId;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getThreadCount() {
		return threadCount;
	}

	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}

	public int getEstimatedCount() {
		return estimatedCount;
	}

	public void setEstimatedCount(int estimatedCount) {
		this.estimatedCount = estimatedCount;
	}

	public int getProcessed() {
		return processed;
	}

	public void setProcessed(int processed) {
		this.processed = processed;
	}

	public int getRejected() {
		return rejected;
	}

	public void setRejected(int rejected) {
		this.rejected = rejected;
	}

	public int getEscepted() {
		return escepted;
	}

	public void setEscepted(int escepted) {
		this.escepted = escepted;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public int getInstId() {
		return instId;
	}

	public void setInstId(int instId) {
		this.instId = instId;
	}

	public int getSttlDay() {
		return sttlDay;
	}

	public void setSttlDay(int sttlDay) {
		this.sttlDay = sttlDay;
	}

	public Date getSttlDate() {
		return sttlDate;
	}

	public void setSttlDate(Date sttlDate) {
		this.sttlDate = sttlDate;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
}
