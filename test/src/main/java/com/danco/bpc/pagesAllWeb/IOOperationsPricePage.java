package com.danco.bpc.pagesAllWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.danco.bpc.util.WaitLoadAndDisplayed;

public class IOOperationsPricePage extends AnyPage {

	public IOOperationsPricePage(PageManager pages) {
		super(pages);
	}

	public static final String FILTER_ID = ".//*[@id='entitySearchForm:id']";
	public static final String FILTER_DATE_FROM = ".//*[@id='entitySearchForm:dateFromInputDate']";
	public static final String FILTER_DATE_TO = ".//*[@id='entitySearchForm:dateToInputDate']";
	public static final String FILTER_TYPE = ".//*[@id='entitySearchForm:type']";
	public static final String FILTER_FILE_NAME = ".//*[@id='entitySearchForm:fileName']";
	public static final String FILTER_AMOUNT_FROM = ".//*[@id='entitySearchForm:amount_from']";
	public static final String FILTER_AMOUNT_TO = ".//*[@id='entitySearchForm:amount_to']";
	public static final String FILTER_STATUS = ".//*[@id='entitySearchForm:amount_to']";
	public static final String FILTER_BUTTON_SEARCH = ".//*[@id='entitySearchForm:searchBtn']";
	public static final String FILTER_BUTTON_CLEAR_ALL = ".//*[@class='link-clear']";

	public static final String WAIT_CONTENT_INDICATOR = ".//*[@id='waitContentTable']";

	public static final String CALENDAR_FROM_TODAY = ".//*[@id='entitySearchForm:dateFromFooter']/table/tbody/tr/td[5]/div";
	public static final String CALENDAR_TO_TODAY = ".//*[@id='entitySearchForm:dateToFooter']/table/tbody/tr/td[5]/div";
	public static final String CALENDAR_FROM_YEAR_REDUCTION = ".//*[@id='entitySearchForm:dateFromHeader']/table/tbody/tr/td[1]/div";
	public static final String CALENDAR_TO_YEAR_REDUCTION = ".//*[@id='entitySearchForm:dateFromHeader']/table/tbody/tr/td[1]/div";
	public static final String CALENDAR_FROM_YEAR_INCREASE = ".//*[@id='entitySearchForm:dateFromHeader']/table/tbody/tr/td[5]/div";
	public static final String CALENDAR_TO_YEAR_INCREASE = ".//*[@id='entitySearchForm:dateFromHeader']/table/tbody/tr/td[5]/div";
	public static final String CALENDAR_FROM_MONTH_REDUCTION = ".//*[@id='entitySearchForm:dateFromHeader']/table/tbody/tr/td[2]/div";
	public static final String CALENDAR_TO_MONTH_REDUCTION = ".//*[@id='entitySearchForm:dateFromHeader']/table/tbody/tr/td[2]/div";
	public static final String CALENDAR_FROM_MONTH_INCREASE = ".//*[@id='entitySearchForm:dateFromHeader']/table/tbody/tr/td[4]/div";
	public static final String CALENDAR_TO_MONTH_INCREASE = ".//*[@id='entitySearchForm:dateFromHeader']/table/tbody/tr/td[4]/div";
	public static final String CALENDAR_FROM_MONTH_YEAR_STRING = ".//*[@id='entitySearchForm:dateFromHeader']/table/tbody/tr/td[3]/div";
	public static final String CALENDAR_TO_MONTH_YEAR_STRING = ".//*[@id='entitySearchForm:dateFromHeader']/table/tbody/tr/td[3]/div";
	public static final String CALENDAR_DAY_PREFIX = ".//*[@id='entitySearchForm:dateFromDayCell";

	public static final String COUNT_RECORDS = ".//*[@id='entityBtnForm:pagesNum']/span[3]";

	@FindBy(xpath = FILTER_ID)
	private WebElement filterId;

	@FindBy(xpath = FILTER_DATE_FROM)
	private WebElement filterDateFrom;

