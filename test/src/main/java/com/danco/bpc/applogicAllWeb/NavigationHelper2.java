package com.danco.bpc.applogicAllWeb;

import com.danco.bpc.IApplogicAllWeb.NavigationHelper;

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
	}

	@Override
	public void administrationClick() {
		pages.internalPage.clickAdministration();
	}

	@Override
	public void menuSessionClick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuReconciliationCesesClick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuDatasourcesClick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuRoutingClick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuLogoutClick() {
		// TODO Auto-generated method stub
		
	}

}
