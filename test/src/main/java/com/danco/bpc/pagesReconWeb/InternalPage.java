package com.danco.bpc.pagesReconWeb;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InternalPage extends AnyPage {
	public static final String HOME_LINK = "nav a[href = 'http://localhost/php4dvd/']";
	public static final String MENU_ID = "hamburger";
	public static final String MENU_SESSION_LINK = "Sessions";
	public static final String MENU_RECONCILIATION_CASES_LINK = "Reconciliation Cases";
	public static final String MENU_DATASOURCES_LINK = "Datasources";
	public static final String MENU_ROUTING_LINK = "Routing";
	public static final String MENU_LOGOUT_LINK = "Logout";

	public InternalPage(PageManager pages) {
		super(pages);
	}

	public InternalPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.cssSelector("nav")));
		return this;
	}

	public int afterAmountFilms;

	@FindBy(css = HOME_LINK)
	private WebElement homeLink;

	@FindBy(id = MENU_ID)
	private WebElement menuLink;

	@FindBy(linkText = MENU_SESSION_LINK)
	private WebElement menuSessionLink;

	@FindBy(linkText = MENU_RECONCILIATION_CASES_LINK)
	private WebElement menuReconciliationCasesLink;

	@FindBy(linkText = MENU_DATASOURCES_LINK)
	private WebElement menuDatasourcesLink;

	@FindBy(linkText = MENU_ROUTING_LINK)
	private WebElement menuRoutingLink;

	@FindBy(css = "nav a[href $= '?go=profile']")
	private WebElement userProfileLink;

	@FindBy(css = "nav a[href $= '?go=users']")
	private WebElement userManagementLink;

	@FindBy(css = "nav a[href = './?go=add']")
	private WebElement filmAddLink;

	@FindBy(linkText = MENU_LOGOUT_LINK)
	private WebElement logoutLink;

	@FindBy(xpath = "/html/body/div[@id='container']/div[@id='wrapper']/div[@id='content']/section/div[@id='results']/*/*/div[@class='movie_cover']/div[@class='nocover']")
	private List<WebElement> forAmountFilms;

	@FindBy(xpath = "/html/body/div[@id='container']/div[@id='wrapper']/div[@id='content']/section/div[@id='results']/a[1]")
	private WebElement firstFilm;

	public InternalPage clickHomePage() {
		homeLink.click();
		return pages.internalPage;
	}

	public InternalPage clickMenu() {
		menuLink.click();
		return pages.internalPage;
	}

	public InternalPage clickDatasourcesLink() {
		menuDatasourcesLink.click();
		return pages.internalPage;
	}

	public InternalPage clickReconciliationCasesLink() {
		menuReconciliationCasesLink.click();
		return pages.internalPage;
	}

	public InternalPage clickRoutingLink() {
		menuRoutingLink.click();
		return pages.internalPage;
	}

	public InternalPage clickSessionLink() {
		menuSessionLink.click();
		return pages.internalPage;
	}

	public UserProfilePage clickUserProfilePage() {
		userProfileLink.click();
		return pages.userProfilePage;
	}

	public UserManagementPage clickUserManagementLink() {
		userManagementLink.click();
		return pages.userManagementPage;
	}

	public LoginPage clickLogoutLink() {
		logoutLink.click();
		return pages.loginPage;
	}

	public void checkAmountAfter() {
		afterAmountFilms = forAmountFilms.size();
		System.out.println("NewafterAmountFilms " + afterAmountFilms);
	}

	public boolean confirmAmountsAdd() {
		System.out.println("afterAmountFilms " + afterAmountFilms);
		System.out.println("forAmountFilms " + forAmountFilms.size());
		if (afterAmountFilms + 1 == forAmountFilms.size()) {
			return true;
		}
		return false;
	}

	public FilmManagementPage clickToFirstFilm() {
		firstFilm.click();
		return pages.filmManagementPage;
	}

	public boolean confirmAmountsDelete() {
		driver.navigate().refresh();
		pages.internalPage.ensurePageLoaded();
		System.out.println("afterAmountFilms " + afterAmountFilms);
		System.out.println("forAmountFilms " + forAmountFilms.size());
		if (afterAmountFilms - 1 == forAmountFilms.size()) {
			return true;
		}
		return false;
	}
}
