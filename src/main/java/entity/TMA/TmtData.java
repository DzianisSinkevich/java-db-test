package entity.TMA;

import java.io.Serializable;
import java.util.Date;

public class TmtData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String uploadSessionId;
	private String status;
	private Date started;
	private Date ended;
	private String sessionId;

	public TmtData() {
	}

	public TmtData(int id, String uploadSessionId, String status, Date started, Date ended, String sessionId) {
		this.setId(id);
		this.setUploadSessionId(uploadSessionId);
		this.setStatus(status);
		this.setStarted(started);
		this.setEnded(ended);
		this.setSessionId(sessionId);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUploadSessionId() {
		return uploadSessionId;
	}

	public void setUploadSessionId(String uploadSessionId) {
		this.uploadSessionId = uploadSessionId;
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

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
}
