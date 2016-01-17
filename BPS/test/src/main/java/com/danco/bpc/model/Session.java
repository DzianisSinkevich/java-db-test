package com.danco.bpc.model;

public class Session {

	private String ssid;
	private String state;
	private String status;
	private int te;
	private int tr;
	private int tsv;
	private int tf;

	public int getTsv() {
		return tsv;
	}

	public void setTsv(int tsv) {
		this.tsv = tsv;
	}

	public int getTf() {
		return tf;
	}

	public void setTf(int tf) {
		this.tf = tf;
	}

	public String getSsid() {
		return ssid;
	}

	public Session setSsid(String id) {
		this.ssid = id;
		return this;
	}

	public String getState() {
		return state;
	}

	public Session setState(String state) {
		this.state = state;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public Session setStatus(String status) {
		this.status = status;
		return this;
	}

	public int getTe() {
		return te;
	}

	public Session setTe(int te) {
		this.te = te;
		return this;
	}

	public int getTr() {
		return tr;
	}

	public Session setTr(int tr) {
		this.tr = tr;
		return this;
	}
}
