package com.danco.bpc.modelAllWeb;

public class ProcessesSession {

	private Long id;
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

	public Long getSsid() {
		return id;
	}

	public ProcessesSession setSsid(Long id) {
		this.id = id;
		return this;
	}

	public String getState() {
		return state;
	}

	public ProcessesSession setState(String state) {
		this.state = state;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public ProcessesSession setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getTe() {
		return te;
	}

	public ProcessesSession setTe(String string) {
		this.te = string;
		return this;
	}

	public String getTr() {
		return tr;
	}

	public ProcessesSession setTr(String tr) {
		this.tr = tr;
		return this;
	}

	@Override
	public String toString() {
		return "Session [ssid=" + id + ", state=" + state + ", status=" + status + ", te=" + te + ", tr=" + tr + ", tsv=" + tsv + ", tf=" + tf + "]";
	}
}
