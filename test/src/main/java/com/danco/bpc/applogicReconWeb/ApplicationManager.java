package com.danco.bpc.applogicReconWeb;

import org.openqa.selenium.WebDriver;

import com.danco.bpc.IApplogicReconWeb.INavigationHelper;
import com.danco.bpc.IApplogicReconWeb.ISessionHelper;
import com.danco.bpc.IApplogicReconWeb.IUserHelper;
import com.danco.bpc.pages.util.PropertyLoader;
import com.danco.bpc.util.Browser;
import com.danco.bpc.webdriver.WebDriverFactory;

public class ApplicationManager implements com.danco.bpc.IApplogicReconWeb.IApplicationManager {

	private IUserHelper userHelper;
	private ISessionHelper sessionHelper;
	private INavigationHelper navHelper;

	private WebDriver driver;
	private String baseUrl;

	public ApplicationManager() {
		baseUrl = PropertyLoader.loadProperty("site.url");
		String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

		Browser browser = new Browser();
		browser.setName(PropertyLoader.loadProperty("browser.name"));
		browser.setVersion(PropertyLoader.loadProperty("browser.version"));
		browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));

		String username = PropertyLoader.loadProperty("user.username");
		String password = PropertyLoader.loadProperty("user.password");

		driver = WebDriverFactory.getInstance(gridHubUrl, browser, username, password);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		userHelper = new UserHelper(this);
		sessionHelper = new SessionHelper(this);
		navHelper = new NavigationHelper(this);

		getNavigationHelper().openMainPage();
	}

	@Override
	public IUserHelper getUserHelper() {
		return userHelper;
	}

	@Override
	public ISessionHelper getSessionHelper() {
		return sessionHelper;
	}

	@Override
	public INavigationHelper getNavigationHelper() {
		return navHelper;
	}

	protected WebDriver getWebDriver() {
		return driver;
	}

	protected String getBaseUrl() {
		return baseUrl;
	}

	@Override
	public void stop() {
		if (driver != null) {
			driver.quit();
		}
	}
}
