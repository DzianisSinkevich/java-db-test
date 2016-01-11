package entity.NPS;

import java.io.Serializable;
import java.util.Date;

public class BatchFile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String fileName;
	private int fileSize;
	private String fileStatus;
	private Date started;
	private Date ended;
	private String fileType;

	public BatchFile() {
	}

	public BatchFile(int id, String fileName, int fileSize, String fileStatus, Date started, Date ended, String fileType) {
		this.setId(id);
		this.setFileName(fileName);
		this.setFileSize(fileSize);
		this.setFileStatus(fileStatus);
		this.setStarted(started);
		this.setEnded(ended);
		this.setFileType(fileType);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	public Date getStarted() {
		return started;
	}

	public void setStarted(Date started) {
		this.started = started;
	}

	public Date getEnded() {
		return ended;
	}

	public void setEnded(Date ended) {
		this.ended = ended;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
}
