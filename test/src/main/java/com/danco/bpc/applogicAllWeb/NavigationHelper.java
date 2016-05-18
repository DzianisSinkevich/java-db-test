package com.danco.bpc.applogicAllWeb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;

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
		List<String> sessions = new ArrayList<String>();
		List<String> sessionsNumber = new ArrayList<String>();
		List<String> sessionsOpenDate = new ArrayList<String>();
		List<String> sessionsStatuses = new ArrayList<String>();
		int countCompletedClosed = 0;

		pages.monitoringLotesPage.searchButtonClick();
		pages.monitoringLotesPage.selectMaxRowNum();
		for (int i = 1; i <= pages.monitoringLotesPage.countPage(); i++) {
			pages.monitoringLotesPage.pageClick(i);
			
			// sessions.addAll(pages.monitoringLotesPage.readSessions());
			// log.info("-- Read all Session in table is successfully");
			// log.info("-- Count sessions = '" + sessions.size() + "'");
			sessionsNumber.addAll(pages.monitoringLotesPage.readSessionsNumber());
			log.info("-- Read all Session Number in table is successfully");
			log.info("-- Count sessionsNumber = '" + sessionsNumber.size() + "'");
			// sessionsOpenDate.addAll(pages.monitoringLotesPage.readSessionsOpenDate());
			// log.info("-- Read all Open Date in table is successfully");
			// log.info("-- Count sessionsOpenDate = '" + sessionsOpenDate.size() + "'");
			sessionsStatuses.addAll(pages.monitoringLotesPage.readSessionsStatuses());
			log.info("-- Read all Statuses in table is successfully");
			log.info("-- Count sessionsStatuses = '" + sessionsStatuses.size() + "'");
		}
		openIOOperationTMTPage();
		if (sessionsStatuses.size() > 0) {
			log.info("-- Amount of Session more then 0");
			log.info("-- Start adding total cycle");
			for (int i = 0; i < sessionsNumber.size(); i++) {
				log.info("-- Check session status");
				if (sessionsStatuses.get(i).equals("SSSTOPEN")) {
					log.info("-- Session status is OPEN");
					log.info("-- Check Session Number of this session");
					log.info("-- Session Number is '" + sessionsNumber.get(i) + "'");
					log.info("-- Validation Session Number");
					if (sessionsNumber.get(i).length() > 0) {
						if (sessionsNumber.get(i).substring(2, 3).equals("_")
								&& sessionsNumber.get(i).substring(sessionsNumber.get(i).length() - 7, sessionsNumber.get(i).length() - 6).equals("-")) {
							log.info("-- Validation Session Number is successfully");
							pages.iOOperationsTMTPage.clearAllButtonClick();
							pages.iOOperationsTMTPage.sessionIdSendKeys(sessionsNumber.get(i)).searchButtonClick();
							log.info("-- Validation Status field. Expected 'ACTIVE'");
							if (pages.iOOperationsTMTPage.readFirstRowStatus().equals("ACTIVE")) {
								log.info("-- Validation Status field is successfully. Status is 'ACTIVE'");
								pages.iOOperationsTMTPage.firstRowClick().tabTotalsClick().tabTotalsTeButtonClick()
										.teNetPositionSendKeys("" + random.nextInt(9999) + 1);
								pages.iOOperationsTMTPage.teTrSaveClick();
								pages.iOOperationsTMTPage.tabTotalsTrButtonClick().trNetPositionSendKeys("" + random.nextInt(9999) + 1);
								pages.iOOperationsTMTPage.teTrSaveClick();
								countCompletedClosed++;
							} else {
								log.error("-- Validation Status field is failed. Status not 'ACTIVE'");
							}
						} else {
							log.error("-- Validation Session Number is failed");
						}
					}
				} else {
					log.error("-- Session status is not OPEN");
				}
			}
		} else {
			log.error("-- Amount of Session equals 0");
		}
		log.info("COUNT OF CLOSED SESSIONS - " + countCompletedClosed);
	}

}
