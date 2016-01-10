package entity.PRICE;

import java.io.Serializable;
import java.util.Date;

public class PrcRawMessages implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int fileId;
	private int line;
	private Date createdAt;
	private String type;

	public int getId() {
		return id;
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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
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

	private int sendCount;
	private String status;
	private String sessionId;
	private int svOperId;
	private int sequenceFile;
	private int sequinceLote;
}
