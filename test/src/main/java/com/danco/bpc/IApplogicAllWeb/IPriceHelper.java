package com.danco.bpc.IApplogicAllWeb;

public interface IPriceHelper {

	public void enterDates() throws InterruptedException;
	
	public boolean compareRecordsCount(String countInDB) throws InterruptedException;
	
	public String getCurrentYear();
	
	public String getCurrentMonth();
	
	public String getCurrentDayOfMonth();
	
	public void tabClicker() throws InterruptedException;
	
	public void firstRecordSelect() throws InterruptedException;
	
	public String getFirstRecordId() throws InterruptedException;
	
	public void filterStatusSelecter(String status) throws InterruptedException;
	
	public void searchClick() throws InterruptedException;
	
	public void rejectFirstRecord() throws InterruptedException;
}
