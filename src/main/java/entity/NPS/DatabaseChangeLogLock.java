package entity.NPS;

import java.io.Serializable;
import java.sql.Date;

public class DatabaseChangeLogLock implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int locked;
	private Date lockGranted;
	private String lockedBy;

	public DatabaseChangeLogLock() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLocked() {
		return locked;
	}

	public void setLocked(int locked) {
		this.locked = locked;
	}

	public Date getLockGranted() {
		return lockGranted;
	}

	public void setLockGranted(Date lockGranted) {
		this.lockGranted = lockGranted;
	}

	public String getLockedBy() {
		return lockedBy;
	}

	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}
}
