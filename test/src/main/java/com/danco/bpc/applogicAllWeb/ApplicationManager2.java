package com.danco.bpc.applogicAllWeb;

import org.openqa.selenium.WebDriver;

import com.danco.bpc.IApplogicAllWeb.NavigationHelper;
import com.danco.bpc.IApplogicAllWeb.ProcessesSessionHelper;
import com.danco.bpc.IApplogicAllWeb.UserHelper;
import com.danco.bpc.pages.util.PropertyLoader;
import com.danco.bpc.util.Browser;
import com.danco.bpc.webdriver.WebDriverFactory;

public class ApplicationManager2 implements com.danco.bpc.IApplogicAllWeb.ApplicationManager {

	private UserHelper userHelper;
	private ProcessesSessionHelper sessionHelper;
	private NavigationHelper navHelper;

	private WebDriver driver;
	private String baseUrl;

	public ApplicationManager2() {
		baseUrl = PropertyLoader.loadProperty("site.url");
		String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

		Browser browser = new Browser();
		browser.setName(PropertyLoader.loadProperty("browser.name"));
		browser.setVersion(PropertyLoader.loadProperty("browser.version"));
		browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));

		String username = PropertyLoader.loadProperty("user.username");
		String password = PropertyLoader.loadProperty("user.password");

		driver = WebDriverFactory.getInstance(browser.getName(), username, password);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		userHelper = new UserHelper2(this);
		sessionHelper = new ProcessesSessionHelper2(this);
		navHelper = new NavigationHelper2(this);

//		getNavigationHelper().openMainPage();
	}
	
	public ApplicationManager2(boolean isLogined) {
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

		userHelper = new UserHelper2(this);
		sessionHelper = new ProcessesSessionHelper2(this);
		navHelper = new NavigationHelper2(this);

		getNavigationHelper().openMainPage();
	}

	@Override
	public UserHelper getUserHelper() {
		return userHelper;
	}

	@Override
	public ProcessesSessionHelper getSessionHelper() {
		return sessionHelper;
	}

	@Override
	public NavigationHelper getNavigationHelper() {
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
