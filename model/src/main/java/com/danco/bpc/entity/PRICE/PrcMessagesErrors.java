package com.danco.bpc.entity.PRICE;

import java.io.Serializable;

public class PrcMessagesErrors implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int version;
	private int msgId;
	private String error;

	public PrcMessagesErrors() {
	}

	public PrcMessagesErrors(int instId, int version, int msgId, String error) {
		this.setId(id);
		this.setVersion(version);
		this.setMsgId(msgId);
		this.setError(error);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getMsgId() {
		return msgId;
	}

	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}