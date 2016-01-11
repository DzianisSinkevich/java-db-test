package entity.PRICE;

import java.io.Serializable;

public class PrcFilesErrors implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int fileId;
	private String error;

	public PrcFilesErrors() {
	}

	public PrcFilesErrors(int id, int fileId, String error) {
		this.setId(id);
		this.setFileId(fileId);
		this.setError(error);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
