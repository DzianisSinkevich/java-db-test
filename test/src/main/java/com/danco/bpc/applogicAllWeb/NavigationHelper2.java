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
	public void administrationProcessesClick() {
		pages.internalPage.clickAdministrationProcesses();
	}

	@Override
	public void openContainersPage() {
		pages.internalPage.clickAdministration().clickAdministrationProcesses().clickAdministrationProcessesContainers();
	}

	@Override
	public void searchAndLaunchContainer(String containerName) throws InterruptedException {
		pages.containersPage.insertDataToNameField(containerName).searchButtonClick().launchButtonClick().launchInFormButtonClick();
	}

	@Override
	public void waitForContainerExecution() throws InterruptedException {
		String ssid = pages.containersPage.checkContainerSession();
		
	}

	@Override
	public void menuSessionClick() {
	}

	@Override
	public void menuReconciliationCesesClick() {
	}

	@Override
	public void menuDatasourcesClick() {
	}

	@Override
	public void menuRoutingClick() {
	}

	@Override
	public void menuLogoutClick() {
	}

	@Override
	public void insertDataToNameField() {
	}

	@Override
	public void clickSearch() {
	}

	@Override
	public void waitDataLoad() {
	}

	@Override
	public void clickLaunchButton() {
	}

	@Override
	public void openDashboardMenu() {
		pages.internalPage.openDashboardMenu();
	}

}
