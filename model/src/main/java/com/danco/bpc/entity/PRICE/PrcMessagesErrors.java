package com.danco.bpc.entity.PRICE;

import java.io.Serializable;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "PRC_MESSAGES_ERRORS")
@Entity
public class PrcMessagesErrors extends AbstractBaseEntity implements java.io.Serializable, Comparable<PrcFiles> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "VERSION")
	private int version;
	@Column(name = "MSG_ID")
	private int msgId;
	@Column(name = "ERROR")
	private String error;

	public PrcMessagesErrors() {
	}

	public PrcMessagesErrors(int instId, int version, int msgId, String error) {
		this.setId(id);
		this.setVersion(version);
		this.setMsgId(msgId);
		this.setError(error);
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

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(PrcFiles o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
