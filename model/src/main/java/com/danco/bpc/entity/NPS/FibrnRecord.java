package com.danco.bpc.entity.NPS;

import java.io.Serializable;

public class FibrnRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int fileId;
	private String recordType;

	public FibrnRecord() {
	}

	public FibrnRecord(int id, int fileId, String recordType) {
		this.setId(id);
		this.setFileId(fileId);
		this.setRecordType(recordType);
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

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
}
