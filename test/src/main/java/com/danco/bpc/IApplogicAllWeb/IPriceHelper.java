package com.danco.bpc.IApplogicAllWeb;

import java.util.ArrayList;

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

	public void rejectRecord(String id) throws InterruptedException;

	public void recordClick(String id) throws InterruptedException;

	public void startSearch() throws InterruptedException;

	public void filterClear() throws InterruptedException;

	public ArrayList<String> getErrorsId() throws InterruptedException;
}
