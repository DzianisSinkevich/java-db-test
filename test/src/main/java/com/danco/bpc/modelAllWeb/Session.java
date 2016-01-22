package com.danco.bpc.modelAllWeb;

public class Session {

	private String ssid;
	private String state;
	private String status;
	private String te;
	private String tr;
	private String tsv;
	private String tf;

	public String getTsv() {
		return tsv;
	}

	public void setTsv(String tsv) {
		this.tsv = tsv;
	}

	public String getTf() {
		return tf;
	}

	public void setTf(String tf) {
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

	public String getTe() {
		return te;
	}

	public Session setTe(String string) {
		this.te = string;
		return this;
	}

	public String getTr() {
		return tr;
	}

	public Session setTr(String tr) {
		this.tr = tr;
		return this;
	}

	@Override
	public String toString() {
		return "Session [ssid=" + ssid + ", state=" + state + ", status=" + status + ", te=" + te + ", tr=" + tr + ", tsv=" + tsv + ", tf=" + tf + "]";
	}
}
