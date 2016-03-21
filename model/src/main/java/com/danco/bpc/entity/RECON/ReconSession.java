package com.danco.bpc.entity.RECON;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.danco.bpc.entity.api.AbstractBaseEntity;

@Table(name = "RECON_SESSION")
@Entity
public class ReconSession extends AbstractBaseEntity implements java.io.Serializable, Comparable<ReconSession> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "SESSION_ID")
	private String sessionId;
	@Column(name = "BREAKPOINT")
	private String breakpoint;
	@Column(name = "CLOSED_AT")
	private Calendar closedAt;
	@Column(name = "DS_LOAD_COUNT")
	private int dsLoadCount;
	@Column(name = "DS_LOAD_COUNT_MAX")
	private int dcLoadCountMax;
	@Column(name = "DS_RELOAD_PERIOD")
	private String dsReloadPeriod;
	@Column(name = "EXECUTED_CASES")
	private String executiveCases;
	@Column(name = "LAST_MSG")
	private String lastMsg;
	@Column(name = "STARTED_AT")
	private Calendar startedAt;
	@Column(name = "STATE")
	private String state;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "TE")
	private int te;
	@Column(name = "TF")
	private int tf;
	@Column(name = "LAST_TOTALS_UPDATED_AT")
	private Calendar lastTotalsUpdatedAt;
	@Column(name = "TR")
	private int tr;
	@Column(name = "TSV")
	private int tsv;
	
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
