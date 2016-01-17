package com.danco.bpc.applogic2;

import com.danco.bpc.applogic.NavigationHelper;

public class NavigationHelper2 extends DriverBasedHelper implements NavigationHelper {

	private String baseUrl;

	public NavigationHelper2(ApplicationManager2 manager) {
		super(manager.getWebDriver());
		this.baseUrl = manager.getBaseUrl();
	}

	@Override
	public void openMainPage() {
		driver.get(baseUrl);
	}

	@Override
	public void openRelativeUrl(String url) {
		driver.get(baseUrl + url);
	}

	@Override
	public void gotoUserProfilePage() {
		pages.internalPage.ensurePageLoaded().clickUserProfilePage();
		// driver.findElement(By.cssSelector("nav a[href $= '?go=profile']"))
		// .click();
		// openRelativeUrl("?go=profile");
	}

	@Override
	public void gotoUserManagementPage() {
		pages.internalPage.ensurePageLoaded().clickUserManagementLink();
		// driver.findElement(By.cssSelector("nav a[href $= '?go=users']"))
		// .click();
		// openRelativeUrl("?go=users");
	}

	@Override
	public void menuClick() {
		pages.internalPage.clickMenu();
	}

	@Override
	public void menuSessionClick() {
		pages.internalPage.clickMenu();
		pages.internalPage.clickSessionLink();
	}

	@Override
	public void menuReconciliationCesesClick() {
		pages.internalPage.clickMenu();
		pages.internalPage.clickReconciliationCasesLink();
	}

	@Override
	public void menuDatasourcesClick() {
		pages.internalPage.clickMenu();
		pages.internalPage.clickDatasourcesLink();
	}

	@Override
	public void menuRoutingClick() {
		pages.internalPage.clickMenu();
		pages.internalPage.clickRoutingLink();
	}

	@Override
	public void menuLogoutClick() {
		pages.internalPage.clickMenu();
		pages.internalPage.clickLogoutLink();
	}
}
