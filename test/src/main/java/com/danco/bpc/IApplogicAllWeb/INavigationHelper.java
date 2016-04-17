package com.danco.bpc.IApplogicAllWeb;

public interface INavigationHelper {

	void openMainPage();

	void openRelativeUrl(String url);

	void gotoUserProfilePage();

	void gotoUserManagementPage();

	void menuSessionClick();

	void menuReconciliationCesesClick();

	void menuDatasourcesClick();

	void menuRoutingClick();

	void menuLogoutClick();

	void administrationClick();

	void administrationProcessesClick();
	
	void openIOOperationPricePage();

	void openContainersPage();

	void openDashboardMenu();

	void insertDataToNameField();

	void clickSearch();

	void waitDataLoad();

	void clickLaunchButton();

	void searchAndLaunchContainer(String s) throws InterruptedException;

	String waitForContainerExecution() throws InterruptedException;
}
