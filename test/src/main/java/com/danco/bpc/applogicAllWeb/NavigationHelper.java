package com.danco.bpc.applogicAllWeb;

import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.WebElement;

import com.danco.bpc.IApplogicAllWeb.INavigationHelper;

public class NavigationHelper extends DriverBasedHelper implements INavigationHelper {

	private String baseUrl;

	final Random random = new Random();

	public NavigationHelper(ApplicationManager manager) {
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
	public void openIOOperationTMTPage() {
		pages.internalPage.clickIOOPerations().clickIOOPerationsTMT();
	}

	@Override
	public void openIOOperationPricePage() {
		pages.internalPage.clickIOOPerations().clickIOOPerationsPrice();
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
	public String waitForContainerExecution() throws InterruptedException {
		String ssid = pages.containersPage.checkContainerSession();
		return ssid;
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

	@Override
	public void openMonitoringLotesPage() {
		pages.internalPage.clickMonitoring().clickMonitoringLotes();
	}

	@Override
	public void searchAndCloseTotalSessions() throws InterruptedException {
		pages.monitoringLotesPage.searchButtonClick();
		pages.monitoringLotesPage.selectMaxRowNum();
		ArrayList<WebElement> sessionsStatuses = new ArrayList<WebElement>();
		sessionsStatuses = pages.monitoringLotesPage.readSessionsStatuses();
		if (sessionsStatuses.size() > 0) {
			for (int i = 0; i < sessionsStatuses.size(); i++) {
				if (sessionsStatuses.get(i).getText().equals("Open")) {
					String sessionNumber = pages.monitoringLotesPage.sessionNumberGetText(i);
					openIOOperationTMTPage();
					pages.iOOperationsTMTPage.sessionIdSendKeys(sessionNumber).searchButtonClick().tabTotalsClick().tabTotalsTeButtonClick()
							.teNetPositionSendKeys("" + random.nextInt(9999) + 1);
				}
			}
		}
	}

}
