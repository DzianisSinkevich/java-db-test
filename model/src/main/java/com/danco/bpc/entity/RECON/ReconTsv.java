package com.danco.bpc.entity.RECON;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "PRC_TF_TOTAL")
@Entity
public class ReconTsv extends AbstractBaseEntity implements java.io.Serializable, Comparable<ReconSession> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "SESSION_ID")
	private String sessionId;
	@Column(name = "TOTAL_CODE")
	private String totalCode;
	@Column(name = "VALUE")
	private int value;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
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
	public int compareTo(ReconSession o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
