package com.danco.bpc.pagesAllWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {

	private WebDriver driver;

	public LoginPage loginPage;
	public InternalPage internalPage;
	public UserProfilePage userProfilePage;
	public UserManagementPage userManagementPage;
	public FilmManagementPage filmManagementPage;
	public SessionPage sessionPage;
	public ContainersPage containersPage;

	public IOOperationsTMTPage iOOperationsTMTPage;
	public IOOperationsPricePage iOOperationsPricePage;

	public MonitoringLotesPage monitoringLotesPage;

	public PageManager(WebDriver driver) {
		this.driver = driver;
		loginPage = initElements(new LoginPage(this));
		internalPage = initElements(new InternalPage(this));
		userProfilePage = initElements(new UserProfilePage(this));
		userManagementPage = initElements(new UserManagementPage(this));
		filmManagementPage = initElements(new FilmManagementPage(this));
		monitoringLotesPage = initElements(new MonitoringLotesPage(this));
		sessionPage = initElements(new SessionPage(this));
		containersPage = initElements(new ContainersPage(this));
		iOOperationsTMTPage = initElements(new IOOperationsTMTPage(this));
		iOOperationsPricePage = initElements(new IOOperationsPricePage(this));
		
	}

	private <T extends Page> T initElements(T page) {
		// PageFactory.initElements(driver, page);
		// PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),
		// page);
		PageFactory.initElements(new DisplayedElementLocatorFactory(driver, 10), page);
		return page;
	}

	public WebDriver getWebDriver() {
		return driver;
	}

}
