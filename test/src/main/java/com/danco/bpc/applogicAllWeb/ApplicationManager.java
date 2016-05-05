package com.danco.bpc.applogicAllWeb;

import org.openqa.selenium.WebDriver;

import com.danco.bpc.IApplogicAllWeb.INavigationHelper;
import com.danco.bpc.IApplogicAllWeb.IPriceHelper;
import com.danco.bpc.IApplogicAllWeb.IUserHelper;
import com.danco.bpc.pages.util.PropertyLoader;
import com.danco.bpc.util.Browser;
import com.danco.bpc.webdriver.WebDriverFactory;

public class ApplicationManager implements com.danco.bpc.IApplogicAllWeb.IApplicationManager {

	private IUserHelper userHelper;
	private INavigationHelper navHelper;
	private IPriceHelper priceHelper;

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

		driver = WebDriverFactory.getInstance(browser.getName(), username, password);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		userHelper = new UserHelper(this);
		navHelper = new NavigationHelper(this);
		priceHelper = new PriceHelper(this);

		// getNavigationHelper().openMainPage();
	}

	public ApplicationManager(boolean isLogined) {
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
		navHelper = new NavigationHelper(this);
		priceHelper = new PriceHelper(this);

		getNavigationHelper().openMainPage();
	}

	@Override
	public IUserHelper getUserHelper() {
		return userHelper;
	}

	@Override
	public INavigationHelper getNavigationHelper() {
		return navHelper;
	}
	
	@Override
	public IPriceHelper getPriceHelper() {
		return priceHelper;
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
