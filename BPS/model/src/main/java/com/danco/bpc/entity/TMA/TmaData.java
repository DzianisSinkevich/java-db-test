package com.danco.bpc.entity.TMA;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "TMA_DATA", catalog = "mkyong")
@Entity
public class TmaData extends AbstractBaseEntity implements java.io.Serializable, Comparable<TmaData> {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "STARTED")
	private Calendar started;
	@Column(name = "ENDED")
	private Calendar ended;
	@Column(name = "PRIORITY")
	private Boolean priority;
	@Column(name = "ACQ_SESSION_ID")
	private int acqSessionId;
	@Column(name = "MANUAL_PROCESSED")
	private Boolean manualProcessed;
	@Column(name = "UPLOAD_SESSION_ID")
	private String uploadSessionId;
	@Column(name = "ISS_SESSION_ID")
	private int issSessionId;
	@Column(name = "DCC_VALUE")
	private int dccValue;
	@Column(name = "DCC_DISCREPANCY")
	private Boolean dccDiscrepancy;

	public TmaData() {
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
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

	public Boolean getPriority() {
		return priority;
	}

	public void setPriority(Boolean priority) {
		this.priority = priority;
	}

	public int getAcqSessionId() {
		return acqSessionId;
	}

	public void setAcqSessionId(int acqSessionId) {
		this.acqSessionId = acqSessionId;
	}

	public Boolean getManualProcessed() {
		return manualProcessed;
	}

	public void setManualProcessed(Boolean manualProcessed) {
		this.manualProcessed = manualProcessed;
	}

	public String getUploadSessionId() {
		return uploadSessionId;
	}

	public void setUploadSessionId(String uploadSessionId) {
		this.uploadSessionId = uploadSessionId;
	}

	public int getIssSessionId() {
		return issSessionId;
	}

	public void setIssSessionId(int issSessionId) {
		this.issSessionId = issSessionId;
	}

	public int getDccValue() {
		return dccValue;
	}

	public void setDccValue(int dccValue) {
		this.dccValue = dccValue;
	}

	public Boolean getDccDiscrepancy() {
		return dccDiscrepancy;
	}

	public void setDccDiscrepancy(Boolean dccDiscrepancy) {
		this.dccDiscrepancy = dccDiscrepancy;
	}

	@Override
	public int compareTo(TmaData o) {
		return 0;
	}

}
