package entity.NPS;

import java.io.Serializable;
public class EditTransRules implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fileType;
	private int addIndex;
	private String fieldName;
	private String formatFieldName;
	private String fieldComment;
	private int fieldType;

	public EditTransRules() {
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public int getAddIndex() {
		return addIndex;
	}

	public void setAddIndex(int addIndex) {
		this.addIndex = addIndex;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFormatFieldName() {
		return formatFieldName;
	}

	public void setFormatFieldName(String formatFieldName) {
		this.formatFieldName = formatFieldName;
	}

	public String getFieldComment() {
		return fieldComment;
	}

	public void setFieldComment(String fieldComment) {
		this.fieldComment = fieldComment;
	}

	public int getFieldType() {
		return fieldType;
	}

	public void setFieldType(int fieldType) {
		this.fieldType = fieldType;
	}
}
