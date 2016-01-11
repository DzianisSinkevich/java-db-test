package entity.TMA;

import java.io.Serializable;
import java.util.Date;

public class TmaData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String status;
	private Date started;
	private Date ended;
	private int priority;
	private int acqSessionId;
	private int manualProcessed;
	private String uploadSessionId;
	private int issSessionId;
	private int dccValue;
	private int dccDiscrepancy;

	public TmaData() {
	}

	public TmaData(int id, String status, Date started, Date ended, int priority, int acqSessionId, int manualProcessed, String uploadSessionId,
			int issSessionId, int dccValue, int dccDiscrepancy) {
		this.setId(id);
		this.setStatus(status);
		this.setStarted(started);
		this.setEnded(ended);
		this.setPriority(priority);
		this.setAcqSessionId(acqSessionId);
		this.setManualProcessed(manualProcessed);
		this.setUploadSessionId(uploadSessionId);
		this.setIssSessionId(issSessionId);
		this.setDccValue(dccValue);
		this.setDccDiscrepancy(dccDiscrepancy);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStarted() {
		return started;
	}

	public void setStarted(Date started) {
		this.started = started;
	}

	public Date getEnded() {
		return ended;
	}

	public void setEnded(Date ended) {
		this.ended = ended;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getAcqSessionId() {
		return acqSessionId;
	}

	public void setAcqSessionId(int acqSessionId) {
		this.acqSessionId = acqSessionId;
	}

	public int getManualProcessed() {
		return manualProcessed;
	}

	public void setManualProcessed(int manualProcessed) {
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

	public int getDccDiscrepancy() {
		return dccDiscrepancy;
	}

	public void setDccDiscrepancy(int dccDiscrepancy) {
		this.dccDiscrepancy = dccDiscrepancy;
	}
}
