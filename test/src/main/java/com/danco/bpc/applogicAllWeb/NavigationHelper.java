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
	public void searchAndCloseTotalSessionsOnlyTMTPage() throws InterruptedException {
		List<String> sessionsID = new ArrayList<String>();
		List<String> existTotals = new ArrayList<String>();
		int countCompletedClosed = 0;
		int recordsNum = 0;
		String s = "";
		boolean te = false;
		boolean tr = false;

		openIOOperationTMTPage();
		pages.iOOperationsTMTPage.filterStatusActiveChoice();
		pages.iOOperationsTMTPage.searchButtonClick();
		recordsNum = pages.iOOperationsTMTPage.countRecords();
		while (recordsNum != 0) {
			sessionsID.clear();
			existTotals.clear();
			
			log.info("-- Read all SessionID in table");
			sessionsID.addAll(pages.iOOperationsTMTPage.readSessions());

			log.info("-- Read all SessionID in table is successfully");
			log.info("-- Count sessionsNumber = '" + sessionsID.size() + "'");
			System.out.println("sessionsID = " + sessionsID.size());
			if (sessionsID.size() > 0) {
				log.info("-- Amount of Session more then 0");
				log.info("-- Start adding total cycle");
				for (int i = 0; i < sessionsID.size(); i++) {
					log.info("-- Session status is OPEN");
					log.info("-- Check Session Number of this session");
					log.info("-- SessionID is '" + sessionsID.get(i) + "'");
					pages.iOOperationsTMTPage.clearAllButtonClick();
					pages.iOOperationsTMTPage.sessionIdSendKeys(sessionsID.get(i)).searchButtonClick();
					if (pages.iOOperationsTMTPage.countRecords() > 0) {
						pages.iOOperationsTMTPage.firstRowClick().tabTotalsClick();
						existTotals.addAll(pages.iOOperationsTMTPage.existTotalsCheck());
						String totalsText = "";
						for (String item : existTotals) {
							totalsText = totalsText + item + " ";
						}
						System.out.println("totalsText = " + totalsText);
						for (int j = 0; j < existTotals.size(); j++) {
							System.out.println("existTotals.get(j)" + existTotals.get(j));
							s = existTotals.get(j);
							if (s.equals("TE")) {
								te = true;
							}
							if (s.equals("TR")) {
								tr = true;
							}
						}
						if (!te) {
							pages.iOOperationsTMTPage.teNetPositionAdd();
						}
						if (!tr) {
							pages.iOOperationsTMTPage.trNetPositionAdd();
						}
						countCompletedClosed++;
					}
				}
			} else {
				log.info("-- Amount of Session equals 0");
			}
			log.info("COUNT OF CLOSED SESSIONS - " + countCompletedClosed);

			pages.iOOperationsTMTPage.searchButtonClick();
			recordsNum = pages.iOOperationsTMTPage.countRecords();
		}
	}

	@Override
	public void testTMTpage() throws InterruptedException {
		List<String> existTotals = new ArrayList<String>();
		String totalsText = "";

		openIOOperationTMTPage();
		pages.iOOperationsTMTPage.searchButtonClick();
		pages.iOOperationsTMTPage.firstRowClick().tabTotalsClick();
		existTotals.addAll(pages.iOOperationsTMTPage.existTotalsCheck());
		for (String item : existTotals) {
			totalsText = totalsText + item + " ";
		}
		System.out.println("totalsText = " + totalsText);
	}
}
