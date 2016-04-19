package com.danco.bpc.applogicAllWeb;

import java.util.Calendar;

import com.danco.bpc.IApplogicAllWeb.IPriceHelper;

public class PriceHelper extends DriverBasedHelper implements IPriceHelper {

	public PriceHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}

	@Override
	public void enterDates() throws InterruptedException {
		pages.IOOperationsPricePage.filterDateFromClick().calendarFromTodayClick();
		// pages.IOOperationsPricePage.calendarFromYearSelector(getCurrentYear());
		// pages.IOOperationsPricePage.calendarFromMonthSelector(getCurrentMonth());
		// pages.IOOperationsPricePage.calendarFromDaySelector(getCurrentDayOfMonth());
		pages.IOOperationsPricePage.filterDateToClick().calendarToTodayClick();
	}

	@Override
	public boolean compareRecordsCount(String countInDB) throws InterruptedException {
		if (countInDB.equals(pages.IOOperationsPricePage.checkCountRecords())) {
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
		pages.IOOperationsPricePage.tabErrorsClick().tabDetailsClick().tabErrorsClick();
	}

	@Override
	public String getFirstRecordId() throws InterruptedException {
		String firstRecordId;
		firstRecordId = pages.IOOperationsPricePage.tableFirstRecordGetId();
		System.out.println("firstRecordId=" + firstRecordId);
		return firstRecordId;
	}

	@Override
	public void filterStatusSelecter(String status) throws InterruptedException {
		pages.IOOperationsPricePage.selectStatus(status);
	}

	@Override
	public void searchClick() throws InterruptedException {
		pages.IOOperationsPricePage.filterButtonSearchClick();
	}
}
