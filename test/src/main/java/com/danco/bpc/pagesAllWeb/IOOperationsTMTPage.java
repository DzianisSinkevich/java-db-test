package com.danco.bpc.pagesAllWeb;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.danco.bpc.util.WaitLoadAndDisplayed;

public class IOOperationsTMTPage extends AnyPage {

	public IOOperationsTMTPage(PageManager pages) {
		super(pages);
	}

	public static final String FILTER_SEARCH_BUTTON = ".//*[@id='searchForm:searchBtn']";
	public static final String FILTER_CLEAR_ALL_BUTTON = ".//*[@class='link-clear']";
	public static final String FILTER_SESSION_ID = "//*[@id='searchForm:sessionId']";

	public static final String TABLE_ROWS_NUM = ".//*[@id='reportsBtnForm:rows_num']";

	public static final String TAB_DETAILS = "//div[@class='first tab-label']//*[text()='Details']";
	public static final String TAB_TOTALS = "//div[@class='tab-label']//*[text()='Totals']";
	public static final String TAB_TOTALS_TE_BUTTON = "//div[@class='bottom_search_result_left_buttons']/button[0]";
	public static final String TAB_TOTALS_TE_NET_POSITION = "//div[@id='tmtTotalAddForm:netPosition']";
	public static final String TAB_TOTALS_TE_PAYMENT_AMOUNTS = "//div[@id='tmtTotalAddForm:paymentAmounts']";
	public static final String TAB_TOTALS_TR_BUTTON = "//div[@class='bottom_search_result_left_buttons']/button[1]";
	public static final String TAB_TOTALS_TR_NET_POSITION = "//div[@id='tmtTotalAddForm:netPosition']";
	public static final String TAB_TOTALS_TR_PAYMENT_AMOUNTS = "//div[@id='tmtTotalAddForm:paymentAmounts']";

	public static final String WAIT_CONTENT_INDICATOR = ".//*[@id='waitContentTable']";

	@FindBy(xpath = FILTER_SEARCH_BUTTON)
	private WebElement filterSerachButton;

	@FindBy(xpath = FILTER_CLEAR_ALL_BUTTON)
	private WebElement filterClearAllButton;

	@FindBy(xpath = FILTER_SESSION_ID)
	private WebElement filterSessionId;

	@FindBy(xpath = TABLE_ROWS_NUM)
	private WebElement tableRowsNumDropdown;

	@FindBy(xpath = TAB_DETAILS)
	private WebElement tabDetails;

	@FindBy(xpath = TAB_TOTALS)
	private WebElement tabTotals;

	@FindBy(xpath = TAB_TOTALS_TE_BUTTON)
	private WebElement tabTotalsTeButton;

	@FindBy(xpath = TAB_TOTALS_TE_NET_POSITION)
	private WebElement tabTotalsTeNetPositionField;

	@FindBy(xpath = TAB_TOTALS_TE_PAYMENT_AMOUNTS)
	private WebElement tabTotalsTePaymentAmountsField;

	@FindBy(xpath = TAB_TOTALS_TR_BUTTON)
	private WebElement tabTotalsTrButton;

	@FindBy(xpath = TAB_TOTALS_TR_NET_POSITION)
	private WebElement tabTotalsTrNetPositionField;

	@FindBy(xpath = TAB_TOTALS_TR_PAYMENT_AMOUNTS)
	private WebElement tabTotalsTrPaymentAmountsField;

	@FindBy(xpath = WAIT_CONTENT_INDICATOR)
	private WebElement waitContentIndicator;

	public IOOperationsTMTPage searchButtonClick() throws InterruptedException {
		filterSerachButton.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage clearAllButtonClick() throws InterruptedException {
		filterClearAllButton.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage sessionIdSendKeys(String ssid) {
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
		tabTotals.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage tabTotalsTeButtonClick() throws InterruptedException {
		tabTotalsTeButton.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage teNetPositionSendKeys(String netPosition) {
		tabTotalsTeNetPositionField.sendKeys(netPosition);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage tePaymentAmountsSendKeys(String paymentAmounts) {
		tabTotalsTePaymentAmountsField.sendKeys(paymentAmounts);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage tabTotalsTrButtonClick() throws InterruptedException {
		tabTotalsTrButton.click();
		WaitLoadAndDisplayed.fullCicleWait(driver, waitContentIndicator);
		return pages.iOOperationsTMTPage;
	}

	public IOOperationsTMTPage trNetPositionSendKeys(String netPosition) {
		tabTotalsTrNetPositionField.sendKeys(netPosition);
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
}