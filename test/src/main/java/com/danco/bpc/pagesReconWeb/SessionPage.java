package com.danco.bpc.pagesReconWeb;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.danco.bpc.modelReconWeb.Session;

import db.utils.WaitLoadAndDisplayed;

public class SessionPage extends InternalPage {

	Session currentSesion = new Session();

	public SessionPage(PageManager pages) {
		super(pages);
	}

	public SessionPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.cssSelector("[id='SessionDatatableForm']")));
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

	@FindBy(xpath = "//*[@id='SessionDatatableForm:sessions_data']/tr[1]/td[2]")
	private WebElement ssidSession;
	
	@FindBy(xpath = "//*[@id='SessionDatatableForm:sessions_data']/tr[1]/td[3]")
	private WebElement stateSession;
	
	@FindBy(xpath = "//*[@id='SessionDatatableForm:sessions_data']/tr[1]/td[7]")
	private WebElement statusSession;
	
	@FindBy(xpath = "//*[@id='SessionDatatableForm:sessions_data']/tr[1]/td[9]/span")
	private WebElement teSession;
	
	@FindBy(xpath = "//*[@id='SessionDatatableForm:sessions_data']/tr[1]/td[10]/span")
	private WebElement trSession;
	
	@FindBy(xpath = "//*[@id='SessionDatatableForm:sessions_data']/tr[1]/td[11]/span")
	private WebElement tsvSession;
	
	@FindBy(xpath = "//*[@id='SessionDatatableForm:sessions_data']/tr[1]/td[12]/span")
	private WebElement tfSession;

	@FindBy(xpath = "//*[@role='columnheader'][2]")
	private WebElement columnHeaderSessionId;
	
	public List<WebElement> getSearchedSessions() throws InterruptedException {
		String str = firstElement.getText();
		if (!str.equals("No records found.")) {
			return sessionsList;
		} else {
			return new ArrayList<WebElement>();
		}
	}

	public SessionPage getSessionState(Session currSession) throws InterruptedException {
		currSession.setState(stateSession.getText());
		return pages.sessionPage;
	}

	public SessionPage getSessionStatus(Session currSession) throws InterruptedException {
		currSession.setStatus(statusSession.getText());
		return pages.sessionPage;
	}
	
	public SessionPage getSessionTe(Session currSession) throws InterruptedException {
		currSession.setTe(teSession.getText());
		return pages.sessionPage;
	}
	
	public SessionPage getSessionTr(Session currSession) throws InterruptedException {
		currSession.setTr(trSession.getText());
		return pages.sessionPage;
	}
	
	public SessionPage getSessionTsv(Session currSession) throws InterruptedException {
		currSession.setTsv(tsvSession.getText());
		return pages.sessionPage;
	}
	
	public SessionPage getSessionTf(Session currSession) throws InterruptedException {
		currSession.setTf(tfSession.getText());
		return pages.sessionPage;
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
	
	public SessionPage sortingSessions() {
		columnHeaderSessionId.click();
		WaitLoadAndDisplayed.isLoadIconVisibility(driver);
		WaitLoadAndDisplayed.isLoadIconInvisibility(driver);
		columnHeaderSessionId.click();
		WaitLoadAndDisplayed.isLoadIconVisibility(driver);
		WaitLoadAndDisplayed.isLoadIconInvisibility(driver);
		return pages.sessionPage;
	} 
	
	public String getFirstSession(){
		String firstSession = ssidSession.getText();
		return firstSession;
	}
}
