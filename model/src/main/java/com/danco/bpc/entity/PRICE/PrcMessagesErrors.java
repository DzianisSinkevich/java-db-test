package com.danco.bpc.entity.PRICE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "PRC_MESSAGES_ERRORS")
@Entity
public class PrcMessagesErrors extends AbstractBaseEntity implements java.io.Serializable, Comparable<PrcMessagesErrors> {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "VERSION")
	private Long version;
	@Column(name = "MSG_ID")
	private Long msgId;
	@Column(name = "ERROR")
	private String error;

	public PrcMessagesErrors() {
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getMsgId() {
		return msgId;
	}

	public void setMsgId(int msgId) {
		this.msgId = (long) msgId;
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
	public int compareTo(PrcMessagesErrors arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
