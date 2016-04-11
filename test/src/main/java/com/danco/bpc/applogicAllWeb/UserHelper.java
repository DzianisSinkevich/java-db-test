package com.danco.bpc.applogicAllWeb;

import com.danco.bpc.IApplogicAllWeb.IUserHelper;
import com.danco.bpc.modelAllWeb.User;
import com.danco.bpc.pagesAllWeb.UserProfilePage;

public class UserHelper extends DriverBasedHelper implements IUserHelper {

	public UserHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
	}

	@Override
	public void loginAs(User user) {
		pages.loginPage.ensurePageLoaded().setUsernameField(user.getLogin()).setPasswordField(user.getPassword()).clickSubmitButton();
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