	@FindBy(xpath = FILTER_DATE_TO)
	private WebElement filterDateTo;

	@FindBy(xpath = FILTER_TYPE)
	private WebElement filterType;

	@FindBy(xpath = FILTER_FILE_NAME)
	private WebElement filterFileName;

	@FindBy(xpath = FILTER_AMOUNT_FROM)
	private WebElement filterAmountFrom;

	@FindBy(xpath = FILTER_AMOUNT_TO)
	private WebElement filterAmountTo;

	@FindBy(xpath = FILTER_STATUS)
	private WebElement filterStatus;

	@FindBy(xpath = FILTER_BUTTON_SEARCH)
	private WebElement filterButtonSearch;

	@FindBy(xpath = FILTER_BUTTON_CLEAR_ALL)
	private WebElement filterButtonClearAll;

	@FindBy(xpath = WAIT_CONTENT_INDICATOR)
	private WebElement waitContentIndicator;

	@FindBy(xpath = CALENDAR_FROM_TODAY)
	private WebElement calendarFromToday;

	@FindBy(xpath = CALENDAR_TO_TODAY)
	private WebElement calendarToToday;

	@FindBy(xpath = CALENDAR_FROM_MONTH_YEAR_STRING)
	private WebElement calendarFromMonthYearString;

	@FindBy(xpath = CALENDAR_TO_MONTH_YEAR_STRING)
	private WebElement calendarToMonthYearString;

	@FindBy(xpath = CALENDAR_FROM_YEAR_REDUCTION)
	private WebElement calendarFromYearReduction;

	@FindBy(xpath = CALENDAR_TO_YEAR_REDUCTION)
	private WebElement calendarToYearReduction;

	@FindBy(xpath = CALENDAR_FROM_YEAR_INCREASE)
	private WebElement calendarFromYearIncrease;

	@FindBy(xpath = CALENDAR_TO_YEAR_INCREASE)
	private WebElement calendarToYearIncrease;

	@FindBy(xpath = CALENDAR_FROM_MONTH_REDUCTION)
	private WebElement calendarFromMonthReduction;

	@FindBy(xpath = CALENDAR_TO_MONTH_REDUCTION)
	private WebElement calendarToMonthReduction;

	@FindBy(xpath = CALENDAR_FROM_MONTH_INCREASE)
	private WebElement calendarFromMonthIncrease;

	@FindBy(xpath = CALENDAR_TO_MONTH_INCREASE)
	private WebElement calendarToMonthIncrease;
	@FindBy(xpath = COUNT_RECORDS)
	private WebElement countRecords;

