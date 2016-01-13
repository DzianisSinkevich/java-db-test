package entity.TMA;

import java.io.Serializable;
import java.util.Date;

public class BatchData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String batchStatus;
	private Date created;
	private Date send;
	private int batchSize;
	private String sessionId;

	public BatchData() {
	}

	public BatchData(int id, String batchStatus, Date created, Date send, int batchSize, String sessionId) {
		this.setId(id);
		this.setBatchStatus(batchStatus);
		this.setCreated(created);
		this.setSend(send);
		this.setBatchSize(batchSize);
		this.setSessionId(sessionId);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getSend() {
		return send;
	}

	public void setSend(Date send) {
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
}
