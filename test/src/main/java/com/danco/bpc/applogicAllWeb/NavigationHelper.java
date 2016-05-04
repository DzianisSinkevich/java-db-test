package com.danco.bpc.applogicAllWeb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.danco.bpc.IApplogicAllWeb.INavigationHelper;

public class NavigationHelper extends DriverBasedHelper implements INavigationHelper {

	private String baseUrl;
	private Logger log = Logger.getLogger("file");

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
		List<WebElement> sessions = new ArrayList<WebElement>();
		List<WebElement> sessionsNumber = new ArrayList<WebElement>();
		List<WebElement> sessionsOpenDate = new ArrayList<WebElement>();
		List<WebElement> sessionsStatuses = new ArrayList<WebElement>();
		sessions = pages.monitoringLotesPage.readSessions();
		log.info("-- Read all Session in table is successfully");
		log.info("-- Count sessions = '" + sessions.size() + "'");
		sessionsNumber = pages.monitoringLotesPage.readSessionsNumber();
		log.info("-- Read all Session Number in table is successfully");
		log.info("-- Count sessionsNumber = '" + sessionsNumber.size() + "'");
		sessionsOpenDate = pages.monitoringLotesPage.readSessionsOpenDate();
		log.info("-- Read all Open Date in table is successfully");
		log.info("-- Count sessionsOpenDate = '" + sessionsOpenDate.size() + "'");
		sessionsStatuses = pages.monitoringLotesPage.readSessionsStatuses();
		log.info("-- Read all Statuses in table is successfully");
		log.info("-- Count sessionsStatuses = '" + sessionsStatuses.size() + "'");
		log.info("-- Check amount of session");
		log.info("-- Amount of Session equals '" + sessionsStatuses.size() + "'");
		if (sessionsStatuses.size() > 0) {
			log.info("-- Amount of Session more then 0");
			log.info("-- Start adding total cicle");
			for (int i = 0; i < sessions.size(); i++) {
				log.info("-- Check session status");
				if (sessionsStatuses.get(i).getText().equals("SSSTOPEN")) {
					log.info("-- Session status is OPEN");
					log.info("-- Check Session Number of this session");
					String sessionNumberS = sessionsNumber.get(i).getText();
					log.info("-- Session Number is '" + sessionNumberS + "'");
					log.info("-- Validation Session Number");
					if (sessionNumberS.length() > 0) {
						if (sessionNumberS.substring(2, 3).equals("_")
								&& sessionNumberS.substring(sessionNumberS.length() - 7, sessionNumberS.length() - 6).equals("-")) {
							log.info("-- Validation Session Number is successfully");
							openIOOperationTMTPage();
							pages.iOOperationsTMTPage.sessionIdSendKeys(sessionNumberS).searchButtonClick().firstRowClick().tabTotalsClick()
									.tabTotalsTeButtonClick().teNetPositionSendKeys("" + random.nextInt(9999) + 1);
							pages.iOOperationsTMTPage.teTrSaveClick();
							pages.iOOperationsTMTPage.clearAllButtonClick();
							pages.iOOperationsTMTPage.sessionIdSendKeys(sessionNumberS).searchButtonClick().tabTotalsClick().tabTotalsTrButtonClick()
									.trNetPositionSendKeys("" + random.nextInt(9999) + 1);
							pages.iOOperationsTMTPage.teTrSaveClick();
						} else {
							log.info("-- Validation Session Number is failed");
						}
					}
				} else {
					log.info("-- Session status is not OPEN");
				}
			}
		} else {
			log.info("-- Amount of Session equals 0");
		}
	}

}
