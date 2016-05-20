package com.danco.bpc.pagesAllWeb;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.danco.bpc.util.WaitLoadAndDisplayed;

public class IOOperationsTMTPage extends AnyPage {

	private Logger log = Logger.getLogger("file");

	public IOOperationsTMTPage(PageManager pages) {
		super(pages);
	}

	public static final String FILTER_SEARCH_BUTTON = ".//*[@id='searchForm:searchBtn']";
	public static final String FILTER_CLEAR_ALL_BUTTON = ".//*[@class='link-clear']";
	public static final String FILTER_SESSION_ID = "//*[@id='searchForm:sessionId']";

	public static final String TABLE_ROWS_NUM = ".//*[@id='reportsBtnForm:rows_num']";
	public static final String TABLE_FIRST_ROW = ".//tr[@id='rejectedTmaForm:rejectedTmaTable:n:0']";

	public static final String TAB_DETAILS = "//div[@class='first tab-label']//*[text()='Details']";
	public static final String TAB_TOTALS = "//div[@class='first tab-label']//span[@title='Totals']";
	public static final String TAB_TOTALS_EXIST_TOTALS = "//table[@id='tmtTotalsForm:tmtTotalsTable:n']/tbody[@id='tmtTotalsForm:tmtTotalsTable:tb']/tr[*]/td[*]/div[@class='extdt-cell-div']";
	public static final String TAB_TOTALS_TE_BUTTON = "//div[@class='bottom_search_result_left_buttons']/*/*[text()='Add TE total']";
	public static final String TAB_TOTALS_TE_NET_POSITION = "//input[@id='tmtTotalAddForm:netPosition']";
	public static final String TAB_TOTALS_TE_PAYMENT_AMOUNTS = "//input[@id='tmtTotalAddForm:paymentAmounts']";
	public static final String TAB_TOTALS_TE_SAVE = "//form[@id='tmtTotalAddForm']/div[@class='bottom_search_result_block_buttons']//button[@class='pzKpfwBtn']//*[text()='Save']";
	public static final String TAB_TOTALS_TR_BUTTON = "//div[@class='bottom_search_result_left_buttons']/*/*[text()='Add TR total']";
	public static final String TAB_TOTALS_TR_NET_POSITION = "//input[@id='tmtTotalAddForm:netPosition']";
	public static final String TAB_TOTALS_TR_PAYMENT_AMOUNTS = "//input[@id='tmtTotalAddForm:paymentAmounts']";

	public static final String TABLE_STATUS_READ = "//tr[@id='rejectedTmaForm:rejectedTmaTable:n:0']/td[contains(@id,':status')]";

	public static final String WAIT_CONTENT_INDICATOR = ".//*[@id='waitContentTable']";

	@FindBy(xpath = FILTER_SEARCH_BUTTON)
	private WebElement filterSerachButton;

	@FindBy(xpath = FILTER_CLEAR_ALL_BUTTON)
	private WebElement filterClearAllButton;

	@FindBy(xpath = FILTER_SESSION_ID)
	private WebElement filterSessionId;

	@FindBy(xpath = TABLE_ROWS_NUM)
	private WebElement tableRowsNumDropdown;

	@FindBy(xpath = TABLE_FIRST_ROW)
	private WebElement tableFirstRow;

	@FindBy(xpath = TAB_DETAILS)
	private WebElement tabDetails;

	@FindBy(xpath = TAB_TOTALS)
	private WebElement tabTotals;

	@FindBy(xpath = TAB_TOTALS_EXIST_TOTALS)
	private List<WebElement> existTotals;

	@FindBy(xpath = TAB_TOTALS_TE_BUTTON)
	private WebElement tabTotalsTeButton;

	@FindBy(xpath = TAB_TOTALS_TE_NET_POSITION)
	private WebElement tabTotalsTeNetPositionField;

