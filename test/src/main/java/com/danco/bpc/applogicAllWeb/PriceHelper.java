package com.danco.bpc.applogicAllWeb;

import com.danco.bpc.IApplogicAllWeb.IPriceHelper;

public class PriceHelper extends DriverBasedHelper implements IPriceHelper {

	public PriceHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}

	@Override
	public void enterDates() throws InterruptedException {
		pages.IOOperationsPricePage.filterDateFromClick().calendarFromTodayClick().filterDateFromClick();
		pages.IOOperationsPricePage.calendarFromYearSelector("2010");
		pages.IOOperationsPricePage.calendarFromMonthSelector("January");
		pages.IOOperationsPricePage.calendarDaySelector("31");
		pages.IOOperationsPricePage.filterDateToClick().calendarToTodayClick().filterButtonSearchClick();
	}

	@Override
	public boolean compareRecordsCount(String countInDB) throws InterruptedException {
		if (countInDB.equals(pages.IOOperationsPricePage.checkCountRecords())) {
			return true;
		}
		return false;
	}
}
