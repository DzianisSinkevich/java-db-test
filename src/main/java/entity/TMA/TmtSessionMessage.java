package entity.TMA;

import java.io.Serializable;
import java.util.Date;

public class TmtSessionMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int tmtSessionId;
	private Date created;
	private String uploadSessionId;
	private String sessionType;
	private int s74;
	private int s75;
	private int s76;
	private int s77;
	private int s86;
	private int s87;
	private int s88;
	private int s89;
	private int s97;
	private int s109;
	private int s110;
	private int s80;
	private int s81;
	private int s85;
	private int s105;
	private int s106;
	private int s107;
	private int s108;

	public TmtSessionMessage() {
	}

	public TmtSessionMessage(int id, int tmtSessionId, Date created, String uploadSessionId, String sessionType, int s74, int s75, int s76, int s77, int s86,
			int s87, int s88, int s89, int s97, int s109, int s110, int s80, int s81, int s85, int s105, int s106, int s107, int s108) {
		super();
		this.id = id;
		this.tmtSessionId = tmtSessionId;
		this.created = created;
		this.uploadSessionId = uploadSessionId;
		this.sessionType = sessionType;
		this.s74 = s74;
		this.s75 = s75;
		this.s76 = s76;
		this.s77 = s77;
		this.s86 = s86;
		this.s87 = s87;
		this.s88 = s88;
		this.s89 = s89;
		this.s97 = s97;
		this.s109 = s109;
		this.s110 = s110;
		this.s80 = s80;
		this.s81 = s81;
		this.s85 = s85;
		this.s105 = s105;
		this.s106 = s106;
		this.s107 = s107;
		this.s108 = s108;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTmtSessionId() {
		return tmtSessionId;
	}

	public void setTmtSessionId(int tmtSessionId) {
		this.tmtSessionId = tmtSessionId;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getUploadSessionId() {
		return uploadSessionId;
	}

	public void setUploadSessionId(String uploadSessionId) {
		this.uploadSessionId = uploadSessionId;
	}

	public String getSessionType() {
		return sessionType;
	}

	public void setSessionType(String sessionType) {
		this.sessionType = sessionType;
	}

	public int getS74() {
		return s74;
	}

	public void setS74(int s74) {
		this.s74 = s74;
	}

	public int getS75() {
		return s75;
	}

	public void setS75(int s75) {
		this.s75 = s75;
	}

	public int getS76() {
		return s76;
	}

	public void setS76(int s76) {
		this.s76 = s76;
	}

	public int getS77() {
		return s77;
	}

	public void setS77(int s77) {
		this.s77 = s77;
	}

	public int getS86() {
		return s86;
	}

	public void setS86(int s86) {
		this.s86 = s86;
	}

	public int getS87() {
		return s87;
	}

	public void setS87(int s87) {
		this.s87 = s87;
	}

	public int getS88() {
		return s88;
	}

	public void setS88(int s88) {
		this.s88 = s88;
	}

	public int getS89() {
		return s89;
	}

	public void setS89(int s89) {
		this.s89 = s89;
	}

	public int getS97() {
		return s97;
	}

	public void setS97(int s97) {
		this.s97 = s97;
	}

	public int getS109() {
		return s109;
	}

	public void setS109(int s109) {
		this.s109 = s109;
	}

	public int getS110() {
		return s110;
	}

	public void setS110(int s110) {
		this.s110 = s110;
	}

	public int getS80() {
		return s80;
	}

	public void setS80(int s80) {
		this.s80 = s80;
	}

	public int getS81() {
		return s81;
	}

	public void setS81(int s81) {
		this.s81 = s81;
	}

	public int getS85() {
		return s85;
	}

	public void setS85(int s85) {
		this.s85 = s85;
	}

	public int getS105() {
		return s105;
	}

	public void setS105(int s105) {
		this.s105 = s105;
	}

	public int getS106() {
		return s106;
	}

	public void setS106(int s106) {
		this.s106 = s106;
	}

	public int getS107() {
		return s107;
	}

	public void setS107(int s107) {
		this.s107 = s107;
	}

	public int getS108() {
		return s108;
	}

	public void setS108(int s108) {
		this.s108 = s108;
	}

}