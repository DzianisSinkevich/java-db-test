package com.danco.bpc.modelDB;

public class PriceFile {

	private Long id;
	private int threadCount;
	private Long estimatedCount;
	private Long processed;
	private Long rejected;
	private Long excepted;

	@Override
	public String toString() {
		return "Session [ID=" + id + ", threadCount=" + threadCount + ", estimatedCount=" + estimatedCount + ", processed=" + processed + ", rejected="
				+ rejected + ", excepted=" + excepted + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getThreadCount() {
		return threadCount;
	}

	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}

	public Long getEstimatedCount() {
		return estimatedCount;
	}

	public void setEstimatedCount(Long estimatedCount) {
		this.estimatedCount = estimatedCount;
	}

	public Long getProcessed() {
		return processed;
	}

	public void setProcessed(Long processed) {
		this.processed = processed;
	}

	public Long getRejected() {
		return rejected;
	}

	public void setRejected(Long rejected) {
		this.rejected = rejected;
	}

	public Long getExcepted() {
		return excepted;
	}

	public void setExcepted(Long excepted) {
		this.excepted = excepted;
	}
}
