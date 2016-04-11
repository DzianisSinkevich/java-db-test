package com.danco.bpc.applogicReconWeb;

import com.danco.bpc.IApplogicReconWeb.IUserHelper;
import com.danco.bpc.modelReconWeb.User;
import com.danco.bpc.pagesReconWeb.UserProfilePage;

public class UserHelper extends DriverBasedHelper implements IUserHelper {

	public UserHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}

	@Override
	public void loginAs(User user) {
		pages.loginPage.ensurePageLoaded().setUsernameField(user.getLogin()).setPasswordField(user.getPassword()).clickSubmitButton();
		// pages.internalPage.checkAmountAfter();
	}

	@Override
	public void logout() {
		pages.internalPage.ensurePageLoaded().clickLogoutLink();
	}

	@Override
	public boolean isLoggedIn() {
		return pages.internalPage.waitPageLoaded();
	}

	@Override
	public boolean isLoggedInAs(User user) {
		return isLoggedIn() && getLoggedUser().getLogin().equals(user.getLogin());
	}

	@Override
	public boolean isNotLoggedIn() {
		return pages.loginPage.waitPageLoaded();
	}

	private User getLoggedUser() {
		UserProfilePage userProfile = pages.internalPage.ensurePageLoaded().clickUserProfilePage().ensurePageLoaded();
		return new User().setLogin(userProfile.getUsername()).setEmail(userProfile.getEmail()).setRole(userProfile.getRole());
	}
}
