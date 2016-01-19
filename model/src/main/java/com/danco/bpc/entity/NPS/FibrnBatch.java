package com.danco.bpc.entity.NPS;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "FIBRN_BATCH", catalog = "mkyong")
@Entity
public class FibrnBatch implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "FILE_ID")
	private int fileId;
	@Column(name = "ORIGINATOR")
	private String originator;
	@Column(name = "DESTINATOR")
	private String destinator;
	@Column(name = "FILEDATE")
	private Date fileDate;
	@Column(name = "FILE_SEQUENCE")
	private int fileSequence;
	@Column(name = "FILE_NAME")
	private String fileName;
	@Column(name = "CURRENCY_TYPE")
	private String currencyType;
	@Column(name = "TOTAL_AMOUNT")
	private int totalAmount;
	@Column(name = "NUMBER_OF_RECORDS")
	private int numberOfRecords;
	@Column(name = "NET_AMOUNT")
	private int netAmount;
	@Column(name = "AMOUNT_SIGN")
	private String amountSign;
	@Column(name = "TOTAL_COMMISSIONS")
	private int totalComissions;
	@Column(name = "COMMISSION_SIGN")
	private String comissionSign;
	@Column(name = "APPLICATION_ID")
	private String applicationId;
	@Column(name = "SESSION_ID")
	private String sessionId;
	@Column(name = "RECORDS_TOTAL")
	private int recordsTotal;

	public FibrnBatch() {
	}

	public FibrnBatch(int id, int fileId, String originator, String destinator,
			Date fileDate, int fileSequence, String fileName,
			String currencyType, int totalAmount, int numberOfRecords,
			int netAmount, String amountSign, int totalComissions,
			String comissionSign, String applicationId, String sessionId,
			int recordsTotal) {
		this.setId(id);
		this.setFileId(fileId);
		this.setOriginator(originator);
		this.setDestinator(destinator);
		this.setFileDate(fileDate);
		this.setFileSequence(fileSequence);
		this.setFileName(fileName);
		this.setCurrencyType(currencyType);
		this.setTotalAmount(totalAmount);
		this.setNumberOfRecords(numberOfRecords);
		this.setNetAmount(netAmount);
		this.setAmountSign(amountSign);
		this.setTotalComissions(totalComissions);
		this.setComissionSign(comissionSign);
		this.setApplicationId(applicationId);
		this.setSessionId(sessionId);
		this.setRecordsTotal(recordsTotal);
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

	public void setFileId(int fileId) {
		this.fileId = fileId;
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

	public Date getFileDate() {
		return fileDate;
	}

	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}

	public int getFileSequence() {
		return fileSequence;
	}

	public void setFileSequence(int fileSequence) {
		this.fileSequence = fileSequence;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getNumberOfRecords() {
		return numberOfRecords;
	}

	public void setNumberOfRecords(int numberOfRecords) {
		this.numberOfRecords = numberOfRecords;
	}

	public int getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(int netAmount) {
		this.netAmount = netAmount;
	}

	public String getAmountSign() {
		return amountSign;
	}

	public void setAmountSign(String amountSign) {
		this.amountSign = amountSign;
	}

	public int getTotalComissions() {
		return totalComissions;
	}

	public void setTotalComissions(int totalComissions) {
		this.totalComissions = totalComissions;
	}

	public String getComissionSign() {
		return comissionSign;
	}

	public void setComissionSign(String comissionSign) {
		this.comissionSign = comissionSign;
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

	public int getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
}
