package entity.NPS;

import java.io.Serializable;
import java.sql.Date;

public class MusBatch implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int fileId;
	private String originator;
	private String destinator;
	private String dataRecord;
	private String sessionNumber;
	private Date transactionDateTime;
	private String applicationId;
	private String sessionId;
	private int s74;
	private int s75;
	private int s76;
	private int s77;
	private int s80;
	private int s81;
	private int s86;
	private int s87;
	private int s88;
	private int s89;
	private int s97;
	private int s109;
	private int s110;

	public MusBatch() {
	}

	public MusBatch(int id, int fileId, String originator, String destinator, String dataRecord, String sessionNumber, Date transactionDateTime,
			String applicationId, String sessionId, int s74, int s75, int s76, int s77, int s80, int s81, int s86, int s87, int s88, int s89, int s97, int s109,
			int s110) {
		this.setId(id);
		this.setFileId(fileId);
		this.setOriginator(originator);
		this.setDestinator(destinator);
		this.setDataRecord(dataRecord);
		this.setSessionNumber(sessionNumber);
		this.setTransactionDateTime(transactionDateTime);
		this.setApplicationId(applicationId);
		this.setSessionId(sessionId);
		this.setS74(s74);
		this.setS74(s75);
		this.setS74(s76);
		this.setS74(s77);
		this.setS74(s80);
		this.setS74(s81);
		this.setS74(s86);
		this.setS74(s87);
		this.setS74(s88);
		this.setS74(s89);
		this.setS74(s97);
		this.setS74(s109);
		this.setS74(s110);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fielId) {
		this.fileId = fielId;
	}

	public String getOriginator() {
		return originator;
	}

	public void setOriginator(String originator) {
		this.originator = originator;
	}

	public String getDestinator() {
		return destinator;
	}

	public void setDestinator(String destinator) {
		this.destinator = destinator;
	}

	public String getDataRecord() {
		return dataRecord;
	}

	public void setDataRecord(String dataRecord) {
		this.dataRecord = dataRecord;
	}

	public String getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(String sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

	public Date getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(Date transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public int getS74() {
		return s74;
	}

	public void setS74(int s74) {
		this.s74 = s74;
	}

	public int getS75() {
		return s75;
	}

	public void setS75(int s75) {
		this.s75 = s75;
	}

	public int getS76() {
		return s76;
	}

	public void setS76(int s76) {
		this.s76 = s76;
	}

	public int getS77() {
		return s77;
	}

	public void setS77(int s77) {
		this.s77 = s77;
	}

	public int getS80() {
		return s80;
	}

	public void setS80(int s80) {
		this.s80 = s80;
	}

	public int getS81() {
		return s81;
	}

	public void setS81(int s81) {
		this.s81 = s81;
	}

	public int getS86() {
		return s86;
	}

	public void setS86(int s86) {
		this.s86 = s86;
	}

	public int getS87() {
		return s87;
	}

	public void setS87(int s87) {
		this.s87 = s87;
	}

	public int getS88() {
		return s88;
	}

	public void setS88(int s88) {
		this.s88 = s88;
	}

	public int getS89() {
		return s89;
	}

	public void setS89(int s89) {
		this.s89 = s89;
	}

	public int getS97() {
		return s97;
	}

	public void setS97(int s97) {
		this.s97 = s97;
	}

	public int getS109() {
		return s109;
	}

	public void setS109(int s109) {
		this.s109 = s109;
	}

	public int getS110() {
		return s110;
	}

	public void setS110(int s110) {
		this.s110 = s110;
	}
}