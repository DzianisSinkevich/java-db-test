package com.danco.bpc.pagesAllWeb;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.danco.bpc.util.WaitLoadAndDisplayed;

public class MonitoringLotesPage extends AnyPage {

	private Logger log = Logger.getLogger("file");

	public MonitoringLotesPage(PageManager pages) {
		super(pages);
	}

	public static final String FILTER_SEARCH_BUTTON = ".//*[@id='searchForm:searchBtn']";
	public static final String FILTER_CLEAR_ALL_BUTTON = ".//*[@class='link-clear']";
	public static final String FILTER_SESSION_NUMBER = "//*[@id='searchForm:sessionNumberFilter']";
	public static final String FILTER_LOTE = ".//*[@id='searchForm:lotIdFilter']";

	public static final String TABLE_ROWS_NUM = ".//*[@id='reportsBtnForm:rows_num']";
	public static final String TABLE_PAGES_NUM = ".//*[@id='reportsBtnForm:pagesNum']/span[1]";
	public static final String TABLE_PAGES_PREFIX = ".//*[@id='reportsBtnForm:dsreports_table']/tbody/tr/td[";
	public static final String TABLE_PAGES_POSTFIX = "]";
	public static final String TABLE_SESSION_READ = "//table[@class='extdt-table-layout res-table']//tr[contains(@id,'searchResultForm:searchResultTable:n:')]/td[contains(@id,':id')]";
	public static final String TABLE_SESSION_NUMBER_READ = "//table[@class='extdt-table-layout res-table']//tr[contains(@id,'searchResultForm:searchResultTable:n:')]/td[contains(@id,':sessionNumber')]";
	public static final String TABLE_STATUS_READ = "//table[@class='extdt-table-layout res-table']//tr[contains(@id,'searchResultForm:searchResultTable:n:')]/td[contains(@id,':status')]";
	public static final String TABLE_OPEN_DATE_READ = "//table[@class='extdt-table-layout res-table']//tr[contains(@id,'searchResultForm:searchResultTable:n:')]/td[contains(@id,':openDate')]";

	public static final String WAIT_CONTENT_INDICATOR = ".//*[@id='waitContentTable']";

	@FindBy(xpath = WAIT_CONTENT_INDICATOR)
	private WebElement waitContentIndicator;

	@FindBy(xpath = FILTER_SEARCH_BUTTON)
	private WebElement searchButton;

	@FindBy(xpath = FILTER_CLEAR_ALL_BUTTON)
	private WebElement clearAllButton;

	@FindBy(xpath = FILTER_SESSION_NUMBER)
	private WebElement sessionNumberField;

	@FindBy(xpath = FILTER_LOTE)
	private WebElement loteField;

	@FindBy(xpath = TABLE_ROWS_NUM)
	private WebElement tableRowsNum;

	@FindBy(xpath = TABLE_PAGES_NUM)
	private WebElement tablePagesNum;

	@FindBy(xpath = TABLE_SESSION_READ)
	private List<WebElement> tableSession;

	@FindBy(xpath = TABLE_SESSION_NUMBER_READ)
	private List<WebElement> tableSessionNumber;

	@FindBy(xpath = TABLE_STATUS_READ)
	private List<WebElement> tableStatuses;

	@FindBy(xpath = TABLE_OPEN_DATE_READ)
	private List<WebElement> tableOpenDate;

	@FindBy(xpath = TABLE_ROWS_NUM)
	private WebElement tableRowsNumDropdown;

	public MonitoringLotesPage searchButtonClick() throws InterruptedException {
		log.info("-- Click Search button");
		searchButton.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		log.info("-- Click Search button is successfully");
		return pages.monitoringLotesPage;
	}

	public MonitoringLotesPage clearAllButtonClick() throws InterruptedException {
		clearAllButton.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.monitoringLotesPage;
	}

	public MonitoringLotesPage sessionNumberSendKeys(String ssid) {
		sessionNumberField.sendKeys(ssid);
		return pages.monitoringLotesPage;
	}

	public MonitoringLotesPage loteSendKeys(String loteId) {
		loteField.sendKeys(loteId);
		return pages.monitoringLotesPage;
	}

	public MonitoringLotesPage selectMaxRowNum() throws InterruptedException {
		log.info("-- Click to Rows Num dropdown");
		tableRowsNumDropdown.click();
		log.info("-- Click to Rows Num dropdown is successfully");
		log.info("-- Sendkeys data in to Rows Num dropdown");
		tableRowsNumDropdown.sendKeys("1", Keys.ENTER);
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		tableRowsNumDropdown.sendKeys("3", Keys.ENTER);
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		tableRowsNumDropdown.sendKeys("3", Keys.ENTER);
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		log.info("-- Sendkeys data in to Rows Num dropdown is successfully");
		return pages.monitoringLotesPage;
	}

	public List<String> readSessions() {
		List<String> sessions = new ArrayList<String>();
		log.info("-- Read all Session in table");
		for (WebElement el : tableSession) {
			sessions.add(el.getText());
		}
		return sessions;
	}

	public List<String> readSessionsNumber() {
		List<String> sessionsNumber = new ArrayList<String>();
		log.info("-- Read all Session Number in table");
		for (WebElement el : tableSessionNumber) {
			sessionsNumber.add(el.getText());
		}
		return sessionsNumber;
	}

	public List<String> readSessionsOpenDate() {
		List<String> sessionsOperDate = new ArrayList<String>();
		log.info("-- Read all Open Date in table");
		for (WebElement el : tableOpenDate) {
			sessionsOperDate.add(el.getText());
		}
		return sessionsOperDate;
	}

	public List<String> readSessionsStatuses() {
		List<String> sessionsStatuses = new ArrayList<String>();
		log.info("-- Read all Statuses in table");
		for (WebElement el : tableStatuses) {
			sessionsStatuses.add(el.getText());
		}
		return sessionsStatuses;
	}

	public Integer countPage() {
		return Integer.parseInt(tablePagesNum.getText());
	}

	public MonitoringLotesPage pageClick(Integer pageNum) throws InterruptedException {
		int finalNumPage = 2 + pageNum;
		driver.findElement(By.xpath(TABLE_PAGES_PREFIX + finalNumPage + TABLE_PAGES_POSTFIX)).click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.monitoringLotesPage;
	}
}
