package entity.PRICE;

import java.io.Serializable;
import java.util.Date;

public class PrcFiles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String fileName;
	private Date uploadDate;
	private Date processingDate;
	private int totalRecords;
	private int totalBatches;
	private int recievedBatches;
	private String sessionId;
	private String status;
	private String type;

	public PrcFiles() {
	}

	public PrcFiles(int id, String fileName, Date uploadDate, Date processingDate, int totalRecords, int totalBatches, int recievedBatches, String sessionId,
			String status, String type) {
		this.setId(id);
		this.setFileName(fileName);
		this.setUploadDate(uploadDate);
		this.setProcessingDate(processingDate);
		this.setTotalRecords(totalRecords);
		this.setTotalBatches(totalBatches);
		this.setRecievedBatches(recievedBatches);
		this.setSessionId(sessionId);
		this.setStatus(status);
		this.setType(type);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Date getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(Date processingDate) {
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
}