	public IOOperationsPricePage filterDateFromClick() throws InterruptedException {
		filterDateFrom.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage filterDateToClick() throws InterruptedException {
		filterDateTo.click();
		return pages.IOOperationsPricePage;
	}
	
	public IOOperationsPricePage filterStatusClick() throws InterruptedException {
		filterStatus.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage calendarFromYearReduction() throws InterruptedException {
		calendarFromYearReduction.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage calendarToYearReduction() throws InterruptedException {
		calendarToYearReduction.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage calendarFromYearIncrease() throws InterruptedException {
		calendarFromYearIncrease.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage calendarToYearIncrease() throws InterruptedException {
		calendarToYearIncrease.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage calendarFromMonthReduction() throws InterruptedException {
		calendarFromMonthReduction.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage calendarToMonthReduction() throws InterruptedException {
		calendarToMonthReduction.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage calendarFromMonthIncrease() throws InterruptedException {
		calendarFromMonthIncrease.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage calendarToMonthIncrease() throws InterruptedException {
		calendarToMonthIncrease.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage calendarFromTodayClick() throws InterruptedException {
		calendarFromToday.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage calendarToTodayClick() throws InterruptedException {
		calendarToToday.click();
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage filterButtonSearchClick() throws InterruptedException {
		filterButtonSearch.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.IOOperationsPricePage;
	}

	public IOOperationsPricePage filterButtonClearAllClick() throws InterruptedException {
		filterButtonClearAll.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.IOOperationsPricePage;
	}

	public String calendarFromMonthParser() {
		String monthYear = calendarFromMonthYearString.getText();
		String month = monthYear.substring(0, monthYear.indexOf(","));
		System.out.println("month = " + month);
		return month;
	}

	public String calendarToMonthParser() {
		String monthYear = calendarToMonthYearString.getText();
		String month = monthYear.substring(0, monthYear.indexOf(","));
		System.out.println("month = " + month);
		return month;
	}

	public String calendarFromYearParser() {
		String monthYear = calendarFromMonthYearString.getText();
		String year = monthYear.substring(monthYear.indexOf(",") + 2, monthYear.length());
		System.out.println("year = " + year);
		return year;
	}

	public String calendarToYearParser() {
		String monthYear = calendarToMonthYearString.getText();
		String year = monthYear.substring(monthYear.indexOf(",") + 2, monthYear.length());
		System.out.println("year = " + year);
		return year;
	}

	public void calendarFromYearSelector(String year) throws InterruptedException {
		calendarFromTodayClick();
		String currentYear = calendarFromYearParser();
		while (!currentYear.equals(year)) {
			calendarFromYearReduction();
			currentYear = calendarFromYearParser();
		}
	}

	public void calendarToYearSelector(String year) throws InterruptedException {
		calendarToTodayClick();
		String currentYear = calendarToYearParser();
		while (!currentYear.equals(year)) {
			calendarToYearReduction();
			currentYear = calendarToYearParser();
		}
	}

	public void calendarFromMonthSelector(String month) throws InterruptedException {
		String currentMonth = calendarFromMonthParser();
		while (!currentMonth.equals(month)) {
			calendarFromMonthReduction();
			currentMonth = calendarFromMonthParser();
		}
	}

	public void calendarToMonthSelector(String month) throws InterruptedException {
		String currentMonth = calendarToMonthParser();
		while (!currentMonth.equals(month)) {
			calendarToMonthReduction();
			currentMonth = calendarToMonthParser();
		}
	}

	public void calendarFromDaySelector(String day) throws InterruptedException {
		int i = 0;
		String currentDay = driver.findElement(By.xpath(CALENDAR_DAY_PREFIX + i + "']")).getText();
		while (!currentDay.equals("1")) {
			i++;
			currentDay = driver.findElement(By.xpath(CALENDAR_DAY_PREFIX + i + "']")).getText();
		}
		while (!currentDay.equals(day)) {
			i++;
			currentDay = driver.findElement(By.xpath(CALENDAR_DAY_PREFIX + i + "']")).getText();
		}
		driver.findElement(By.xpath(CALENDAR_DAY_PREFIX + i + "']")).click();
	}

	public String checkCountRecords() throws InterruptedException {
		String countRec = countRecords.getText();
		System.out.println("countCerords from web=" + countRec);
		return countRec;
	}

	public IOOperationsPricePage selectStatus(String necessaryStatus) throws InterruptedException {
		int countClickDown = 0;
		switch (necessaryStatus) {
		case "Corrupted":
			countClickDown = 1;
			break;
		case "Not validated":
			countClickDown = 2;
			break;
		case "Valid":
			countClickDown = 3;
			break;
		case "Invalid":
			countClickDown = 4;
			break;
		case "Rejected":
			countClickDown = 5;
			break;
		case "Unmatched":
			countClickDown = 6;
			break;
		case "NOT_REQUIRE_PROCESSING":
			countClickDown = 6;
			break;
		}
		filterStatusClick();
		for (int i=0;i<countClickDown;i++){
			filterStatus.sendKeys(Keys.ARROW_DOWN);
		}
		filterStatus.sendKeys(Keys.ENTER);
		return pages.IOOperationsPricePage;
	}
}
