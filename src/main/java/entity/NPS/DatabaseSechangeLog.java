package entity.NPS;

import java.io.Serializable;
import java.sql.Date;

public class DatabaseSechangeLog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String author;
	private String filename;
	private Date dateExecuted;
	private String erderExecuted;
	private String execType;
	private String md5sum;
	private String description;
	private String comments;
	private String tag;
	private String liquiBase;
	private String contexs;
	private String labels;

	public DatabaseSechangeLog() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Date getDateExecuted() {
		return dateExecuted;
	}

	public void setDateExecuted(Date dateExecuted) {
		this.dateExecuted = dateExecuted;
	}

	public String getErderExecuted() {
		return erderExecuted;
	}

	public void setErderExecuted(String erderExecuted) {
		this.erderExecuted = erderExecuted;
	}

	public String getExecType() {
		return execType;
	}

	public void setExecType(String execType) {
		this.execType = execType;
	}

	public String getMd5sum() {
		return md5sum;
	}

	public void setMd5sum(String md5sum) {
		this.md5sum = md5sum;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getLiquiBase() {
		return liquiBase;
	}

	public void setLiquiBase(String liquiBase) {
		this.liquiBase = liquiBase;
	}

	public String getContexs() {
		return contexs;
	}

	public void setContexs(String contexs) {
		this.contexs = contexs;
	}

	public String getLabels() {
		return labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}
}
