package com.danco.bpc.applogic;

public interface NavigationHelper {

	void openMainPage();

	void openRelativeUrl(String url);

	void gotoUserProfilePage();

	void gotoUserManagementPage();

	void menuClick();

	void menuSessionClick();

	void menuReconciliationCesesClick();

	void menuDatasourcesClick();

	void menuRoutingClick();

	void menuLogoutClick();

}