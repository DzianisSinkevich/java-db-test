package com.danco.bpc.applogicAllWeb;

import java.util.ArrayList;
import java.util.Calendar;

import com.danco.bpc.IApplogicAllWeb.IPriceHelper;

public class PriceHelper extends DriverBasedHelper implements IPriceHelper {

	public PriceHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}

	@Override
	public void enterDates() throws InterruptedException {
		pages.iOOperationsPricePage.filterDateFromClick().calendarFromTodayClick();
		// pages.iOOperationsPricePage.calendarFromYearSelector(getCurrentYear());
		// pages.iOOperationsPricePage.calendarFromMonthSelector(getCurrentMonth());
		// pages.iOOperationsPricePage.calendarFromDaySelector(getCurrentDayOfMonth());
		pages.iOOperationsPricePage.filterDateToClick().calendarToTodayClick();
	}

	@Override
	public boolean compareRecordsCount(String countInDB) throws InterruptedException {
		if (countInDB.equals(pages.iOOperationsPricePage.checkCountRecords())) {
			return true;
		}
		return false;
	}

	@Override
	public String getCurrentYear() {
		Calendar currentDate = Calendar.getInstance();
		String currYear = "" + currentDate.get(Calendar.YEAR);
		return currYear;
	}

	@Override
	public String getCurrentMonth() {
		Calendar currentDate = Calendar.getInstance();
		int currMonth = currentDate.get(Calendar.MONTH);
		switch (currMonth) {
		case 0:
			return "January";
		case 1:
			return "February";
		case 2:
			return "March";
		case 3:
			return "April";
		case 4:
			return "May";
		case 5:
			return "June";
		case 6:
			return "July";
		case 7:
			return "August";
		case 8:
			return "September";
		case 9:
			return "October";
		case 10:
			return "November";
		case 11:
			return "December";
		}
		return "" + currMonth;
	}

	@Override
	public String getCurrentDayOfMonth() {
		Calendar currentDate = Calendar.getInstance();
		String currDay = "" + currentDate.get(Calendar.DAY_OF_MONTH);
		return currDay;
	}

	@Override
	public void tabClicker() throws InterruptedException {
		pages.iOOperationsPricePage.tabErrorsClick().tabDetailsClick().tabErrorsClick();
	}

	@Override
	public void firstRecordSelect() throws InterruptedException {
		pages.iOOperationsPricePage.firstRecordClick();
	}

	@Override
	public String getFirstRecordId() throws InterruptedException {
		String firstRecordId;
		firstRecordId = pages.iOOperationsPricePage.tableFirstRecordGetId();
		System.out.println("firstRecordId=" + firstRecordId);
		return firstRecordId;
	}

	@Override
	public void filterStatusSelecter(String status) throws InterruptedException {
		pages.iOOperationsPricePage.selectStatus(status);
	}

	@Override
	public void searchClick() throws InterruptedException {
		pages.iOOperationsPricePage.filterButtonSearchClick();
	}

	@Override
	public void addRecord() throws InterruptedException {
		pages.iOOperationsPricePage.buttonAddClick();
	}

	@Override
	public void rejectRecord(String id) throws InterruptedException {
		recordClick(id);
		pages.iOOperationsPricePage.buttonRejectClick().buttonConfirmSaveClick();
	}

	@Override
	public void recordClick(String id) throws InterruptedException {
		pages.iOOperationsPricePage.filterButtonClearAllClick();
		enterDates();
		pages.iOOperationsPricePage.filterIdSendKeys(id).filterButtonSearchClick();
		pages.iOOperationsPricePage.firstRecordClick();
	}

	@Override
	public void startSearch() throws InterruptedException {
		pages.iOOperationsPricePage.filterButtonSearchClick();
	}

	@Override
	public void filterClear() throws InterruptedException {
		pages.iOOperationsPricePage.filterButtonClearAllClick();
	}

	@Override
	public ArrayList<String> getErrorsId() throws InterruptedException {
		pages.iOOperationsPricePage.tabErrorsClick();
		return pages.iOOperationsPricePage.tabErrorsGetErrors();
	}

	@Override
	public void saveNewRecord() throws InterruptedException {
		pages.iOOperationsPricePage.buttonAddSaveClick();
	}

	@Override
	public boolean checkRecordStatus(String id, String expectedStatus) throws InterruptedException {
		recordClick(id);
		String flag = pages.iOOperationsPricePage.tableFirstRecordGetStatus();
		return pages.iOOperationsPricePage.tableFirstRecordGetStatus().equals(expectedStatus);
	}
}
