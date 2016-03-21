package com.danco.bpc.entity.PRICE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "PRC_INST")
@Entity
public class PrcInst extends AbstractBaseEntity implements java.io.Serializable, Comparable<PrcFiles> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "INST_ID")
	private int instId;
	@Column(name = "IS_ACTIVE")
	private int isActive;

	public PrcInst() {
	}

	public PrcInst(int instId, int isActive) {
		this.setInstId(instId);
		this.setIsActive(isActive);
	}

	public int getInstId() {
		return instId;
	}

	public void setInstId(int instId) {
		this.instId = instId;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
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
