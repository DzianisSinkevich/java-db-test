package com.danco.bpc.IApplogicAllWeb;

public interface IPriceHelper {

	public void enterDates() throws InterruptedException;
	
	public boolean compareRecordsCount(String countInDB) throws InterruptedException;
	
	public String getCurrentYear();
	
	public String getCurrentMonth();
	
	public String getCurrentDayOfMonth();
}
