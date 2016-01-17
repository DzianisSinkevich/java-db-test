package com.danco.bpc.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import db.utils.WaitLoadAndDisplayed;

public class SessionPage extends InternalPage {

	public SessionPage(PageManager pages) {
		super(pages);
	}

	public SessionPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By
				.cssSelector("[id='SessionDatatableForm']")));
		return this;
	}

	@FindBy(xpath = "//table[@class='SessionFilterPanelGrid']/tbody/tr[3]/td[@class='padding-bottom-10 width20 align-middle']/*[1]")
	private WebElement searchField;

	@FindBy(name = "name")
	private WebElement title;

	@FindBy(name = "year")
	private WebElement year;

	@FindBy(xpath = "//table[@class='SessionFilterPanelGrid']/tbody/tr[3]/td[@class='width10 padding-bottom-10 align-middle padding-right-10']/*[1]")
	private WebElement findButton;

	@FindBy(xpath = "//*[@id='SessionDatatableForm:sessions_data']/tr[*]")
	private List<WebElement> sessionsList;

	@FindBy(xpath = "//*[@id='SessionDatatableForm:sessions_data']/tr/td")
	private WebElement firstElement;

	public List<WebElement> getSearchedSessions() throws InterruptedException {
		String str = firstElement.getText();
		if (!str.equals("No records found.")) {
			return sessionsList;
		}else{
			return new ArrayList<WebElement>();
		}
	}

	public SessionPage clickSearchLink(String ssid) throws InterruptedException {
		clearingSearchField();
		searchField.sendKeys(ssid);
		findButton.click();
		WaitLoadAndDisplayed.isLoadIconVisibility(driver);
		WaitLoadAndDisplayed.isLoadIconInvisibility(driver);
		// driver.navigate().refresh();
		return pages.sessionPage;
	}

	public WebElement findSearchSsidField(WebElement staticField) {
		String cssSelector = ".ui-inputfield ui-inputtext ui-widget";
		return staticField.findElement(By.xpath(String.format(cssSelector)));
	}

	public SessionPage clearingSearchField() {
		searchField.click();
		String selectAll = Keys.chord(Keys.CONTROL + "a");
		searchField.sendKeys(selectAll + Keys.DELETE);
		return pages.sessionPage;
	}
}
