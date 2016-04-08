package com.danco.bpc.entity.MAIN;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PRC_SESSION")
@Entity
public class PrcSession implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "PROCESS_ID")
	private Long processId;
	@Column(name = "PARENT_ID")
	private Long parentId;
	@Column(name = "START_TIME")
	private Date startTime;
	@Column(name = "END_TIME")
	private Date endTime;
	@Column(name = "THREAD_COUNT")
	private int threadCount;
	@Column(name = "ESTIMATED_COUNT")
	private Long estimatedCount;
	@Column(name = "PROCESSED")
	private Long processed;
	@Column(name = "REJECTED")
	private Long rejected;
	@Column(name = "EXCEPTED")
	private Long escepted;
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "RESULT_CODE")
	private String resultCode;
	@Column(name = "INST_ID")
	private int instId;
	@Column(name = "STTL_DAY")
	private Long sttlDay;
	@Column(name = "STTL_DATE")
	private Date sttlDate;
	@Column(name = "IP_ADDRESS")
	private String ipAddress;

	public PrcSession() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProcessId() {
		return processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
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

	public Long getEstimatedCount() {
		return estimatedCount;
	}

	public void setEstimatedCount(Long estimatedCount) {
		this.estimatedCount = estimatedCount;
	}

	public Long getProcessed() {
		return processed;
	}

	public void setProcessed(Long processed) {
		this.processed = processed;
	}

	public Long getRejected() {
		return rejected;
	}

	public void setRejected(Long rejected) {
		this.rejected = rejected;
	}

	public Long getEscepted() {
		return escepted;
	}

	public void setEscepted(Long escepted) {
		this.escepted = escepted;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
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

	public Long getSttlDay() {
		return sttlDay;
	}

	public void setSttlDay(Long sttlDay) {
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
