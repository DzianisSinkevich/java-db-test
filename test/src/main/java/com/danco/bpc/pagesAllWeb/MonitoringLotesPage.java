package com.danco.bpc.pagesAllWeb;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.danco.bpc.util.WaitLoadAndDisplayed;

import net.thucydides.core.annotations.findby.By;

public class MonitoringLotesPage extends AnyPage {

	public MonitoringLotesPage(PageManager pages) {
		super(pages);
	}

	public static final String FILTER_SEARCH_BUTTON = ".//*[@id='searchForm:searchBtn']";
	public static final String FILTER_CLEAR_ALL_BUTTON = ".//*[@class='link-clear']";
	public static final String FILTER_SESSION_NUMBER = "//*[@id='searchForm:sessionNumberFilter']";
	public static final String FILTER_LOTE = ".//*[@id='searchForm:lotIdFilter']";

	public static final String TABLE_ROWS_NUM = ".//*[@id='reportsBtnForm:rows_num']";
	public static final String TABLE_SESSION_READ = "";
	public static final String TABLE_SESSION_NUMBER_READ = "";
	public static final String TABLE_STATUS_READ = "";
	public static final String TABLE_OPEN_DATE_READ = "";

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

	@FindBy(xpath = TABLE_SESSION_READ)
	private WebElement tableSessionRead;

	@FindBy(xpath = TABLE_SESSION_NUMBER_READ)
	private WebElement tableSessionNumber;

	@FindBy(xpath = TABLE_STATUS_READ)
	private ArrayList<WebElement> tableStatuses;

	@FindBy(xpath = TABLE_OPEN_DATE_READ)
	private WebElement tableOpenDate;

	@FindBy(xpath = TABLE_ROWS_NUM)
	private WebElement tableRowsNumDropdown;

	public MonitoringLotesPage searchButtonClick() throws InterruptedException {
		searchButton.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
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
		tableRowsNumDropdown.click();
		tableRowsNumDropdown.sendKeys("1", "3", "3", Keys.ENTER);
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.monitoringLotesPage;
	}

	public String sessionGetText() {
		return tableSessionRead.getText();
	}

	public String sessionNumberGetText(int i) {
		WebElement el = driver.findElement(By.xpath(TABLE_SESSION_NUMBER_READ + i + "]']"));
		return el.getText();
	}

	public String openDateGetText() {
		return tableOpenDate.getText();
	}

	public ArrayList<WebElement> readSessionsStatuses() {
		return tableStatuses;
	}
}
