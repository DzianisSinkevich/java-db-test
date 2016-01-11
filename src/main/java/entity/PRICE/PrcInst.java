package entity.PRICE;

import java.io.Serializable;

public class PrcInst implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int instId;
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
}
