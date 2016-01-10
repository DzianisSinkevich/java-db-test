package entity.PRICE;

import java.io.Serializable;
import java.util.Date;

public class PrcTfTotal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int fileId;
	private String sessionId;
	private int totalAmount;

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getStoreDate() {
		return storeDate;
	}

	public void setStoreDate(Date storeDate) {
		this.storeDate = storeDate;
	}

	private Date storeDate;
}