	@FindBy(xpath = TAB_TOTALS_TE_PAYMENT_AMOUNTS)
	private WebElement tabTotalsTePaymentAmountsField;

	@FindBy(xpath = TAB_TOTALS_TE_SAVE)
	private WebElement teSave;

	@FindBy(xpath = TAB_TOTALS_TR_BUTTON)
	private WebElement tabTotalsTrButton;

	@FindBy(xpath = TAB_TOTALS_TR_NET_POSITION)
	private WebElement tabTotalsTrNetPositionField;

	@FindBy(xpath = TAB_TOTALS_TR_PAYMENT_AMOUNTS)
	private WebElement tabTotalsTrPaymentAmountsField;

	@FindBy(xpath = WAIT_CONTENT_INDICATOR)
	private WebElement waitContentIndicator;

	@FindBy(xpath = TABLE_STATUS_READ)
	private WebElement firstRowStatus;

	public List<String> existTotalsCheck() throws InterruptedException {
		List<String> existTotalsText = new ArrayList<String>();
		for (WebElement el: existTotals){
			existTotalsText.add(el.getText());
		}
		return existTotalsText;
	}
	
	public IOOperationsTMTPage searchButtonClick() throws InterruptedException {
		filterSerachButton.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage clearAllButtonClick() throws InterruptedException {
		log.info("-- Clear all button click");
		filterClearAllButton.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		log.info("-- Clear all button click is successfully");
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage sessionIdSendKeys(String ssid) {
		log.info("-- Input data to field Session ID");
		filterSessionId.sendKeys(ssid);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage filterSessionIdSendKeys(String loteId) {
		filterSessionId.sendKeys(loteId);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage tabDetailsClick() throws InterruptedException {
		tabDetails.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage tabTotalsClick() throws InterruptedException {
		log.info("-- Tab totals click");
		tabTotals.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		log.info("-- Tab totals click is successfully");
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage tabTotalsTeButtonClick() throws InterruptedException {
		log.info("-- Tab totals Add TE button click");
		tabTotalsTeButton.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		log.info("-- Tab totals Add TE button click is successfully");
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage teNetPositionSendKeys(String netPosition) {
		log.info("-- Sendkeys to TE Net position");
		tabTotalsTeNetPositionField.sendKeys(netPosition);
		log.info("-- Sendkeys to TE Net position is successfully");
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage tePaymentAmountsSendKeys(String paymentAmounts) {
		tabTotalsTePaymentAmountsField.sendKeys(paymentAmounts);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage tabTotalsTrButtonClick() throws InterruptedException {
		log.info("-- Tab totals Add TR button click");
		tabTotalsTrButton.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		log.info("-- Tab totals Add TR button click is successfully");
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage trNetPositionSendKeys(String netPosition) {
		log.info("-- Sendkeys to TR Net position");
		tabTotalsTrNetPositionField.sendKeys(netPosition);
		log.info("-- Sendkeys to TR Net position is successfully");
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage trPaymentAmountsSendKeys(String paymentAmounts) {
		tabTotalsTrPaymentAmountsField.sendKeys(paymentAmounts);
		return pages.iOOperationsTMTPage;
	}

	public MonitoringLotesPage selectMaxRowNum() throws InterruptedException {
		tableRowsNumDropdown.click();
		tableRowsNumDropdown.sendKeys("1", "3", "3", Keys.ENTER);
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.monitoringLotesPage;
	}

	public IOOperationsTMTPage firstRowClick() throws InterruptedException {
		log.info("-- First row click");
		tableFirstRow.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		log.info("-- First row click is successfully");
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage teTrSaveClick() throws InterruptedException {
		log.info("-- TE/TR Save button click");
		teSave.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		log.info("-- TE/TR Save button click is successfully");
		return pages.iOOperationsTMTPage;
	}

	public String readFirstRowStatus() {
		log.info("-- Reading status of first row");
		return firstRowStatus.getText();
	}
}